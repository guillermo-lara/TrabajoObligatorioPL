grammar Gramatica;

@members{

}

axioma:(prg);
ID: [a-no-zA-NO-Z][a-no-zA-NO-Z0-9_]*{};
CONSTINT:('+'|'-')? [0-9]+{};
CONSTREAL: ('+'|'-')? [0-9]+ ('.'|(('e'|'E')('+'|'-')?)|'.'[0-9]+ (('e'|'E')('+'|'-')?)) [0-9]+{};
CONSTLI: '\'' ( ~['\r\n] |'\\' '\'')* '\'' {};
//CONSTLI: '\'' [a-no-zA-NO-Z.,_0-9 ]* '\'' {};
COMENTARIO1L: ('{') [~\n]+ ('}') {}; // No debe reconocer saltos de lineas
COMENTARIOVL: ('*') [~*]+ ('*') {};

prg: 'program' ID ';' blq '.'; // [\n]  Desde aqui se debería llamar a imprimir
blq returns [String bloq]: dcllist 'begin' sentlist 'end' {$bloq = };
dcllist returns [String dcllis]:  dcl dcllist {$dcllis = $dcll +$dcllis1;}| {$dcllis = '';} ;
sentlist returns [String senlis]: sent  sentlistp {$senlis = $sen +$senlisp;};
sentlistp returns [String senlisp]: sent sentlistp {$senlisp = $sen +$senlisp1;}| {$senlisp = '';};

dcl returns [String dcll]:defcte | defvar | defproc | deffun;
defcte: 'CONST'|'const' ctelist;
ctelist returns [String ctelis]: ID '=' simpvalue ';' ctelistp {$ctelis = $ID.text +' = ' +$simp +' ; ' +$ctelisp;};
ctelistp returns [String ctelisp]: ID '=' simpvalue ';' ctelistp {$ctelisp = $ID.text +' = '+ $simp +' ; ' +$ctelisp1;}| {$ctelisp = '';} ;
simpvalue returns [String simp]: CONSTINT {$simp = $CONSTINT.text;} | CONSTREAL {$simp = $CONSTREAL.text;} | CONSTLI {$simp = $CONSTLI.text;};
defvar: 'VAR'|'var' defvarlist ';';
defvarlist returns [String defvarlis]: varlist ':' tbas defvarlistp {$defvarlis = $varlis +' : ' +$vlex +$defvarlisp;};
defvarlistp returns [String defvarlisp]: ';' varlist ':' tbas defvarlistp {$defvarlisp = '; ' +$varlis +' : ' +$vlex +$defvarlisp1;} | {$defvarlisp= '';};
varlist returns [String varlis]: ID varlistaux {$varlis = $ID.text + $varlisaux;};
varlistaux returns [String varlisaux]: ',' varlist {$varlisaux = "," +$varlis;} | {$varlisaux = '';};
defproc: 'PROCEDURE'|'procedure' ID formal_paramlist ';' blq ';';
deffun: 'FUNCTION'|'function' ID formal_paramlist ':' tbas ';' blq ';' {$tbas.vlex +$ID.text ;};//f = new Function($ID.text, $tbas.vlex...) creo que el tbas no tendria nada que ver
formal_paramlist returns [String for_paramli]: '(' formalparam ')' {$for_paramli = "( " +$for_para +" )";} | {$for_paramli = '';};
formalparam returns [String for_para]: varlist ':' tbas formalparamaux {$for_para = $varlis +" :";};
formalparamaux returns [String for_paraaux]: ';' formalparam {$for_paraaux = '; '+$for_para;} | {$for_paraaux = '';} ;
tbas returns [String vlex]: 'INTEGER' {$vlex = "int";} | 'REAL' {$vlex = "float";};

sent returns [String sen]: asig ';' {$sen = $asi +' ;';} | proc_call ';' {$sen = $procall +' ;';};
asig returns [String asi]: ID ':=' exp {$asi = $ID.text +":=" +$ex ;};
exp returns [String ex]: factor expp {$ex = $fact + $exppp;};
expp returns [String exppp]: op expp exp {$exppp = $opp +$exppp+ $ex;} | {$exppp = '';};
op returns [String opp]: oparit {$opp = $valex;};
oparit returns [String valex]: '+' {$valex = "+";} | '-' {$valex = "-";} | '*' {$valex = "*";}| 'div' {$valex = "/";} | 'mod' {$valex = "%";};
factor returns [String fact]: simpvalue {$fact = $simp;} | '(' exp ')' {$fact = "( "+ $ex +" )";} | ID subparamlist {$fact = $ID.text +$subparalis;};
subparamlist returns [String subparalis]: '(' explist ')' {$subparalis = "( "+$explis+" )";} | {$subparalis = '';};
explist returns [String explis]: exp explistaux {$explis = $ex +$explisaux;};
explistaux returns [String explisaux]: ',' explist {$explisaux = ", " +$explis;} | {$explisaux = '';};
proc_call returns [String procall]: ID subparamlist {$procall = $ID.text +$subparalis;};

SALTAR: [ \t\r\n]+ -> skip;



