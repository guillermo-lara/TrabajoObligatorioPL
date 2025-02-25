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
CTELIST: ((ID) ('=') (SIMPVALUE) (';')) | ((CTELIST) (ID) ('=') SIMPVALUE (';'));
SIMPVALUE: CONSTINT| CONSTREAL| CONSTLIT;
DEFVAR: ('VAR') (DEFVARLIST) (';');
DEFVARLIST : ((VARLIST) (':') (TBAS)) | (DEFVARLIST) (';') (VARLIST) (':') (TBAS);
VARLIST: ID | (ID) (',') (VARLIST);
DEFPROC: ('PROCEDURE') (ID) (FORMAL_PARAMLIST) (';') (BLQ) (';');
DEFFUN: (FUNCTION) (ID) (FORMAL_PARAMLIST) (':') (TBAS) (';') (BLQ) (';');
FORMAL_PARAMLIST: 'ʎ' | ('(') (FORMAL_PARAM) (')');
FORMAL_PARAM: ((VARLIST) (':') (TBAS))| (VARLIST) (':') (TBAS) (';') (FORMAL_PARAM);
TBAS: 'INTEGER' | 'REAL';

SENT: (ASIG) (';') | (PROC_CALL) (';');
ASIG: (ID) (':=') (EXP);
EXP: ((EXP) (OP) (EXP)) | FACTOR;
OP: OPARIT;
OPARIT: '+' | '-'| '*' | 'DIV' | 'MOD';
FACTOR: SIMPVALUE | (('(') (EXP) (')')) | ((ID) (SUBPARAMLIST));
SUBPARAMLIST: 'ʎ' | ('(') (EXPLIST) (')');
EXPLIST: EXP | ((EXP) (',') (EXPLIST));
PROC_CALL: (ID) (SUBPARAMLIST);


