#pragma once

#include <string>
#include <vector>
#include "./errors.hpp"

enum class TokenType { exit, printRaw, int_lit, semi, open_paren, close_paren, ident, let, eq, plus };

struct Token {
    size_t index;
    TokenType type;
    std::optional<std::string> raw {};
    std::optional<std::string> value {};
};

class Tokenizer {
public:
    inline explicit Tokenizer(std::string src, std::string file)
        : m_src(std::move(src))
        , m_file(file)
    {
    }

    inline std::vector<Token> tokenize()
    {
        std::vector<Token> tokens;
        std::string buf;
        while (peek().has_value()) {
            if (std::isalpha(peek().value())) {
                buf.push_back(consume());
                while (peek().has_value() && std::isalnum(peek().value())) {
                    buf.push_back(consume());
                }
                if (buf == "exit") {
                    tokens.push_back({ .index = m_index, .type = TokenType::exit, .raw = "exit"  });
                    buf.clear();
                    continue;
                }
                else if (buf == "printRaw") {
                    tokens.push_back({ .index = m_index, .type = TokenType::printRaw, .raw = "printRaw" });
                    buf.clear();
                    continue;
                }
                else if (buf == "let") {
                    tokens.push_back({ .index = m_index, .type = TokenType::let, .raw = "let" });
                    buf.clear();
                    continue;
                }
                else {
                    tokens.push_back({ .index = m_index, .type = TokenType::ident, .raw = buf.c_str(), .value = buf });
                    buf.clear();
                    continue;
                }
            }
            else if (std::isdigit(peek().value())) {
                buf.push_back(consume());
                while (peek().has_value() && std::isdigit(peek().value())) {
                    buf.push_back(consume());
                }
                tokens.push_back({ .index = m_index, .type = TokenType::int_lit, .raw = buf.c_str(), .value = buf });
                buf.clear();
                continue;
            }
            else if (peek().value() == '(') {
                consume();
                tokens.push_back({ .index = m_index, .type = TokenType::open_paren, .raw = "(" });
                continue;
            }
            else if (peek().value() == ')') {
                consume();
                tokens.push_back({ .index = m_index, .type = TokenType::close_paren, .raw = ")" });
                continue;
            }
            else if (peek().value() == ';') {
                consume();
                tokens.push_back({ .index = m_index, .type = TokenType::semi, .raw = ";" });
                continue;
            }
            else if (peek().value() == '=') {
                consume();
                tokens.push_back({ .index = m_index, .type = TokenType::eq, .raw = "=" });
                continue;
            }
            else if (peek().value() == '+') {
                consume();
                tokens.push_back({ .index = m_index, .type = TokenType::plus, .raw = "+" });
                continue;
            }
            else if (std::isspace(peek().value())) {
                consume();
                continue;
            }
            else {
                std::cerr << err::make_error(m_src, m_file, "Unexpected character", m_index, 1, 1) << std::endl;
                exit(EXIT_FAILURE);
            }
        }
        m_index = 0;
        return tokens;
    }

private:
    [[nodiscard]] inline std::optional<char> peek(int offset = 0) const
    {
        if (m_index + offset >= m_src.length()) {
            return {};
        }
        else {
            return m_src.at(m_index + offset);
        }
    }

    inline char consume()
    {
        return m_src.at(m_index++);
    }

    const std::string m_src;
    const std::string m_file;
    size_t m_index = 0;
};