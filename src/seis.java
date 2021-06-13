package src;

public class seis {
    int[][] num = { { 5, 6, 13 }, { 14, 2, 4 }, { 21, 7, 6 } };

    public static void main(String[] args) {
        seis s = new seis();
    }

    
    public seis() {
        System.out.println("Calculando multiplicacion de la matriz");
        for (int i = 0; i < num.length; i++) {
            for (int k = 0; k < num.length; k++) {
                num[i][k] *= 2;
            }
        }
        System.out.println("Resultado de la matriz: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
