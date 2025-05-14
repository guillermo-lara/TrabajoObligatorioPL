import java.io.*;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Cargar el archivo de entrada
            CharStream input = CharStreams.fromFileName(args[0]);
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(tokens);

            // Parsear la entrada comenzando por el punto de entrada correcto (prg)
            GramaticaParser.PrgContext prgContext = parser.prg(); // Aquí invocas solo prg() que es el punto de entrada principal

            // Generar el código
            String generatedCode = prgContext.code;

            // Mostrar el código generado
            System.out.println(generatedCode);

        } catch (org.antlr.v4.runtime.RecognitionException e) {
            // Error de reconocimiento de la entrada
            System.err.println("REC " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
            // Otros errores en tiempo de ejecución
            System.err.println("RUN " + e.getMessage());
        } catch (IOException e) {
            // Errores de entrada/salida (leer archivo)
            System.err.println("IO " + e.getMessage());
        }
    }
}
