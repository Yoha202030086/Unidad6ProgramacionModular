package src;

import java.util.Scanner;

public class nueve {
    int[][] matrizuno;
    int fila, colum;
    int[][] matrizdos;
    int[][] suma;
    Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        nueve n = new nueve();
    }

    public nueve() {
        System.out.print("Ingresar numero de filas para la matriz: ");
        fila = ent.nextInt();
        System.out.print("Ingresar numero de columnas para la matriz: ");
        colum = ent.nextInt();
        matrizuno = new int[fila][colum];
        matrizdos = new int[fila][colum];
        suma = new int[fila][colum];

        if (fila == colum) {

            System.out.println("Cargando primera matriz...");
            for (int i = 0; i < matrizuno.length; i++) {
                for (int j = 0; j < matrizuno.length; j++) {
                    System.out.print("Ingresar numero para la matriz ");
                    matrizuno[i][j] = ent.nextInt();
                }
            }

            System.out.println("Cargando segnda matriz");
            for (int i = 0; i < matrizuno.length; i++) {
                for (int j = 0; j < matrizuno.length; j++) {
                    System.out.print("Ingresar numero para la matrizdos: ");
                    matrizdos[i][j] = ent.nextInt();
                }
            }

        } else {
            System.out.println("No se puede sumar las matrices que no sean cuadradas");
        }
        sumar();
        mostrar();

    }

    public void mostrar() {
        System.out.println("Matriz 1");
        for (int i = 0; i < matrizuno.length; i++) {
            for (int j = 0; j < matrizuno.length; j++) {
                System.out.print(matrizuno[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Matriz 2");
        for (int i = 0; i < matrizdos.length; i++) {

            for (int j = 0; j < matrizdos.length; j++) {
                System.out.print(matrizdos[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Suma");
        for (int i = 0; i < matrizuno.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
    }

    public void sumar() {
        for (int i = 0; i < matrizuno.length; i++) {
            for (int j = 0; j < matrizuno.length; j++) {
                suma[i][j] = matrizuno[i][j] + matrizdos[i][j];
            }
            System.out.println("");
        }

    }

}
