import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int M = 0;
        int vM = 0;
        int F = 0;
        int vF = 0;
        int U = 1;

        while (U > 0) {
            System.out.println("Digite M para masculino e F para feminino");
            char sexo = teclado.next().toLowerCase().charAt(0);

            switch (sexo) {
                case 'm':
                    System.out.println("Digite a altura do Homem");
                    int alturaM = teclado.nextInt();
                    if (alturaM > 0) {
                        M += alturaM;
                        vM++;
                        break;
                    } else {
                        U = 0;
                        break;
                    }
                case 'f':
                    System.out.println("Digite a altura da Mulher");
                    int alturaF = teclado.nextInt();
                    if (alturaF > 0) {
                        F += alturaF;
                        vF++;
                        break;
                    } else {
                        U = 0;
                        break;
                    }
                default:
                    System.out.println("Insira um valor válido");
            }
        }

        if (vM > 0) {
            System.out.println("Média masculina: " + (M / vM));
        } else {
            System.out.println("Nenhuma altura masculina foi inserida.");
        }

        if (vF > 0) {
            System.out.println("Média feminina: " + (F / vF));
        } else {
            System.out.println("Nenhuma altura feminina foi inserida.");
        }

        teclado.close();
    }
}
