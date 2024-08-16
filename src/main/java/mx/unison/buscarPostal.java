package mx.unison;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buscarPostal {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, proporciona al menos un código postal como argumento.");
            return;
        }

        String archivo = "C:\\Users\\diego\\IdeaProjects\\codigospostales\\codigos_postales.csv";
        String linea;
        String separador = ",";
    }
}