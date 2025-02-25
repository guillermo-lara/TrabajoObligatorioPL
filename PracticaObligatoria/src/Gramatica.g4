grammar Gramatica;

axioma:(ID|CONSTINT|CONSTREAL|CONSTLI|COMENTARIO1L|COMENTARIOVL)+;

ID: [a-no-zA-NO-Z][a-no-zA-NO-Z0-9_]+{};
CONSTINT:('+'|'-')? [0-9]+{};
CONSTREAL: ('+'|'-')? [0-9]+ ('.'|(('e'|'E')('+'|'-')?)|'.'[0-9]+ (('e'|'E')('+'|'-')?)) [0-9]+{};
CONSTLI:('\'')([a-no-zA-NO-Z.,_0-9]+ ('\''))+ ('\'') {};
COMENTARIO1L: ('{') [~\n]+ ('}') {}; // No debe reconocer saltos de lineas
COMENTARIOVL: ('*') [~*]+ ('*') {};

PRG: ('program') (ID) (';') (BLQ) ('.');
BLQ: (DCLLIST) ('begin') (SENTLIST) ('end');
DCLLIST: ('ʎ' | (DCLLIST) (DCL));
SENTLIST: (SENT | (SENTLIST) (SENT));

DCL:( DEFCTE | DEFVAR | DEFPROC | DEFFUN);
DEFCTE: ('CONST') (CTELIST);
CTELIST: (ID) ('=') simpvalue ";"
| ctelist ID "=" simpvalue ";"
simpvalue ::= CONSTINT| CONSTREAL
| CONSTLIT
defvar ::= "var" defvarlist ";"
defvarlist ::= varlist ":" tbas
| defvarlist ";" varlist ":" tbas
varlist ::= ID | ID "," varlist
defproc ::= "procedure" ID formal_paramlist ";" blq ";"
deffun ::= "function" ID formal_paramlist ":" tbas ";" blq ";"
formal_paramlist ::= ʎ | "(" formal_param ")"
formal_param ::= varlist ":" tbas
 | varlist ":" tbas ";" formal_param
tbas ::= "INTEGER" | "REAL"


