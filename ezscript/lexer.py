from typing import List

class Token:
    def __init__(self, symbol: str):
        self.symbol: str = symbol
        self.pos = ()
    
    def __str__(self) -> str:
        return f"Token({self.symbol}:{self.pos})"

class Keyword:
    def __init__(self, type: str):
        self.type: str = type
        self.pos = ()
    
    def __str__(self) -> str:
        return f"Keyword({self.type}:{self.pos})"

class Idenifier:
    def __init__(self, name: str):
        self.name: str = name
        self.pos = ()
    
    def __str__(self) -> str:
        return f"Idenifier({self.name}:{self.pos})"

class Operator:
    def __init__(self, op: str):
        self.op: str = op
        self.pos = ()
    
    def __str__(self) -> str:
        return f"Operator({self.op}:{self.pos})"

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
    "func",
    "if",
    "for",
    "while",
    "end",
    "return",
    "import"
]

OPERATORS = [
    '-',
    '+',
    '/',
    '*',
    '=',
    '(',
    ')',
    '[',
    ']',
    '.',
    '>',
    '<'
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
        self.isComment = False

    def tokenise(self, line: str, linePos: int) -> List[Token]:
        keywordBuffer = ""
        ideniferBuffer = ""
        self.isComment = False
        kw = False
        for char in line:
            isStr = False
            isNumber = False
            isOp = False

            self.colPos += 1
            isStr = self.doString(char, line, linePos)
            if not self.isInString:
                isNumber = self.doNumber(char, line, linePos)
            if not isNumber and not self.isInString and not isStr:
                if char == "#":
                    self.isComment = True
                if not self.isComment:
                    for operator in OPERATORS:
                        if char == operator:
                            opper = Operator(operator)
                            opper.pos = (linePos, self.colPos)
                            self.tree.append(opper)
                            isOp = True

                    if char != " " and not isOp:
                        keywordBuffer += char
                    for keyword in KEYWORDS:
                        if keywordBuffer == keyword:
                            kword = Keyword(keyword)
                            kword.pos = (linePos, self.colPos)
                            self.tree.append(kword)
                            kw = True
                            keywordBuffer = ""
                            ideniferBuffer = ""
                    if char != " " and not isOp and not kw:
                        ideniferBuffer += char
                    if (line[self.colPos-1] == " " and not kw) or isOp:
                        if ideniferBuffer != "":
                            isFormatString = False
                            if ideniferBuffer == "f":
                                line[self.colPos] == "\""
                                isFormatString = True
                            if not isFormatString and not isOp:
                                ident = Idenifier(ideniferBuffer)
                                ident.pos = (linePos, self.colPos)
                                self.tree.append(ident)
                            if not isFormatString and isOp:
                                ident = Idenifier(ideniferBuffer)
                                ident.pos = (linePos, self.colPos-len(ideniferBuffer))
                                self.tree.insert(len(self.tree)-1, ident)
                            ideniferBuffer = ""

        return self.tree
    
    def doString(self, char: str, line:str, linePos:int):
        if not self.isComment:
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
                    return True
            if self.isInString:
                self.out += char
    
    def doNumber(self, char: str, line:str, linePos:int):
        if char.isnumeric():
            token = DigitLiteral(int(char))
            token.pos = (linePos, self.colPos)
            self.tree.append(token)
            return True