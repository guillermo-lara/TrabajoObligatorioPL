grammar Gramatica;

@members{
}

axioma: prg;

prg returns [String prog]:
    'program' ID ';' blq '.' {
        $prog = "#include <stdio.h>\n" +
                $blq.bloq + "\n\nint main(void) {\n" + $blq.bloqMain +
                "return 0;\n}\n";
    }
   | 'unit' ID ';' dcllist '.' {
        $prog = "// Libreria " + $ID.text + "\n" + $dcllist.dcllis;
    };

blq returns [String bloq, String bloqMain]:
    dcllist 'begin' sentlist 'end' {
        $bloq = $dcllist.dcllis + "\n" + $sentlist.senlis + "\n";
        $bloqMain = $sentlist.senlisMain + "\n";
    };

dcllist returns [String dcllis]:
    dcl dcllist {
        $dcllis = "\t" + $dcl.dcll + "\n" + $dcllist.dcllis;
    }
    | { $dcllis = ""; };

sentlist returns [String senlis, String senlisMain]:
    sent sentlistp {
        $senlis = $sent.sen + $sentlistp.senlisp;
        $senlisMain = $sent.senMain + $sentlistp.senlispMain;
    };

sentlistp returns [String senlisp, String senlispMain]:
    sent sentlistp {
        $senlisp = $sent.sen + $sentlistp.senlisp;
        $senlispMain = $sent.senMain + $sentlistp.senlispMain;
    }
    | { $senlisp = ""; $senlispMain = ""; };

dcl returns [String dcll]:
    defcte { $dcll = $defcte.defconst; }
    | defvar { $dcll = $defvar.defvari; }
    | defproc { $dcll = $defproc.defproceso; }
    | deffun { $dcll = $deffun.deffuncion; };

defcte returns [String defconst]:
    'CONST'|'const' ctelist {
        $defconst = $ctelist.ctelis;
    };

ctelist returns [String ctelis]:
    ID '=' simpvalue ';' ctelistp {
        $ctelis = "#define " + $ID.text + " " + $simpvalue.simp + "\n" + $ctelistp.ctelisp;
    };

ctelistp returns [String ctelisp]:
    ID '=' simpvalue ';' ctelistp {
        $ctelisp = "#define " + $ID.text + " " + $simpvalue.simp + "\n" + $ctelistp.ctelisp;
    }
    | { $ctelisp = ""; };

simpvalue returns [String simp]:
    CONSTINT { $simp = $CONSTINT.text; }
    | CONSTREAL { $simp = $CONSTREAL.text; }
    | CONSTLI { $simp = $CONSTLI.text; };

defvar returns [String defvari]:
    'VAR'|'var' defvarlist ';' {
        $defvari = $defvarlist.defvarlis;
    };

defvarlist returns [String defvarlis]:
    varlist ':' tbas defvarlistp {
        $defvarlis = $tbas.vlex + $varlist.varlis + $defvarlistp.defvarlisp;
    };

defvarlistp returns [String defvarlisp]:
    ';' varlist ':' tbas defvarlistp {
        $defvarlisp = ";\n" + $tbas.vlex + $varlist.varlis + "\n" + $defvarlistp.defvarlisp;
    }
    | { $defvarlisp = ""; };

varlist returns [String varlis]:
    ID varlistaux { $varlis = $ID.text + $varlistaux.varlisaux; };

varlistaux returns [String varlisaux]:
    ',' varlist { $varlisaux = ", " + $varlist.varlis; }
    | { $varlisaux = ""; };

defproc returns [String defproceso]:
    'PROCEDURE'|'procedure' ID formal_paramlist ';' blq ';' {
        $defproceso = "void " + $ID.text + "(" + $formal_paramlist.for_paramli + ")" + "\n" +
                      "{" + "\n" +
                      "\t" + $blq.bloq + "\n" +
                      "\t" + "}\n";
    };

deffun returns [String deffuncion]:
    'FUNCTION'|'function' ID formal_paramlist ':' tbas ';' blq ';' {
        $deffuncion = $tbas.vlex + $ID.text + "(" + $formal_paramlist.for_paramli + ")" + "\n" +
                      "{" + "\n" +
                      "\t" + $blq.bloq + "\n" +
                      "\t" + "return " + $ID.text + ";\n" +
                      "}\n";
    };

formal_paramlist returns [String for_paramli]:
    '(' formalparam ')' { $for_paramli = "( " + $formalparam.for_para + " )"; }
    | { $for_paramli = ""; }
    | { $for_paramli = "( void )"; };

formalparam returns [String for_para]:
    varlist ':' tbas formalparamaux { $for_para = $tbas.vlex + " " + $varlist.varlis; };

formalparamaux returns [String for_paraaux]:
    ';' formalparam { $for_paraaux = "; " + $formalparam.for_para; }
    | { $for_paraaux = ""; };

tbas returns [String vlex]:
    'INTEGER' { $vlex = "int "; }
    | 'REAL' { $vlex = "float "; };

sent returns [String sen, String senMain]:
    asig ';' {
        $senMain = "\t" + $asig.asi + ";\n";
        $sen = "";
    }
    | proc_call ';' {
        $senMain = "\t" + $proc_call.procall + ";\n";
        $sen = "";
    }
    | 'writeln' '(' wrargs ')' ';' {
        $sen = "\t" + "printf(" + $wrargs.args + ");\n";
        $senMain = "\t" + "printf(" + $wrargs.args + ");\n";
    }
    | 'while' expcond 'do' blq {
        $sen = "";
        $senMain = "";
    }
    | 'repeat' blq 'until' expcond ';' {
        $sen = "";
        $senMain = "";
    }
    | 'for' ID ':=' exp inc exp 'do' blq {
        $sen = "";
        $senMain = "";
    }
    | 'if' '(' lcond ')' blq 'else' blq {
        $sen = "";
        $senMain = "";
    }
    | 'while' '(' lcond ')' blq {
        $sen = "";
        $senMain = "";
    }
    | 'do' blq 'until' '(' lcond ')' {
        $sen = "";
        $senMain = "";
    }
    | 'for' '(' ID '=' exp ';' lcond ';' ID '=' exp ')' blq {
        $sen = "";
        $senMain = "";
    };

wrargs returns [String args]:
    wrarg wrargsaux {
        $args = $wrarg.arg + $wrargsaux.argsaux;
    };

wrargsaux returns [String argsaux]:
    ',' wrarg wrargsaux {
        $argsaux = ", " + $wrarg.arg + $wrargsaux.argsaux;
    }
    | { $argsaux = ""; };

wrarg returns [String arg]:
    CONSTLI {
        $arg = "\"" + $CONSTLI.text + "\"";
    }
    | exp {
        $arg = "%s";  // Para flotantes
        if ($exp.ex.startsWith("int")) {
            $arg = "%d";  // Para enteros
        }
        $arg = String.format($arg, $exp.ex);
    };

asig returns [String asi]:
    ID ':=' exp { $asi = $ID.text + " = " + $exp.ex; };

exp returns [String ex]:
    factor expp {
        $ex = $factor.fact + $expp.exppp;
    };

expp returns [String exppp]:
    op expp exp { $exppp = $op.opp + " " + $exp.ex + " " + $expp.exppp; }
    | { $exppp = ""; };

op returns [String opp]:
    oparit { $opp = $oparit.valex; };

oparit returns [String valex]:
    '+' { $valex = "+"; }
    | '-' { $valex = "-"; }
    | '*' { $valex = "*"; }
    | 'div' { $valex = "/"; }
    | 'mod' { $valex = "%"; };

factor returns [String fact]:
    simpvalue { $fact = $simpvalue.simp; }
    | '(' exp ')' { $fact = "( " + $exp.ex + " )"; }
    | ID subparamlist { $fact = $ID.text + $subparamlist.subparalis; };

subparamlist returns [String subparalis]:
    '(' explist ')' { $subparalis = "( " + $explist.explis + " )"; }
    | { $subparalis = ""; };

explist returns [String explis]:
    exp explistaux { $explis = $exp.ex + $explistaux.explisaux; };

explistaux returns [String explisaux]:
    ',' explist { $explisaux = ", " + $explist.explis; }
    | { $explisaux = ""; };

proc_call returns [String procall]:
    ID subparamlist { $procall = $ID.text + " " + $subparamlist.subparalis; };

expcond returns [String expcon]:
    factorcond expcondp { $expcon = $factorcond.factorcon + " " + $expcondp.expconp; };

expcondp returns [String expconp]:
    opl expcond expcondp { $expconp = $opl.opll + " " + $expcond.expcon + " " + $expcondp.expconp; }
    | { $expconp = ""; };

oplog returns [String oplo]:
    'or' { $oplo = "|| "; }
    | 'and' { $oplo = "&& "; };

factorcond returns [String factorcon]:
    exp opcomp exp { $factorcon = $exp.ex + " " + $opcomp.opcom + " " + $exp.ex; }
    | '(' expcond ')' { $factorcon = "( " + $expcond.expcon + " )"; }
    | '!' factorcond { $factorcon = "not " + $factorcond.factorcon; };

opcomp returns [String opcom]:
    '<' { $opcom = "< "; }
    | '>' { $opcom = "> "; }
    | '<=' { $opcom = "<= "; }
    | '>=' { $opcom = ">= "; }
    | '=' { $opcom = "== "; };

inc returns [String in]:
    'to' { $in = "< "; }
    | 'downto' { $in = "> "; };

lcond returns [String lcon]:
    opl lcondp { $lcon = $opl.opll + " " + $lcondp.lconp; }
    | cond { $lcon = $cond.con; }
    | '!' cond { $lcon = "! " + $cond.con; };

lcondp returns [String lconp]:
    opl lcondp { $lconp = $opl.opll + " " + $lcondp.lconp; }
    | cond { $lconp = $cond.con; }
    | '!' cond { $lconp = "! " + $cond.con; }
    | { $lconp = ""; };

opl returns [String opll]:
    '||' { $opll = "|| "; }
    | '&&' { $opll = "&& "; };

cond returns [String con]:
    exp opr exp { $con = $exp.ex + " " + $opr.oprr + " " + $exp.ex; };

opr returns [String oprr]:
    '==' { $oprr = "== "; }
    | '<' { $oprr = "< "; }
    | '>' { $oprr = "> "; }
    | '>=' { $oprr = ">= "; }
    | '<=' { $oprr = "<= "; };


ID: [a-zA-Z][a-zA-Z0-9_]*;
CONSTINT: ('+'|'-')? [0-9]+;
CONSTREAL: ('+'|'-')? [0-9]+ ('.'|('e'|'E')('+'|'-')?) [0-9]+;
CONSTLI: '\'' (~['\r\n] | '\\' '\'')* '\'';
COMENTARIO1L: ('{') [~\n]+ ('}');
COMENTARIOVL: ('*') [~*]+ ('*');
SALTAR: [ \t\r\n]+ -> skip;
