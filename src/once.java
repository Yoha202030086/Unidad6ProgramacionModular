package src;

import java.util.Scanner;

public class once {
    Scanner ent = new Scanner(System.in);
    String[] nomb = new String[6];
    double[] calificacion = new double[6];

    public static void main(String[] args) {
        once o = new once();
    }

    public once() {
        System.out.println("Estudiantes");
        for (int i = 0; i < 6; i++) {
            System.out.print("Nombre del estudiante: " + (i + 1) + " ");
            nomb[i] = ent.nextLine();
        }
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese la nota del estudiante: " + nomb[i] + " ");
            calificacion[i] = ent.nextInt();

    }

    }
            }