parser grammar ExprParser;
options { tokenVocab=ExprLexer; }

program
    : (stat | conditional)* EOF
    ;

stat
    : (expr | query) '\n'?
    ;


conditional
    : if_stat
    | if_mult_elif_else
    ;

if_stat : 'if' OB query CB ':' LB (INDENT assign_expr)+

if_else :  if_stat LB 'else:' (INDENT assign_expr)+

if_elif_else : if_stat LB ('elif' OB query CB ':' LB (INDENT assign_expr)+ LB)*




assign_expr
    : expr ASSIGN expr LB?

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

if
    
