grammar Gramatica;

axioma: prg;

prg: 'program' ID ';' blq '.'; // [\n]  Desde aqui se debería llamar a imprimir
blq returns [String bloq]: dcllist 'begin' sentlist 'end' {$bloq = $dcllist.dcllis +" begin" + $sentlist.senlis +" end";};
dcllist returns [String dcllis]:  dcl dcllist {$dcllis = $dcl.dcll +$dcllist.dcllis;}| {$dcllis = "";} ;
sentlist returns [String senlis]: sent  sentlistp {$senlis = $sent.sen +$sentlistp.senlisp;};
sentlistp returns [String senlisp]: sent sentlistp {$senlisp = $sent.sen +$sentlistp.senlisp;}| {$senlisp = "";};

dcl returns [String dcll]:defcte {$dcll = $defcte.defconst} | defvar {$dcll = $defvar.defvari}| defproc {$dcll = $defproc.defproceso} | deffun {$dcll = $deffun.deffuncion};
defcte returns [String defconst]: 'CONST'|'const' ctelist {$defconst = "#define" $ctelist.ctelis;};
ctelist returns [String ctelis]: ID '=' simpvalue ';' ctelistp {$ctelis = $ID.text +" " +$simpvalue.simp +\n +"#define " +$ctelistp.ctelisp;}; //$ctelis = $ID.text +" = " +$simpvalue.simp +" ; " +$ctelistp.ctelisp;
ctelistp returns [String ctelisp]: ID '=' simpvalue ';' ctelistp {$ctelisp = $ID.text +" "+ $simpvalue.simp +\n +"#define " +$ctelistp.ctelisp;}| {$ctelisp = "";} ;
simpvalue returns [String simp]: CONSTINT {$simp = $CONSTINT.text;} | CONSTREAL {$simp = $CONSTREAL.text;} | CONSTLI {$simp = $CONSTLI.text;};
defvar returns [String defvari]: 'VAR'|'var' defvarlist ';' {$defvari = $defvarlist.defvarlis;};
defvarlist returns [String defvarlis]: varlist ':' tbas defvarlistp {$defvarlis = $tbas.vlex + $varlist.varlis +$defvarlistp.defvarlisp;}; //$defvarlis = $varlist.varlis +' : ' +$tbas.vlex +$defvarlistp.defvarlisp; LUEGO PASO A $defvarlis = $tbas.vlex + $varlist.varlis ;
defvarlistp returns [String defvarlisp]: ';' varlist ':' tbas defvarlistp {$defvarlisp = ";" +\n +$tbas.vlex +$varlist.varlis +$defvarlistp.defvarlisp;} | {$defvarlisp= "";}; //$defvarlisp = "; " +$varlist.varlis +" : " +$tbas.vlex +$defvarlistp.defvarlisp;
varlist returns [String varlis]: ID varlistaux {$varlis = $ID.text + $varlistaux.varlisaux;};
varlistaux returns [String varlisaux]: ',' varlist {$varlisaux = ", " +$varlist.varlis;} | {$varlisaux = "";};
defproc returns [String defproceso]: 'PROCEDURE'|'procedure' ID formal_paramlist ';' blq ';' {$defproceso ="void " +$ID.text +" " +$formal_paramlist.for_paramli +\n +"{" +\n +$blq.bloq +\n +"}";}; // añadido despues +\n +"{" +\n +$blq.bloq +\n +"}"
deffun returns [String deffuncion]: 'FUNCTION'|'function' ID formal_paramlist ':' tbas ';' blq ';' {$deffuncion =$tbas.vlex +$ID.text +" " +$formal_paramlist.for_paramli +\n +"{" +\n +$blq.bloq +\n +"}";};//f = new Function($ID.text, $tbas.vlex...) creo que el tbas no tendria nada que ver  // añadido despues +\n +"{" +\n +$blq.bloq +\n +"}"
formal_paramlist returns [String for_paramli]: '(' formalparam ')' {$for_paramli = "( " +$formalparam.for_para +" )";} | {$for_paramli = "";} | {$for_paramli="( " +"void" +" )";};
formalparam returns [String for_para]: varlist ':' tbas formalparamaux {$for_para = $varlist.varlis +" :";};
formalparamaux returns [String for_paraaux]: ';' formalparam {$for_paraaux = "; "+$formalparam.for_para;} | {$for_paraaux = "";} ;
tbas returns [String vlex]: 'INTEGER' {$vlex = "int ";} | 'REAL' {$vlex = "float ";};

sent returns [String sen]: asig ';' {$sen = $asig.asi +" ;";} | proc_call ';' {$sen = $proc_call.procall +" ;";};
asig returns [String asi]: ID ':=' exp {$asi = $ID.text +" = " +$exp.ex ;};
exp returns [String ex]: factor expp {$ex = $factor.fact + $expp.exppp;};
expp returns [String exppp]: op expp exp {$exppp = $op.opp +" " +$exp.ex +" " +$expp.exppp;} | {$exppp = "";};
op returns [String opp]: oparit {$opp = $oparit.valex;};
oparit returns [String valex]: '+' {$valex = "+";} | '-' {$valex = "-";} | '*' {$valex = "*";}| 'div' {$valex = "/";} | 'mod' {$valex = "%";};
factor returns [String fact]: simpvalue {$fact = $simpvalue.simp;} | '(' exp ')' {$fact = "( "+ $exp.ex +" )";} | ID subparamlist {$fact = $ID.text +$subparamlist.subparalis;};
subparamlist returns [String subparalis]: '(' explist ')' {$subparalis = "( "+$explist.explis+" )";} | {$subparalis = "";};
explist returns [String explis]: exp explistaux {$explis = $exp.ex +$explistaux.explisaux;};
explistaux returns [String explisaux]: ',' explist {$explisaux = ", " +$explist.explis;} | {$explisaux = "";};
proc_call returns [String procall]: ID subparamlist {$procall = $ID.text +" " +$subparamlist.subparalis;};

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
COMENTARIOVL: ('*') [~*]+ ('*') {};
SALTAR: [ \t\r\n]+ -> skip;




