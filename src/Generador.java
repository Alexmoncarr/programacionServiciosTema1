import java.io.File;

public class Generador {

    public static void main(String[] args) {
        // Lanzar 10 instancias de la aplicación 'cadenas'
        for (int i = 0; i < 10; i++) {
            try{
                File ruta = new File("C:\\Users\\aleja\\IdeaProjects\\programacionServiciosTema1\\out\\production\\programacionServiciosTema1");
                ProcessBuilder pb = new ProcessBuilder("java","cadenas");
                pb.directory(ruta);
                pb.redirectInput(ProcessBuilder.Redirect.PIPE);
                pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
                pb.redirectError(ProcessBuilder.Redirect.INHERIT);
                Process p = pb.start();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Generación de cadenas completada.");
    }
}
