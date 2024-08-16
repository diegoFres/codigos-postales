package mx.unison;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buscarPostal {

    public static void main(String[] args) {

        String archivo = "C:\\Users\\diego\\IdeaProjects\\codigospostales\\codigos_postales.csv";
        String linea;
        String separador = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(separador);
                String codigoP = datos[0].trim();
                String asentamiento = datos[1].trim();
// Verificar si el código postal está en los argumentos
for (String arg : args) {
  if (arg.equals(codigoP)) {
     System.out.println("Codigo Postal: " + codigoP + " - Asentamiento: " + asentamiento);
                    }
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}