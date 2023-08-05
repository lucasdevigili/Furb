import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor inicial (N): ");
        int N = teclado.nextInt();

        System.out.print("Digite o decremento (K): ");
        int K = teclado.nextInt();

        System.out.print("Digite o tamanho da mochila (M): ");
        int M = teclado.nextInt();

        List<Integer> elementosColocados = new ArrayList<>();
        List<Integer> elementosFora = new ArrayList<>();

        int somaColocados = 0;
        int somaFora = 0;

        while (N > 0 && M >= N) {
            elementosColocados.add(N);
            somaColocados += N;
            M -= N;
            N -= K;
        }

        while (N > 0) {
            elementosFora.add(N);
            somaFora += N;
            N -= K;
        }

        System.out.println("Elementos a serem colocados na mochila:");
        for (int elemento : elementosColocados) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("Elementos que entraram na mochila:");
        for (int elemento : elementosColocados) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("Elementos que ficaram fora da mochila:");
        for (int elemento : elementosFora) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.println("Soma dos elementos que entraram na mochila: " + somaColocados);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaFora);

        teclado.close();
    }
}
