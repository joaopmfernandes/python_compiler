parser grammar ExprParser;
options { tokenVocab=ExprLexer; }

program
    : (stat | conditional)* EOF
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
    | '(' expr ')'
    ;

query
    : expr
    | BOOL
    | (NOT? query Boolop NOT? query)+
    | '(' query ')'
    | query (RELATION query)+
    ;
