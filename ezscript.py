from ezscript import parser
import sys

def main():
    while True:
        line = input("ezscipt> ")
        parser.parse(line, 1)

if __name__ == "__main__":
    if len(sys.argv) > 1:
        parser.parseFile(sys.argv[1])