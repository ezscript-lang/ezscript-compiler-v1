from typing import List
from enum import Enum
import sys


class TokenType(Enum):
    PRINT_RAW = 1
    EXIT = 2
    INT_LIT = 3
    SEMI = 4
    OPEN_PAREN = 5
    CLOSE_PAREN = 6
    IDENT = 7
    LET = 8
    EQ = 9
    PLUS = 10
    STAR = 11
    MINUS = 12
    F_SLASH = 13
    OPEN_CURLY = 14
    CLOSE_CURLY = 15
    IF = 16


def bin_prec(type: TokenType) -> (int | None):
    """
    Return the precedence of a binary operator based on its TokenType.

    :param type: The TokenType of the binary operator.
    :type type: TokenType

    :return: The precedence of the binary operator, or None if the TokenType is not a binary operator.
    :rtype: (int | None)
    """
    if type == TokenType.MINUS or type == TokenType.PLUS:
        return 0
    elif type == TokenType.F_SLASH or type == TokenType.STAR:
        return 1
    return None


class Token:
    type: TokenType
    value: (str | None)

    def __init__(self, type: TokenType, value: (str | None)) -> None:
        """
        Initialise a Token instance with the given type and value.
        
        :param type: The type of the token.
        :type type: TokenType
        :param value: The value of the token.
        :type value: str or None
        """       
        self.type = type
        self.value = value


class Tokeniser:
    def __init__(self, src: str) -> None:
        """
        Initialises a Tokeniser instance with the given source string.

        :param src: The source string to be tokenised.
        :type src: str
        """    
        self.src = src
        self.m_index = 0

    def tokenise(self) -> List[Token]:
        """
        Tokenises the input string and returns a list of tokens.
        
        :return: A list of Token objects representing the tokens in the input string.
        :rtype: List[Token]
        """
        tokens: List[Token] = []
        buf: str = ""
        while self.peek() != None:
            if self.peek() != None and self.peek().isalpha():
                buf = buf + self.consume()
                while self.peek() != None and self.peek().isalpha():
                    buf = buf + self.consume()
                if buf == "exit":
                    tokens.append(Token(TokenType.EXIT, None))
                    buf = ""
                elif buf == "printRaw":
                    tokens.append(Token(TokenType.PRINT_RAW, None))
                    buf = ""
                elif buf == "let":
                    tokens.append(Token(TokenType.LET, None))
                    buf = ""
                elif buf == "if":
                    tokens.append(Token(TokenType.IF, None))
                    buf = ""
                else:
                    tokens.append(Token(TokenType.IDENT, buf))
                    buf = ""
            elif self.peek() != None and self.peek().isdigit():
                buf = buf + self.consume()
                while self.peek() != None and self.peek().isdigit():
                    buf = buf + self.consume()
                tokens.append(Token(TokenType.INT_LIT, buf))
                buf = ""
            elif self.peek() == '(':
                self.consume()
                tokens.append(Token(TokenType.OPEN_PAREN, None))
            elif self.peek() == ')':
                self.consume()
                tokens.append(Token(TokenType.CLOSE_CURLY, None))
            elif self.peek() == ';':
                self.consume()
                tokens.append(Token(TokenType.SEMI, None))
            elif self.peek() == '=':
                self.consume()
                tokens.append(Token(TokenType.EQ, None))
            elif self.peek() == '+':
                self.consume()
                tokens.append(Token(TokenType.PLUS, None))
            elif self.peek() == '*':
                self.consume()
                tokens.append(Token(TokenType.STAR, None))
            elif self.peek() == '-':
                self.consume()
                tokens.append(Token(TokenType.MINUS, None))
            elif self.peek() == '/':
                self.consume()
                tokens.append(Token(TokenType.F_SLASH, None))
            elif self.peek() == '{':
                self.consume()
                tokens.append(Token(TokenType.OPEN_CURLY, None))
            elif self.peek() == '}':
                self.consume()
                tokens.append(Token(TokenType.CLOSE_CURLY, None))
            elif self.peek() != None and self.peek().isspace():
                self.consume()
            else:
                print("You messed up!")
                sys.exit(1)
        self.m_index = 0
        return tokens

    def peek(self, offset: int = 0) -> (str | None):
        """
        Return the character at the specified offset from the current index.
        
        :param offset: The offset from the current index. Defaults to 0.
        :type offset: int, optional
        
        :return: The character at the specified offset from the current index, or None if the offset is out of range.
        :rtype: str or None
        """
        if (self.m_index + offset) >= len(self.src):
            return None
        return self.src[self.m_index + offset]
    
    def consume(self) -> str:
        """
        Increments the index of the `src` list by 1 and returns the element at the new index.

        :return: The element at the new index of the `src` list.
        :rtype: str
        """
        self.m_index += 1
        return self.src[self.m_index]
