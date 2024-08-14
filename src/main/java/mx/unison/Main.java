package mx.unison;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String archivo = "C:\\Users\\diego\\IdeaProjects\\codigospostales\\codigos_postales.csv";
        String linea;
        String sep = ",";

        int Urbanos = 0;
        int Rurales = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(sep);


                String tipoAsent = datos[2].trim();

                if (tipoAsent.equalsIgnoreCase("Urbano")) {
                    Urbanos++;
                } else if (tipoAsent.equalsIgnoreCase("Rural")) {
                    Rurales++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Asentamientos Urbanos: " + Urbanos);
        System.out.println("Asentamientos Rurales : " + Rurales);
    }
}