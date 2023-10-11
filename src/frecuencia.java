import java.io.FileWriter;
import java.io.IOException;

public class frecuencia {
    public static void main(String[] args) {
        contarVocales(args[0]);
    }
    public static void contarVocales(String palabra) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int x = 0; x < palabra.length(); x++) {
            char letra = Character.toLowerCase(palabra.charAt(x));
            if (letra == 'a') {
                a++;
            } else if (letra == 'e') {
                e++;
            } else if (letra == 'i') {
                i++;
            } else if (letra == 'o') {
                o++;
            } else if (letra == 'u') {
                u++;
            }
        }

        // Guardar resultados en un archivo
        try (FileWriter writer = new FileWriter("resultados.txt", true)) {
            writer.write("Palabra: " + palabra + "\n");
            writer.write("Frecuencia de a: " + a + "\n");
            writer.write("Frecuencia de e: " + e + "\n");
            writer.write("Frecuencia de i: " + i + "\n");
            writer.write("Frecuencia de o: " + o + "\n");
            writer.write("Frecuencia de u: " + u + "\n");
            writer.write("------------------------------\n");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
