parser grammar ExprParser;
options { tokenVocab=ExprLexer; }

program
    : stat* EOF
    ;

stat
    : expr '\n'?
    ;

expr
    : ID
    | INT
    | FLOAT
    | COMPLEX
    | expr ('+' | '-' | '*' | '/') expr
    | '('expr')'
   ;
