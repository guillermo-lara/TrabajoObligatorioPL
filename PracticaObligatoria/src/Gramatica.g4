grammar Gramatica;

@members{
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public void imprimirCodigoC(String codigoC) {
    System.out.println(codigoC);
}

public void guardarCodigoEnArchivo(String codigoC, String nombreArchivo) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
        writer.write(codigoC);
    } catch (IOException e) {
        System.err.println("Error al guardar el archivo: " + e.getMessage());
    }
}


public String traducirPascalAC(String pascalCode) {
    // Suponemos que ya hemos realizado el análisis léxico y sintáctico del código Pascal
    // Ahora comenzamos con la traducción

    StringBuilder codigoC = new StringBuilder();

    // Traducir el programa: Empezamos con el bloque principal de código
    codigoC.append(traducirAxioma(pascalCode));

    // Si no se encuentra la traducción, se agrega un mensaje de error
    if (codigoC.length() == 0) {
        codigoC.append("// Error: El código Pascal no es válido.");
    }

    return codigoC.toString();
}
public String traducirAxioma(String pascalCode) {
    if (pascalCode.contains("program")) {
        return traducirPrg(pascalCode); // Traducimos el programa
    } else if (pascalCode.contains("unit")) {
        return traducirUnit(pascalCode); // Traducimos la unidad
    } else {
        return ""; // No se ha encontrado el tipo
    }
}
public String traducirPrg(String pascalCode) {
    StringBuilder codigoC = new StringBuilder();

    // Analizamos la estructura de un `program` o `unit`
    if (pascalCode.contains("program")) {
        // Extraemos el nombre y las declaraciones
        String nombre = extraerNombre(pascalCode);
        String bloque = traducirBloque(pascalCode);

        // Comenzamos el programa en C
        codigoC.append("int main() {\n");
        codigoC.append(bloque); // Traducimos las instrucciones del bloque
        codigoC.append("}\n");
    }

    return codigoC.toString();
}
public String traducirUnit(String pascalCode) {
    // Aquí iría la traducción para unidades en Pascal
    // Similar a la función anterior, pero utilizando la sintaxis adecuada
    return "";
}

public String traducirBloque(String pascalCode) {
    StringBuilder bloqueC = new StringBuilder();

    // Traducir las declaraciones
    String declaraciones = traducirDeclaraciones(pascalCode);
    bloqueC.append(declaraciones);

    // Traducir las sentencias dentro del bloque
    String sentencias = traducirSentencias(pascalCode);
    bloqueC.append(sentencias);

    return bloqueC.toString();
}
public String traducirDeclaraciones(String pascalCode) {
    StringBuilder declaracionesC = new StringBuilder();

    // Revisamos si hay constantes, variables, procedimientos o funciones
    if (pascalCode.contains("CONST")) {
        declaracionesC.append(traducirConstantes(pascalCode));
    }

    if (pascalCode.contains("VAR")) {
        declaracionesC.append(traducirVariables(pascalCode));
    }

    if (pascalCode.contains("PROCEDURE")) {
        declaracionesC.append(traducirProcedimiento(pascalCode));
    }

    if (pascalCode.contains("FUNCTION")) {
        declaracionesC.append(traducirFuncion(pascalCode));
    }

    return declaracionesC.toString();
}

public String traducirConstantes(String pascalCode) {
    // Traducir las constantes de Pascal a #define en C
    return "#define PI 3.14\n"; // Ejemplo de constante
}

public String traducirVariables(String pascalCode) {
    // Traducir las variables de Pascal a su tipo en C
    return "int a, b;\n"; // Ejemplo de declaración de variables
}

public String traducirProcedimiento(String pascalCode) {
    // Traducir el procedimiento de Pascal a una función en C
    return "void miProcedimiento() {\n    // Código aquí\n}\n"; // Ejemplo de procedimiento
}

public String traducirFuncion(String pascalCode) {
    // Traducir una función de Pascal a C
    return "int miFuncion(int a, int b) {\n    return a + b;\n}\n"; // Ejemplo de función
}
public String traducirSentencias(String pascalCode) {
    StringBuilder sentenciasC = new StringBuilder();

    // Traducir asignaciones
    if (pascalCode.contains(":=")) {
        sentenciasC.append(traducirAsignacion(pascalCode));
    }

    // Traducir estructuras de control como 'if', 'while', etc.
    if (pascalCode.contains("if")) {
        sentenciasC.append(traducirIf(pascalCode));
    }

    // Otras sentencias
    if (pascalCode.contains("while")) {
        sentenciasC.append(traducirWhile(pascalCode));
    }

    return sentenciasC.toString();
}

public String traducirAsignacion(String pascalCode) {
    return "a = 10;\n"; // Ejemplo de asignación
}

public String traducirIf(String pascalCode) {
    return "if (a > b) {\n    // Código\n} else {\n    // Código\n}\n"; // Ejemplo de sentencia if
}

public String traducirWhile(String pascalCode) {
    return "while (a < 10) {\n    // Código\n}\n"; // Ejemplo de sentencia while
}
public void procesarYGenerarCodigo(String pascalCode, boolean imprimirEnPantalla, String nombreArchivo) {
    // Traducimos el código Pascal a C
    String codigoC = traducirPascalAC(pascalCode);

    // Si se quiere imprimir en la pantalla
    if (imprimirEnPantalla) {
        imprimirCodigoC(codigoC);
    }

    // Si se quiere guardar en un archivo
    if (nombreArchivo != null && !nombreArchivo.isEmpty()) {
        guardarCodigoEnArchivo(codigoC, nombreArchivo);
    }
}

}
axioma: prg;

prg: 'program' ID ';' blq '.' | 'unit' ID ';' dcllist '.'; // [\n]  Desde aqui se debería llamar a imprimir
blq returns [String bloq]: dcllist 'begin' sentlist 'end' {$bloq = $dcllist.dcllis +" begin" + $sentlist.senlis +" end";};
dcllist returns [String dcllis]:  dcl dcllist {$dcllis = $dcl.dcll +$dcllist.dcllis;}| {$dcllis = "";} ;
sentlist returns [String senlis]: sent  sentlistp {$senlis = $sent.sen +$sentlistp.senlisp;};
sentlistp returns [String senlisp]: sent sentlistp {$senlisp = $sent.sen +$sentlistp.senlisp;}| {$senlisp = "";};

dcl returns [String dcll]:defcte {$dcll = $defcte.defconst;} | defvar {$dcll = $defvar.defvari;}| defproc {$dcll = $defproc.defproceso;} | deffun {$dcll = $deffun.deffuncion;};
defcte returns [String defconst]: 'CONST'|'const' ctelist {$defconst = "#define " +$ctelist.ctelis;};
ctelist returns [String ctelis]: ID '=' simpvalue ';' ctelistp {$ctelis = $ID.text +" " +$simpvalue.simp +"\n" +"#define " +$ctelistp.ctelisp;}; //$ctelis = $ID.text +" = " +$simpvalue.simp +" ; " +$ctelistp.ctelisp;
ctelistp returns [String ctelisp]: ID '=' simpvalue ';' ctelistp {$ctelisp = $ID.text +" "+ $simpvalue.simp +"\n" +"#define " +$ctelistp.ctelisp;}| {$ctelisp = "";} ;
simpvalue returns [String simp]: CONSTINT {$simp = $CONSTINT.text;} | CONSTREAL {$simp = $CONSTREAL.text;} | CONSTLI {$simp = $CONSTLI.text;};
defvar returns [String defvari]: 'VAR'|'var' defvarlist ';' {$defvari = $defvarlist.defvarlis;};
defvarlist returns [String defvarlis]: varlist ':' tbas defvarlistp {$defvarlis = $tbas.vlex + $varlist.varlis +$defvarlistp.defvarlisp;}; //$defvarlis = $varlist.varlis +' : ' +$tbas.vlex +$defvarlistp.defvarlisp; LUEGO PASO A $defvarlis = $tbas.vlex + $varlist.varlis ;
defvarlistp returns [String defvarlisp]: ';' varlist ':' tbas defvarlistp {$defvarlisp = ";" +"\n" +$tbas.vlex +$varlist.varlis +$defvarlistp.defvarlisp;} | {$defvarlisp= "";}; //$defvarlisp = "; " +$varlist.varlis +" : " +$tbas.vlex +$defvarlistp.defvarlisp;
varlist returns [String varlis]: ID varlistaux {$varlis = $ID.text + $varlistaux.varlisaux;};
varlistaux returns [String varlisaux]: ',' varlist {$varlisaux = ", " +$varlist.varlis;} | {$varlisaux = "";};
defproc returns [String defproceso]: 'PROCEDURE'|'procedure' ID formal_paramlist ';' blq ';' {$defproceso ="void " +$ID.text +" " +$formal_paramlist.for_paramli +"\n" +"{" +"\n" +$blq.bloq +"\n" +"}";}; // añadido despues +\n +"{" +\n +$blq.bloq +\n +"}"
deffun returns [String deffuncion]: 'FUNCTION'|'function' ID formal_paramlist ':' tbas ';' blq ';' {$deffuncion =$tbas.vlex +$ID.text +" " +$formal_paramlist.for_paramli +"\n" +"{" +"\n" +$blq.bloq +"\n" +"}";};//f = new Function($ID.text, $tbas.vlex...) creo que el tbas no tendria nada que ver  // añadido despues +\n +"{" +\n +$blq.bloq +\n +"}"
formal_paramlist returns [String for_paramli]: '(' formalparam ')' {$for_paramli = "( " +$formalparam.for_para +" )";} | {$for_paramli = "";} | {$for_paramli="( " +"void" +" )";};
formalparam returns [String for_para]: varlist ':' tbas formalparamaux {$for_para = $varlist.varlis +" :";};
formalparamaux returns [String for_paraaux]: ';' formalparam {$for_paraaux = "; "+$formalparam.for_para;} | {$for_paraaux = "";} ;
tbas returns [String vlex]: 'INTEGER' {$vlex = "int ";} | 'REAL' {$vlex = "float ";};

sent returns [String sen]: asig ';' {$sen = $asig.asi +" ;";} | proc_call ';' {$sen = $proc_call.procall +" ;";}
| 'while' expcond 'do'   blq {$sen = "while " +$expcond.expcon +" " + "do " +$blq.bloq;}
| 'repeat' blq 'until' expcond ';' {$sen = "repeat " +$blq.bloq +" " +"until " +$expcond.expcon +";";}
| 'for' ID ':=' exp inc exp 'do' blq {$sen = "for " +$ID.text +" " +"= " +$exp.ex +" " +$inc.in +" " +$exp.ex +" " +"do " +$blq.bloq;}
| 'if' '(' lcond ')' blq 'else' blq {$sen = "if " +"( " +$lcond.lcon +" )" +$blq.bloq +" " +"else " +$blq.bloq;}
| 'while' '(' lcond ')' blq {$sen = "while " +"( " +$lcond.lcon +" )" +$blq.bloq;}
| 'do' blq 'until' '(' lcond ')' {$sen = "do " +$blq.bloq +" " +"until " +"( " +$lcond.lcon +" )";}
| 'for' '(' ID '=' exp ';' lcond ';' ID '=' exp ')' blq {$sen = "for " +"( " +$ID.text +" " +"= " +$exp.ex +"; " +$lcond.lcon +"; " +$ID.text +" " +"= " +$exp.ex +" ) " +$blq.bloq;};

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

//control dee flujo
expcond returns [String expcon]: factorcond expcondp {$expcon = $factorcond.factorcon +" " +$expcondp.expconp;};
expcondp returns [String expconp]: oplog expcond expcondp {$expconp = $oplog.oplo +" " +$expcond.expcon +" " +$expcondp.expconp;}|{$expconp ="";} ;
oplog returns [String oplo]: 'or' {$oplo = "|| ";} | 'and' {$oplo = "&& ";};
factorcond returns [Strig factorcon]: exp opcomp exp {$factorcon = $exp.ex +" " +$opcomp.opcom +" " +$exp.ex;}| '(' expcond ')' {$factorcon = "( " +$expcond.expcon +" )" ;}| '!' factorcond {$factorcon = "not " +$factorcond.factorcon ;};
opcomp returns [String opcom]: '<' {$opcom = "< ";}| '>' {$opcom = "> ";}| '<=' {$opcom = "<= ";}| '>=' {$opcom = ">= ";}| '=' {$opcom = "== ";};
inc returns [String in]: 'to' {$in = "< ";} | 'downto' {$in = "> ";};

//Parte de lenguaje final
program: defines partes;
defines: '#define' ID ctes defines |;
ctes: CONSTINT | CONSTREAL | CONSTLI;
partes: part partes | part;
part: type restpart;
restpart: ID '(' listparam ')' bloque| ID '(' 'void' ')' bloque;
bloque: '{' sentlist '}';
listparam: listparam ',' type ID | type ID;
type: 'void' | 'int' | 'float';

lcond returns [String lcon]:  opl lcondp {$lcon = $opl.opll +" " +$lcondp.lconp;} | cond {$lcon = $cond.con;}| '!' cond {$lcon = "! " +cond.con;};
lcondp returns [String lconp]: opl lcondp {$lconp = $opl.opll +" " +$lcondp.lconp;} | cond {$lconp = $cond.con;}| '!' cond {$lconp = "! " +cond.con;}| {$lconp = "";};
opl returns [String opll]: '||' {$opll = "|| ";}| '&&' {$opll = "&& ";};
cond returns [String con]: exp opr exp {$con = $exp.ex +" " +$opr.oprr +" " +$exp.ex;};
opr returns [String oprr]: '==' {$oprr = "== ";} | '<' {$oprr = "< ";} | '>' {$oprr = "> ";} | '>='  {$oprr = ">= ";}| '<=' {$oprr = "<= ";};


ID: [a-no-zA-NO-Z][a-no-zA-NO-Z0-9_]*{};
CONSTINT:('+'|'-')? [0-9]+{};
CONSTREAL: ('+'|'-')? [0-9]+ ('.'|(('e'|'E')('+'|'-')?)|'.'[0-9]+ (('e'|'E')('+'|'-')?)) [0-9]+{};
CONSTLI: '\'' ( ~['\r\n] |'\\' '\'')* '\'' {};
//CONSTLI: '\'' [a-no-zA-NO-Z.,_0-9 ]* '\'' {};
COMENTARIO1L: ('{') [~\n]+ ('}') {}; // No debe reconocer saltos de lineas
COMENTARIOVL: ('*') [~*]+ ('*') {};
SALTAR: [ \t\r\n]+ -> skip;




