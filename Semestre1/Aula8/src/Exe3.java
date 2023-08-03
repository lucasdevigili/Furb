import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Integer A, B, PROD;

        A =  teclado.nextInt();
        B =  teclado.nextInt();

        PROD = A * B;

        System.out.printf("PROD = %d\n", PROD);
        teclado.close();
    }
}