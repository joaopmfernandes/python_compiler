lexer grammar PythonLexer;

FOR   : 'for' ;
IN    : 'in' ;
RANGE : 'range' ;
IF : 'if' ;
ELSE : 'else';
ELIF: 'elif';
WHILE: 'while';
DEF : 'def';
RETURN : 'return';
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

COLON : ':';
SEMI : ';' ;
ADD : '+' ;
SUB : '-';
MULT : '*';
POW : '**';
DIV : '/';
COMMA : ',' ;

BOOLOP : AND | OR ;


RELATION : GREATER | LOWER | EQUAL | GREATER_EQUAL | LOWER_EQUAL | NEQ;
GREATER : '>' ;
LOWER : '<' ;
EQUAL : '==' ;
GREATER_EQUAL : '>='; 
LOWER_EQUAL : '<=' ;
NEQ : '!=';

LB : '\n';
OB : '(';
CB : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';


// Palavras reservadas
INDENT : '\t' | '    ';
BOOL : 'True' | 'False' ;
INT : [0-9]+ ;
FLOAT : INT '.' INT ;
REAL : INT | FLOAT ;
COMPLEX : REAL ('+'|'-') REAL'j';
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
STRING : '"' (ESC | ~["\\])* '"' | '\'' (ESC | ~['\\])* '\'';

// Espaços em branco e comentários
WS : [ \t\r]+ -> skip;
COMMENT : '#' ~[\r\n]* -> skip;
fragment ESC : '\\' [btnfr\\];
