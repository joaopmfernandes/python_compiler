lexer grammar ExprLexer;


ASSIGN
  : '='
  | '+='
  | '-='
  | '*='
  | '/='
  | '//='
  | '%='
  | '**='


SEMI : ';' ;
ADD : '+' ;
SUB : '-';
MULT : '*';
DIV : '/';

BOOLOP : AND | OR ;
AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;

RELATION : GREATER | LOWER | EQUAL | GREATER_EQUAL | LOWER_EQUAL;
GREATER : '>' ;
LOWER : '<' ;
EQUAL : '==' ;
GREATER_EQUAL : '>='; 
LOWER_EQUAL : '<=' ;


LB : '\n';
OB : '(';
CB : ')';



INDENT : '\t' ;
BOOL : 'True' | 'False' ;
INT : [0-9]+ ;
FLOAT : INT '.' INT ;
REAL : INT | FLOAT ;
COMPLEX : REAL ('+'|'-') REAL'j';
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
WS: [ \t\r\f]+ -> skip ;

