import java.io.*;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        try {

            // aplicar la gramatica a la frase
            CharStream input = CharStreams.fromFileName(args[0]);
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(tokens);
            parser.axioma();

        } catch (org.antlr.v4.runtime.RecognitionException e) {
//Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } //catch (IOException e) {
//Fallo de entrada/salida
        //System.err.println("IO " + e.getMessage());
        //}
        catch (java.lang.RuntimeException e) {
//Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
