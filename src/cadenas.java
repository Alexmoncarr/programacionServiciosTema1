import java.io.File;
import java.util.Random;

public class cadenas {

    public static void main(String[] args) {
        Random random = new Random();

        // Generamos las cadenas
        for (int i = 0; i < 10; i++) {
            int longitud = random.nextInt(20) + 1;
            StringBuilder cadena = new StringBuilder();

            for (int j = 0; j < longitud; j++) {
                char caracter = (char) (random.nextInt(26) + 'a');
                cadena.append(caracter);
            }

            // Llamamos a Frecuencia para contar las vocales y guardar los resultados
            //frecuencia.contarVocales(cadena.toString());
            try{
                File ruta = new File("C:\\Users\\aleja\\IdeaProjects\\programacionServiciosTema1\\out\\production\\programacionServiciosTema1");
                ProcessBuilder pb = new ProcessBuilder("java","frecuencia", cadena.toString());
                pb.directory(ruta);
                pb.redirectInput(ProcessBuilder.Redirect.PIPE);
                pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
                pb.redirectError(ProcessBuilder.Redirect.INHERIT);
                Process p = pb.start();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
