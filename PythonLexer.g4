lexer grammar ExprLexer;


ASSIGN : '=' ;
SEMI : ';' ;
ADD : '+' ;
SUB : '-';
MULT : '*';
DIV : '/';

AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;

LB : '\n';
OB : '(';
CB : ')';

INT : [0-9]+ ;
FLOAT : INT '.' INT ;
REAL : INT | FLOAT ;
COMPLEX : REAL ('+'|'-') REAL'j';
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
WS: [ \t\r\f]+ -> skip ;

