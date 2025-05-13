parser grammar ExprParser;
options { tokenVocab=ExprLexer; }

program
    : stat* EOF
    ;

stat
    : (expr | query) '\n'?
    ;

expr
    : ID
    | INT
    | FLOAT
    | COMPLEX
    | expr ('+' | '-' | '*' | '/') expr
    | '('expr')
    ;

query
    : BOOL
    | (NOT? query Boolop NOT? query)+
    | '('query')'
    | expr RELATION expr
    ;
