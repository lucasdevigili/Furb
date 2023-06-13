import java.util.Scanner;
import java.util.Arrays;

public class LucasGabrielDevigili_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int i = teclado.nextInt();

        int[] vetorUm = new int[i];
        int[] vetorDois = new int[i];
        int[] vetorTres = new int[i];

        lerValores(vetorUm, vetorDois);
        somarValores(vetorUm, vetorDois, vetorTres);
        escreverValores(vetorTres);

        teclado.close();
    }

    public static void lerValores(int[] vetorUm, int[] vetorDois) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite valores reais:");
        for (int i = 0; i < vetorUm.length; i++) {
            vetorUm[i] = teclado.nextInt();
        }

        System.out.println("Digite valores reais:");
        for (int i = 0; i < vetorDois.length; i++) {
            vetorDois[i] = teclado.nextInt();
        }

        teclado.close();
    }

    public static void somarValores(int[] vetorUm, int[] vetorDois, int[] vetorTres) {
        for (int i = 0; i < vetorUm.length; i++) {
            vetorTres[i] = vetorUm[i] + vetorDois[i];
        }
    }

    public static void ordnarValores(int[] vetorTres) {
        Arrays.sort(vetorTres);
    }

    public static void escreverValores(int[] vetorTres) {
        for (int i = 0; i < vetorTres.length; i++) {
            System.out.println(vetorTres[i]);
        }

        for (int i = 0; i < vetorTres.length; i++) {
            ordnarValores(vetorTres);
            System.out.println(vetorTres[i]);
        }
    }
}