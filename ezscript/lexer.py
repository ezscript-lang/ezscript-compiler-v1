from typing import List

class Token:
    def __init__(self, symbol: str):
        self.symbol: str = symbol
        self.startPos = ()
        self.endPos = ()
    
    def __str__(self) -> str:
        return f"Token({self.symbol}:{self.startPos}-{self.endPos})"

class StringLiteral(Token):
    def __init__(self, value: str, mode: str):
        self.value:str = value
        self.startPos = ()
        self.endPos = ()
        self.mode = mode
    
    def __str__(self) -> str:
        return f"StringLiteral({self.mode} {self.value}:{self.startPos}-{self.endPos})"

class DigitLiteral(Token):
    def __init__(self, value: int):
        self.value:int = value
        self.pos = ()
    
    def __str__(self) -> str:
        return f"DigitLiteral({self.value}:{self.pos})"    


KEYWORDS = [
    Token("func"),
    Token("if"),
    Token("for"),
    Token("while"),
    Token("end"),
    Token("return")
]

SYMBOLS = [
    Token("+"),
    Token("-"),
    Token("*"),
    Token("/"),
    Token("="),
    Token(">"),
    Token("<"),
    Token("("),
    Token(")")
]


class Lexer:
    def __init__(self) -> None:
        self.isInString = False
        self.quoteCount = 0
        self.tree = []
        self.colPos = 0
        self.colStartPos = 0
        self.out = ""
        self.stringMode = "normal"

    def tokenise(self, line: str, linePos: int) -> List[Token]:
        for char in line:
            self.colPos += 1
            self.doString(char, line, linePos)
            if not self.isInString:
                self.doNumber(char, line, linePos)

        return self.tree
    
    def doString(self, char: str, line:str, linePos:int):
        ## String Lexing
        if char == "\"":
            self.isInString = True
            if self.quoteCount == 0:
                self.colStartPos = self.colPos
                self.stringMode = "normal"
                if line[self.colStartPos-2] == "f":
                    self.stringMode = "format"
            self.quoteCount += 1
            if self.isInString and self.quoteCount == 2:
                self.quoteCount = 0
                self.isInString = False

                token = StringLiteral(self.out+"\"", self.stringMode)
                token.startPos = (linePos, self.colStartPos)
                token.endPos = (linePos, self.colPos)
                self.tree.append(token)
                self.out = ""
        if self.isInString:
            self.out += char
    
    def doNumber(self, char: str, line:str, linePos:int):
        ## Number Lexing
        if char.isnumeric():
            token = DigitLiteral(int(char))
            token.pos = (linePos, self.colPos)
            self.tree.append(token)