import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Matrizes => Array - Bidimencional

        //Declarção: tipo[][] nome[][] = new tipo[L][C]

        //EX:
        int M[][] = new int[5][10];

        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 10; j++)
                M[i][j] = teclado.nextInt();

        //Métodos = subrotinas (trechos de códigos)

        teclado.close();
    }
}
