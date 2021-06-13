package src;

public class cinco {

    public static void main(String[] args) 
    { 
        int i;
        int Snotas = 0; 
        double medioM;
         
        
        int[] Notas = { 5, 7, 2, 3, 9, 5, 6, 8, -50 };
        String[] Alumnos = { "alumno1", "alumno2", "alumno3", "alumno4", "alumno5", "alumno6", "alumno7", "alumno8", "alumno9" };

        for (i = 0; i < Notas.length; i++)
        { 
            Console.writeLine("La nota de {0} es: {1}", Alumnos[i], Notas[i]);
        }

        for (i = 0; i < Notas.length; i++)
        { 
            Snotas = Snotas + Notas[i]/2;
        }

        medioM = Snotas / Notas.length;
        Console.WriteLine("-----------------");
        Console.WriteLine("La suma de todas las notas es")
        Consola.writeLine("El medio de las notas es: (0)", medioM);
        Console.ReadLine();  

    }
         }
