import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe31 {

    public static List<Integer> decomposicaoFatoresPrimos(int numero) {
        List<Integer> fatoresPrimos = new ArrayList<>();

        while (numero % 2 == 0) {
            fatoresPrimos.add(2);
            numero /= 2;
        }

        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            while (numero % i == 0) {
                fatoresPrimos.add(i);
                numero /= i;
            }
        }

        if (numero > 2) {
            fatoresPrimos.add(numero);
        }

        return fatoresPrimos;
    }

    public static void imprimirDecomposicao(int numero) {
        List<Integer> fatoresPrimos = decomposicaoFatoresPrimos(numero);

        System.out.println("número\tdecomposição");
        for (int fator : fatoresPrimos) {
            System.out.println(numero + "\t" + fator);
            numero /= fator;
        }

        System.out.println(numero + "\t1");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = teclado.nextInt();

        imprimirDecomposicao(numero);
        teclado.close();
    }
}
