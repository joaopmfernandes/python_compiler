parser grammar PythonParser;
options { tokenVocab=PythonLexer; }

program
    : (stat | conditional | func | func_call | loop_while | loop_for)* EOF
    ;

stat
    : RETURN query LB?
    | query LB?
    | ID ASSIGN query LB
    | LB
    ;


conditional
    : if_elif_else
    ;

loop_for
    : FOR ID IN RANGE OB expr (COMMA expr (COMMA expr)?)? CB COLON LB (INDENT stat)+
    ;

loop_while
    : WHILE OB? query CB? COLON LB (INDENT? stat)+ ;

if_elif_else : IF OB? query CB? COLON LB+ (INDENT? stat)+ (ELIF OB? query CB? COLON LB (INDENT? stat)+)* (ELSE COLON LB (INDENT? stat)+)?
    ;


func : DEF ID OB ID (COMMA ID)* CB COLON (RETURN query | LB (INDENT? stat)+)  ;

func_call : ID OB query (COMMA query)*  CB ;

expr
    : ID
    | SUB? INT
    | SUB? FLOAT
    | COMPLEX
    | expr (ADD | SUB | MULT | DIV | POW) expr
    | OB expr CB
    | func_call
    ;


query
    : expr
    | BOOL
    | query BOOLOP query
    | NOT query
    | OB query CB
    | query (RELATION query)+
    ;
