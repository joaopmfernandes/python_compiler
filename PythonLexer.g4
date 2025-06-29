lexer grammar PythonLexer;

FOR   : 'for' ;
IN    : 'in' ;
RANGE : 'range' ;
IF : 'if' ;
ELSE : 'else' ;
ELIF : 'elif' ;
WHILE : 'while' ;
DEF : 'def' ;
RETURN : 'return' ;
AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;

ASSIGN
  : '='
  | '+='
  | '-='
  | '*='
  | '/='
  | '//='
  | '%='
  | '**='
  ;

COLON : ':' ;
SEMI : ';' ;
ADD : '+' ;
SUB : '-' ;
MULT : '*' ;
POW : '**' ;
DIV : '/' ;
COMMA : ',' ;

GREATER : '>' ;
LOWER : '<' ;
EQUAL : '==' ;
GREATER_EQUAL : '>=' ; 
LOWER_EQUAL : '<=' ;
NEQ : '!=' ;

NEWLINE : '\n' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;
LBRACK : '[' ;
RBRACK : ']' ;

// Palavras reservadas
INDENT : '\t' | '    ' ;
BOOL : 'True' | 'False' ;
FLOAT : [0-9]+ '.' [0-9]+ ;
INT : [0-9]+ ;
ID : [a-zA-Z_][a-zA-Z_0-9]* ;
STRING : '"' (ESC | ~["\\])* '"' | '\'' (ESC | ~['\\])* '\'' ;

// Espaços em branco e comentários
WS : [ \t\r]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;

fragment ESC : '\\' [btnfr\\] ;
