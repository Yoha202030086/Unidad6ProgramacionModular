package src;

import java.util.Scanner;

public class cuatro {
    
    /*
    Leer 10 valores de un array de enteros y deducir cuál es la distancia que les separa del número mayor.
    Numeros del array se generan aleatoriamente.
    */

    Scanner ent = new Scanner(System.in);
      int []num=new int [10];
      int mayor=0,menor=0,diferencia=0;
    public static void main(String[] args) {
        cuatro cua = new cuatro();
    }

    public cuatro(){     
        for(int i=0;i<10;i++){
            int numer=(int)(Math.random()*100);
            num[i]=numer;
        }


        mayorMenor();
    }
    public void mayorMenor(){
        mayor=menor=num[0];
     for (int i = 0; i < num.length; i++) {
            if(num[i]>mayor){
          mayor=num[i];
            }
            if(num[i]<menor){
                menor=num[i];
            }
        }
        diferencia=mayor-menor;
        System.out.println("Numero mayor : "+mayor);
        System.out.println("Numero menor : "+menor);
        System.out.println("Distancia entre el mayor y el menor es: "+diferencia);
    }
    
}
