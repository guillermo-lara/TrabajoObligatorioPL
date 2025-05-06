grammar Gramatica;

@members{

}

axioma:(prg);


prg: 'program' ID ';' blq '.'; // [\n]
blq: dcllist 'begin' sentlist 'end';
dcllist:  dcl dcllist | ;
sentlist: sent  sentlistp ;
sentlistp: sent sentlistp | ;

dcl:defcte | defvar | defproc | deffun;
defcte: 'CONST'|'const' ctelist;
ctelist: ID '=' simpvalue ';' ctelistp;
ctelistp: ID '=' simpvalue ';' ctelistp | ;
simpvalue: CONSTINT | CONSTREAL | CONSTLI;
defvar: 'VAR'|'var' defvarlist ';';
defvarlist : varlist ':' tbas defvarlistp;
defvarlistp : ';' varlist ':' tbas defvarlistp | ;
varlist: ID varlistaux;
varlistaux: ',' varlist| ;
defproc: 'PROCEDURE'|'procedure' ID formal_paramlist ';' blq ';';
deffun: 'FUNCTION'|'function' ID formal_paramlist ':' tbas ';' blq ';';
formal_paramlist: '(' formalparam ')' | ;
formalparam: varlist ':' tbas formalparamaux;
formalparamaux: ';' formalparam | ;
tbas: 'INTEGER' | 'REAL';

sent: asig ';' | proc_call ';';
asig: ID ':=' exp;
exp: factor expp;
expp: op expp exp | ;
op: oparit;
oparit: '+' | '-' | '*' | 'div' | 'mod';
factor: simpvalue | '(' exp ')' | ID subparamlist;
subparamlist: '(' explist ')' | ;
explist: exp explistaux;
explistaux: ',' explist | ;
proc_call: ID subparamlist;


program: defines partes;
defines: '#define' ID ctes defines |;
ctes: CONSTINT | CONSTREAL | CONSTLI;
partes: part partes | part;
part: type restpart;
restpart: ID '(' listparam ')' bloque| ID '(' 'void' ')' bloque;
bloque: '{' sentlist '}';
listparam: listparam ',' type ID | type ID;
type: 'void' | 'int' | 'float';


ID: [a-no-zA-NO-Z][a-no-zA-NO-Z0-9_]*{};
CONSTINT:('+'|'-')? [0-9]+{};
CONSTREAL: ('+'|'-')? [0-9]+ ('.'|(('e'|'E')('+'|'-')?)|'.'[0-9]+ (('e'|'E')('+'|'-')?)) [0-9]+{};
CONSTLI: '\'' ( ~['\r\n] |'\\' '\'')* '\'' {};
//CONSTLI: '\'' [a-no-zA-NO-Z.,_0-9 ]* '\'' {};
COMENTARIO1L: ('{') [~\n]+ ('}') {}; // No debe reconocer saltos de lineas
COMENTARIOVL: ('*') [~]+ ('*') {};
SALTAR: [ \t\r\n]+ -> skip;

/*
program: defines partes;
defines: ʎ | '#define' ID ctes defines;
ctes: constint | constfloat | constlit;
partes: part partes | part;
part: type restpart;
restpart: ID '(' listparam ')' blq | ID '(' 'void' ')' blq;
blq: '{' sentlist '}';
listparam: listparam ',' type ID | type ID;
type: 'void' | 'int' | 'float';
*/