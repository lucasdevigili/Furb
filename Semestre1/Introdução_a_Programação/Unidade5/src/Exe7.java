import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digitem um número");
        int N = teclado.nextInt();

        for(int i = 1; i <= N; i++) {
            System.out.println(Math.random());
        }
        teclado.close();
    }
}
