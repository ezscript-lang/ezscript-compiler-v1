#pragma once
#include <iostream>
#include <optional>
#include <sstream>

namespace err 
{
    std::string caret_display(size_t pos, size_t width = 1, size_t offset = 0) {
        std::stringstream output;
        output << std::string((offset) - 2, ' ');
        output << '|';
        if (width == 1) {
            output << std::string((pos) + 2 , ' ') << '^';
        } else {
            output << std::string((pos - width) + 2, ' ')
                << std::string(width, '^');
        }
        return output.str();
    };

    std::string caret_to_line(const std::string &str, size_t pos, size_t line = 1, size_t line_start = 0, size_t width = 1) {
        std::stringstream output;
        std::string line_str = std::to_string(line) + " | ";
        output << line_str
                << str.substr(line_start, str.find('\n', line_start) - line_start)
                << std::endl;
        output << caret_display(pos - line_start - 1, width, line_str.size());
        return output.str();
    };

    std::string make_error(const std::string &src, const std::string &file, const std::string &error, size_t pos, size_t line = 1, size_t width = 1) {
        std::stringstream output;
        size_t line_start = 0;
        size_t char_pos = 0;
        for (size_t i = 0; i < pos; i++) {
            if (src.at(i) == '\n') {
                line++;
                char_pos = 0;
                line_start = i + 1;
            }
            char_pos ++;
        }
        output << file << ":" << line << ":" << char_pos << ": error: " << error << std::endl;
        output << caret_to_line(src, pos, line, line_start, width);
        return output.str();
    }
}