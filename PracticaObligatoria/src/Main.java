import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Uso: java -jar miPrograma.jar archivo_entrada.pas");
            System.exit(1);
        }

        try {
            // Entrada del archivo fuente
            CharStream input = CharStreams.fromFileName(args[0]);

            // Análisis léxico y sintáctico
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(tokens);
            parser.removeErrorListeners(); // Quitar el por defecto
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.printf("Error de sintaxis en línea %d:%d - %s%n", line, charPositionInLine, msg);
                }
            });


            // Crear y recorrer el árbol sintáctico
            ParseTree tree = parser.prg();  // Asumimos que 'prg' es la regla inicial

            ParseTreeWalker walker = new ParseTreeWalker();
            TraductorListener listener = new TraductorListener();
            walker.walk(listener, tree);

            // Obtener código traducido
            String codigoC = listener.getCodigoFinal();

            // Guardar archivo de salida
            String nombreArchivoEntrada = new File(args[0]).getName();
            String nombreBase = nombreArchivoEntrada.replaceFirst("[.][^.]+$", ""); // quitar extensión
            String nombreArchivoSalida = nombreBase + ".c";

            try (PrintWriter out = new PrintWriter(nombreArchivoSalida)) {
                out.print(codigoC);
            }

            System.out.println("Traducción completada. Archivo generado: " + nombreArchivoSalida);

        } catch (RecognitionException e) {
            System.err.println("Error de reconocimiento: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Error en tiempo de ejecución: ");
            e.printStackTrace();
        }
    }
}
