 package src;
import java.util.Scanner;

public class dos {

    Scanner ent = new Scanner(System.in);
    int[] numero = new int[10];
    int aleat, aux = 0, cont = 0;

    public static void main(String[] args) {
     dos d = new dos();

    }

    public dos() {
        System.out.println("Arreglo con numeros aleatorios: ");
        for (int i = 0; i < numero.length; i++) {
               aleat = (int) (Math.random() * 100);
            System.out.println("El numero es: " + aleat);
                 numero[i] = aleat;
            if (aleat > aux) {
                aux = aleat;
                cont++;
            
            }
        }

        presentarDatos();
    }

    public void presentarDatos() {
        System.out.println("Presentando valores: ");
             for (int i = 0; i < numero.length; i++) {
        System.out.print(numero[i] + ", ");
        }
        System.out.println("El mayor de los numeros es: " + aux);
        System.out.println("El mayor de los numeros se repite: " + cont + " veces");
    }

}
