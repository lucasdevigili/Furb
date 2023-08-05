import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de linhas");
        int N = teclado.nextInt();

        int count = 1;
        for (int i = 1; i <= N; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print(count + "");
                count++;
            }
            System.out.println();
        }
        teclado.close();
    }
}
