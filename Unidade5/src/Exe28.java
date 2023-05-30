import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] votos = new int[4];
        int totalVotos = 0;

        String[] conjuntos = {
            "Nenhum de Nós",
            "CPM22",
            "Skank",
            "Jota Quest"
        };

        int resposta = 1;

        while (resposta == 1) {
            System.out.print("Mais um voto (s/N)? ");
            String opcao = teclado.next();

            if (opcao.equalsIgnoreCase("s")) {
                System.out.print("Código do conjunto (1 a 4): ");
                int codigo = teclado.nextInt();

                if (codigo >= 1 && codigo <= 4) {
                    votos[codigo - 1]++;
                    totalVotos++;
                } else {
                    System.out.println("Código inválido");
                }
            } else {
                resposta = 2;
            }
        }

        System.out.println("Resultados da votação:");

        for (int i = 0; i < 4; i++) {
            double percentual = (double) votos[i] / totalVotos * 100;
            System.out.printf("%s: %d votos (%.2f%%)\n", conjuntos[i], votos[i], percentual);
        }

        int indiceVencedor = 0;
        int maiorVotos = votos[0];

        for (int i = 1; i < 4; i++) {
            if (votos[i] > maiorVotos) {
                indiceVencedor = i;
                maiorVotos = votos[i];
            }
        }

        System.out.println("O grupo vencedor é: " + conjuntos[indiceVencedor]);

        teclado.close();
    }
}
