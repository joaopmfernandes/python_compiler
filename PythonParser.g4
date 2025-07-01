parser grammar PythonParser;

options { tokenVocab=PythonLexer; }

program
    : (stat | conditional | func | func_call | loop_while | loop_for | import_stat)* EOF
    ;

stat
    : RETURN query NEWLINE?
    | query NEWLINE?
    | ID ASSIGN query NEWLINE
    | NEWLINE
    ;

conditional
    : if_elif_else
    ;

import_stat
    : IMPORT module_name (AS ID)? NEWLINE
    | FROM module_name IMPORT import_list NEWLINE
    ;

module_name
    : ID (DOT ID)*
    ;

import_list
    : ID (AS ID)?
    | MULT  // para import *
    | LPAREN ID (COMMA ID)* RPAREN
    ;

loop_for
    : FOR ID IN RANGE LPAREN expr (COMMA expr (COMMA expr)?)? RPAREN COLON NEWLINE (INDENT stat)+
    ;

loop_while
    : WHILE LPAREN? query RPAREN? COLON NEWLINE (INDENT? stat)+
    ;

if_elif_else
    : IF LPAREN? query RPAREN? COLON NEWLINE+ (INDENT? stat)+
      (ELIF (LPAREN? query RPAREN?)? COLON NEWLINE (INDENT? stat)+)*
      (ELSE COLON NEWLINE (INDENT? stat)+)?
    ;

func
    : DEF ID LPAREN (ID (COMMA ID)*)? RPAREN COLON
      (RETURN query | NEWLINE (INDENT? stat)+)
    ;

func_call
    : ID LPAREN (query (COMMA query)*)? RPAREN
    ;

expr
    : ID
    | SUB? INT
    | SUB? FLOAT
    | expr (ADD | SUB | MULT | DIV | POW) expr
    | LPAREN expr RPAREN
    | func_call
    ;

query
    : expr
    | BOOL
    | query (AND | OR) query
    | NOT query
    | LPAREN query RPAREN
    | query (EQUAL | GREATER | LOWER | GREATER_EQUAL | LOWER_EQUAL | NEQ)+ query
    ;
