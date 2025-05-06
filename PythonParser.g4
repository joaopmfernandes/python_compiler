parser grammar ExprParser;
options { tokenVocab=ExprLexer; }

program
    : stat+ EOF
    ;

stat
    : ID '=' expr ';'
    | ID '+' ID';'
    | expr ';'
    ;

expr
    : ID
    | INT
   ;
