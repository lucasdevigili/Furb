import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int A,
                B,
                C,
                D;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && (A % 2) == 0) {
            System.out.println("Número aceito");
        } else {
            System.out.println("Número não aceito");
        }
        teclado.close();
    }
}
