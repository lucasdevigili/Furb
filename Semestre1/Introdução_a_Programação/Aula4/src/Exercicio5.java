import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número inteiro");
        int numeroA = teclado.nextInt();

        System.out.println("Informe o segundo número inteiro");
        int numeroB = teclado.nextInt();

        System.out.println("Informe o terceiro número inteiro");
        int numeroC = teclado.nextInt();

        System.out.println("Informe o quarto número inteiro");
        int numeroD = teclado.nextInt();

        int prodAB = numeroA * numeroB;
        int prodCD = numeroC * numeroD;

        int diferenca = prodAB - prodCD;

        System.out.println("A diferenca é " + diferenca);
        teclado.close();

    }
}
