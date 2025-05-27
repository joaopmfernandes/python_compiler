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
  ;

COLON : ':';
SEMI : ';' ;
ADD : '+' ;
SUB : '-';
MULT : '*';
DIV : '/';
COMMA : ',' ;

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

IF : 'if' ;
ELSE : 'else';
ELIF: 'elif';


DEF : 'def';

INDENT : '\t' | '    ';
BOOL : 'True' | 'False' ;
INT : [0-9]+ ;
FLOAT : INT '.' INT ;
REAL : INT | FLOAT ;
COMPLEX : REAL ('+'|'-') REAL'j';
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
