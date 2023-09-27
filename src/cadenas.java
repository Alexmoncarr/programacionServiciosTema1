import java.util.Random;
import java.util.Scanner;

public class cadenas {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario la cantidad de cadenas a generar
        System.out.println("Introduce la cantidad de cadenas a generar:");
        int cantidad = sc.nextInt();

        // Generamos las cadenas
        generarCadenas(cantidad);
    }

    public static void generarCadenas(int cantidad) {
        // Generamos un objeto Random para generar números aleatorios
        Random random = new Random();

        // Generamos las cadenas
        for (int i = 0; i < cantidad; i++) {
            // Creamos una cadena vacía
            String cadena = "";

            // Generamos la longitud de la cadena de forma aleatoria
            int longitud = random.nextInt(20) + 1;

            // Agregamos caracteres aleatorios a la cadena
            for (int j = 0; j < longitud; j++) {
                // Generamos un carácter aleatorio del alfabeto
                char caracter = (char) (random.nextInt(26) + 'a');

                // Agregamos el carácter a la cadena
                cadena += caracter;
            }

            // Imprimimos la cadena
            System.out.println(cadena);
        }
    }
}
