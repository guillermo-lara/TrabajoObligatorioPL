grammar Gramatica;

@members{

}

axioma:(ID|CONSTINT|CONSTREAL|CONSTLI|COMENTARIO1L|COMENTARIOVL|PRG|BLQ|DCLLIST|SENTLIST|SENTLISTP|DCL|DEFCTE|CTELIST|CTELISTP|SIMPVALUE|DEFVAR|DEFVARLIST|DEFVARLISTP|VARLIST|DEFPROC|DEFFUN|FORMAL_PARAMLIST|FORMAL_PARAM|TBAS|SENT|ASIG|EXP|EXPP|OP|OPARIT|FACTOR|SUBPARAMLIST|EXPLIST|PROC_CALL|SALTAR)+;

ID: [a-no-zA-NO-Z][a-no-zA-NO-Z0-9_]+{};
CONSTINT:('+'|'-')? [0-9]+{};
CONSTREAL: ('+'|'-')? [0-9]+ ('.'|(('e'|'E')('+'|'-')?)|'.'[0-9]+ (('e'|'E')('+'|'-')?)) [0-9]+{};
CONSTLI:('\'')([a-no-zA-NO-Z.,_0-9]+ ('\''))+ ('\'') {};
COMENTARIO1L: ('{') [~\n]+ ('}') {}; // No debe reconocer saltos de lineas
COMENTARIOVL: ('*') [~*]+ ('*') {};

PRG: ('program') (ID) (';') (BLQ) ('.');
BLQ: (DCLLIST) ('begin') (SENTLIST) ('end');
DCLLIST: ('ʎ') |  ((DCL) (DCLLIST));
SENTLIST: (SENT)  (SENTLISTP) ;
SENTLISTP: ((SENT) (SENTLISTP)| ('ʎ'));

DCL:(DEFCTE | DEFVAR | DEFPROC | DEFFUN);
DEFCTE: ('CONST') (CTELIST);
CTELIST: ((ID) ('=') (SIMPVALUE) (';')) | ((ID) ('=') SIMPVALUE (';') (CTELISTP) );
CTELISTP: ((ID) ('=') SIMPVALUE (';') (CTELISTP)) | ('ʎ');
SIMPVALUE: CONSTINT| CONSTREAL| CONSTLI;
DEFVAR: ('VAR') (DEFVARLIST) (';');
DEFVARLIST : ((VARLIST) (':') (TBAS)) | ((';') (VARLIST) (':') (TBAS)(DEFVARLISTP));
DEFVARLISTP : (';') (VARLIST) (':') (TBAS) (DEFVARLISTP) | ('ʎ');
VARLIST: ID | (ID) (',') (VARLIST);
DEFPROC: ('PROCEDURE') (ID) (FORMAL_PARAMLIST) (';') (BLQ) (';');
DEFFUN: ('FUNCTION') (ID) (FORMAL_PARAMLIST) (':') (TBAS) (';') (BLQ) (';');
FORMAL_PARAMLIST: ('ʎ') | (('(') (FORMAL_PARAM) (')'));
FORMAL_PARAM: ((VARLIST) (':') (TBAS))| ((VARLIST) (':') (TBAS) (';') (FORMAL_PARAM));
TBAS: 'INTEGER' | 'REAL';

SENT: ((ASIG) (';')) | ((PROC_CALL) (';'));
ASIG: (ID) (':=') (EXP);
EXP: FACTOR (EXPP);
EXPP: ((OP) (EXPP) (EXP)) | ('ʎ');
OP: OPARIT;
OPARIT: '+' | '-'| '*' | 'DIV' | 'MOD';
FACTOR: SIMPVALUE | (('(') (EXP) (')')) | ((ID) (SUBPARAMLIST));
SUBPARAMLIST: ('ʎ') | (('(') (EXPLIST) (')'));
EXPLIST: EXP | ((EXP) (',') (EXPLIST));
PROC_CALL: (ID) (SUBPARAMLIST);

SALTAR: [ \t\r\n]+ -> skip;


