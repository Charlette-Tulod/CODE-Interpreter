grammar Simple;

// Lexer rules
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+;
CHAR: '\'' . '\'';
STRING: '"' .*? '"';
BOOL: 'TRUE' | 'FALSE';
BEGIN: 'BEGIN';
END: 'END';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

// Parser rules
start: BEGIN line* END EOF;
line: NEWLINE | statement;
statement: assignment;
assignment: datatype IDENTIFIER '=' expression ';';
datatype: 'INT' | 'FLOAT' | 'CHAR' | 'STRING' | 'BOOL';
data: INT | FLOAT | CHAR | STRING | BOOL;
expression: IDENTIFIER | data;
NEWLINE: '\r'? '\n';

// Whitespace and comment rules
WS: [ \t]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;