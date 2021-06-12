package src;

import java.util.Scanner;

public class tres {
    Scanner ent = new Scanner(System.in);
    int[] num = new int[8];
    int aux1, aux2 = 0, aux3;
    public static void main(String[] args) {
     tres t1 = new tres();
    }

    public tres() {
        System.out.println("cargando arreglo: ");
           for (int i = 0; i < num.length; i++) {  
        System.out.print((i + 1) + " Ingresar un numero: ");
            num[i] = ent.nextInt();
        }

        System.out.println("Ingresar valor de busqueda: ");
           aux1 = ent.nextInt();
        buscarValor(aux1);

    }

    public void buscarValor(int valor) {
            int cont = 0;
        while(cont<8 && num[cont]<valor){
            cont++;
        }
        if(cont==8){
                System.out.println("No se encontrado el numero: ");
        }else if(num[cont]==valor){
                System.out.println("El numero que ingreso se encontro!!: ");
            }else{
                System.out.println("No se encontro el numero, puede intentar de nuevo...");
            }
        }
}
