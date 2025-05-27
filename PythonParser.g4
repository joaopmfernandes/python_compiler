parser grammar ExprParser;
options { tokenVocab=ExprLexer; }

program
    : (stat | conditional)* EOF
    ;

stat
    : query LB?
    | ID ASSIGN query LB
    | LB
    ;


conditional
    : if_elif_else
    ;



if_elif_else : IF OB? query CB? COLON LB (INDENT stat)+ (ELIF OB? query CB? COLON LB (INDENT stat)+)* (ELSE COLON LB (INDENT stat)+)?
    ;


expr
    : ID
    | INT
    | FLOAT
    | COMPLEX
    | expr (ADD | SUB | MULT | DIV) expr
    | OB expr CB
    ;


query
    : expr
    | BOOL
    | query BOOLOP query
    | NOT query
    | OB query CB
    | query (RELATION query)+
    ;

