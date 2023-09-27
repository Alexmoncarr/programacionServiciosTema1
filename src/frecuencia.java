import java.util.Scanner;

public class frecuencia {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe una palabra");
    String palabra= sc.nextLine();
    int a=0, e=0, i=0, o=0, u=0;
    for(int x=0; x<palabra.length(); x++){
        if (palabra.charAt(x) == 'a') {
            a++;
        }else if (palabra.charAt(x) == 'e') {
            e++;
        } else if (palabra.charAt(x) == 'i') {
            i++;
        } else if (palabra.charAt(x) == 'o') {
            o++;
        } else if (palabra.charAt(x) == 'u') {
            u++;
        }
        }
        System.out.println("La frecuencia de la letra a es: " + a);
        System.out.println("La frecuencia de la letra e es: " + e);
        System.out.println("La frecuencia de la letra i es: " + i);
        System.out.println("La frecuencia de la letra o es: " + o);
        System.out.println("La frecuencia de la letra u es: " + u);


    }
}


