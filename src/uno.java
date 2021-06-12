package src;

import java.util.Scanner;

public class uno {
    Scanner ent = new Scanner(System.in);
    int[] num = new int[5];

    public static void main(String[] args) {

        uno pi = new uno();

    }

    public uno() {
        System.out.println("Ingreso de numeros: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print((i + 1) + " Ingresar el numero: ");
            num[i] = ent.nextInt();
        }
        mostrarDatos();
    }

    public void mostrarDatos(){
        System.out.println("Los datos que se ingresaron son: ");
        for(int i=0; i<num.length;i++){
            System.out.print(num[i]+", ");
        }
        System.out.println("");
    }
}