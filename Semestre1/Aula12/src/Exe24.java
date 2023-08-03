import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int numeroUm = teclado.nextInt();

        System.out.println("Digite o segundo valor");
        int numeroDois = teclado.nextInt();

        System.out.println("Digite o terceiro valor");
        int numeroTres = teclado.nextInt();

        System.out.println("Digite a ordem que quera aparecer" + "\n 1 para ordem crescente"
                + "\n 2 para ordem decrescente" + "\n 3 para o maior ficar no meio");
        int menu = teclado.nextInt();
        
        int maior = 0;
        int meio = 0;
        int menor = 0;

        if ( numeroUm > numeroDois && numeroUm > numeroTres && numeroDois > numeroTres) {
            maior = numeroUm;
            meio = numeroDois;
            menor = numeroTres;

        } else if (  numeroUm > numeroDois && numeroUm > numeroTres && numeroTres > numeroDois ) {
            maior = numeroUm;
            meio = numeroTres;
            menor = numeroDois;

        } else if ( numeroDois > numeroUm && numeroDois > numeroTres && numeroUm > numeroTres) {
            maior = numeroDois;
            meio = numeroUm;
            menor = numeroTres;

        } else if ( numeroDois > numeroUm && numeroDois > numeroTres &&  numeroTres > numeroUm ) {
            maior = numeroDois;
            meio = numeroTres;
            menor = numeroUm;

        } else if ( numeroTres > numeroUm && numeroTres > numeroDois &&  numeroUm > numeroDois ) {
            maior = numeroTres;
            meio = numeroUm;
            menor = numeroDois;

        } else if ( numeroTres > numeroUm && numeroTres > numeroDois &&  numeroDois > numeroUm ) {
            maior = numeroTres;
            meio = numeroDois;
            menor = numeroUm;
        }

        switch (menu) {
            case 1:
                System.out.println(menor);
                System.out.println(meio);
                System.out.println(maior);
                break;
            case 2:
                System.out.println(maior);
                System.out.println(meio);
                System.out.println(menor);
                break;
            case 3:
                System.out.println(meio);
                System.out.println(maior);
                System.out.println(menor);
                break;
        }
        teclado.close();
    }
}
