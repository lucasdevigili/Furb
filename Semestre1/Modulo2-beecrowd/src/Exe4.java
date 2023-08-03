import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroUm,
                numeroDois,
                numeroTres;

        numeroUm = teclado.nextInt();
        numeroDois = teclado.nextInt();
        numeroTres = teclado.nextInt();

        int maior = 0;
        int meio = 0;
        int menor = 0;

        if (numeroUm > numeroDois && numeroUm > numeroTres && numeroDois > numeroTres) {
            maior = numeroUm;
            meio = numeroDois;
            menor = numeroTres;

        } else if (numeroUm > numeroDois && numeroUm > numeroTres && numeroTres > numeroDois) {
            maior = numeroUm;
            meio = numeroTres;
            menor = numeroDois;

        } else if (numeroDois > numeroUm && numeroDois > numeroTres && numeroUm > numeroTres) {
            maior = numeroDois;
            meio = numeroUm;
            menor = numeroTres;

        } else if (numeroDois > numeroUm && numeroDois > numeroTres && numeroTres > numeroUm) {
            maior = numeroDois;
            meio = numeroTres;
            menor = numeroUm;

        } else if (numeroTres > numeroUm && numeroTres > numeroDois && numeroUm > numeroDois) {
            maior = numeroTres;
            meio = numeroUm;
            menor = numeroDois;

        } else if (numeroTres > numeroUm && numeroTres > numeroDois && numeroDois > numeroUm) {
            maior = numeroTres;
            meio = numeroDois;
            menor = numeroUm;
        }

        System.out.println(menor + "\n" + meio + "\n" + maior + "\n" + "\n" + numeroUm + "\n" + numeroDois + "\n" + numeroTres);

        teclado.close();
    }
}