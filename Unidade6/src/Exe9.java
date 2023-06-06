import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalClientes = 30;
        int somaNotas = 0;
        int somaNotasHomens = 0;
        int contMulheresMais50 = 0;
        int menorIdadeMulher = Integer.MAX_VALUE;
        int notaMulherMaisJovem = 0;
        int qtdMulheres = 0;

        for (int i = 1; i <= totalClientes; i++) {
            System.out.println("Cliente " + i + ":");

            System.out.print("Sexo (1 - feminino, 2 - masculino): ");
            int sexo = scanner.nextInt();

            System.out.print("Nota (0 a 10): ");
            int nota = scanner.nextInt();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            somaNotas += nota;

            if (sexo == 2) {
                somaNotasHomens += nota;
            } else if (sexo == 1) {
                qtdMulheres++;
                if (idade > 50 && nota > (somaNotas / totalClientes)) {
                    contMulheresMais50++;
                }
                if (idade < menorIdadeMulher) {
                    menorIdadeMulher = idade;
                    notaMulherMaisJovem = nota;
                }
            }
        }

        double mediaGeral = (double) somaNotas / totalClientes;
        double mediaHomens = (double) somaNotasHomens / (totalClientes - qtdMulheres);

        System.out.println("--------------- Resultados ---------------");
        System.out.println("Nota média recebida pelo cinema: " + mediaGeral);
        System.out.println("Nota média atribuída pelos homens: " + mediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Quantidade de mulheres com mais de 50 anos que deram nota superior à média: " + contMulheresMais50);

        scanner.close();
    }
}
