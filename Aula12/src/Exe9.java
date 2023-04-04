import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número");
        int numeroUm = teclado.nextInt();

        System.out.println("Digite um número");
        int numeroDois = teclado.nextInt();

        int divisao = numeroUm % numeroDois;

        if (divisao == 0) {
            System.out.println("Os números são múltiplos");
        } else {
            System.out.println("Os números não são múltiplos");
        }
        teclado.close();
    }

}