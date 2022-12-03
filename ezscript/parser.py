from .lexer import *

def parse(line: str, linePos: int):
    lexer = Lexer()
    for token in lexer.tokenise(line, linePos):
        print(token)

def parseFile(name: str):
    with open(name) as file:
        lines = file.readlines()
        lCount = 0
        for line in lines:
            lCount += 1
            parse(line, lCount)

