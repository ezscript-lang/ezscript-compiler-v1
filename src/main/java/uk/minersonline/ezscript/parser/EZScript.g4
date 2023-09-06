grammar EZScript;

input
    : program
    ;

program : (expression SEMI)* EOF;

expression
    : assignment
    | functionCall
    | equation
    ;


assignment
    : LET identifer EQ expression
    ;

func_
    : atom
    | LPAREN equation RPAREN
    ;

signExpression
    : (PLUS | MINUS)? func_
    ;

addingExpression
    : multiplyingExpression (operator=(PLUS | MINUS) multiplyingExpression)* # AdditionOrSubtraction
    ;

multiplyingExpression
    : powExpression (operator=(STAR | SLASH) powExpression)* # MultiplicationOrDivision
    ;

powExpression
    : signExpression (operator=CARET signExpression)* # Power
    ;

equation
    : func_
    | addingExpression
    ;

atom
    :  ('+' | '-')? NUMBER
    ;


identifer
    : IDENIFIER
    ;

// We define functionCall to be a method name followed by an opening
// paren, an optional list of arguments, and a closing paren.
functionCall
    : identifer LPAREN functionCallArguments RPAREN
    ;

// We define functionCallArguments to be a list of expressions
// separated by commas.
functionCallArguments
    : // No arguments
    | ( functionCall | func_ | IDENIFIER ) (',' ( functionCall | func_ | IDENIFIER ))*  // Some arguments
    ;

LET
    : 'let'
    ;

LPAREN
    : '('
    ;


RPAREN
    : ')'
    ;

SEMI
     : ';'
     ;

PLUS
    : '+'
    ;


MINUS
    : '-'
    ;


STAR
    : '*'
    ;


SLASH
    : '/'
    ;


CARET
    : '^'
    ;


EQ
    : '='
    ;


COMMA
    : ','
    ;


POINT
    : '.'
    ;

IDENIFIER
    : VALID_ID_START VALID_ID_CHAR*
    ;


fragment VALID_ID_START
    : 'a' .. 'z' | 'A' .. 'Z' | '_'
    ;


fragment VALID_ID_CHAR
   : VALID_ID_START
   | '0' .. '9'
   ;

NUMBER
    : '0'..'9'+ ('.' '0'..'9'+ )?
    ;


fragment E1
    : 'E'
    ;


fragment E2
    : 'e'
    ;


fragment SIGN
    : '+' | '-'
    ;


Whitespace
    :   [ \t]+ -> channel(HIDDEN)
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> channel(HIDDEN)
    ;

BlockComment
    :   '/*' .*? '*/'
        -> channel(2)
    ;

LineComment
    :   '//' ~[\r\n]*
        -> channel(2)
    ;