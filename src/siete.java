package src;

public class siete {
    int[][] num = new int[4][3];
    int aleat, aux1 = 0, suma = 0;

    public static void main(String[] args) {
        siete s = new siete();
    }

    public siete() {
        for (int i = 0; i < 4; i++) {
         for (int k = 0; k < 3; k++) {
                aleat = (int) (Math.random() * 555 + 1);
                num[i][k] = aleat;
            }
        }
        presentar();

        sumar();
    }

    public void presentar() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.print(num[i][j] + "  ");
            }
            System.out.println("");
        }

    }

    public void sumar() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
            suma += num[1][j];
            aux1 += num[3][j];
            }
        }
        System.out.println("Total de suma de fila1 presentando numero par es: " + suma);

        System.out.println("Total de suma de la fila2 presentando numero par es: " + aux1);
    }

}
