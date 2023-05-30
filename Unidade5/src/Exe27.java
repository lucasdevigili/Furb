import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int maiorProducao = 0;
        int diaMaiorProducao = 0;
        int totalProducaoManha = 0;
        int totalProducaoTarde = 0;
        int totalFuncionarios = 0;

        int resposta = 1;

        while (resposta == 1) {
            System.out.print("Dia do mês (1 a 30): ");
            int dia = teclado.nextInt();

            if (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
                continue;
            }

            System.out.print("Produção pela manhã: ");
            int producaoManha = teclado.nextInt();

            System.out.print("Produção pela tarde: ");
            int producaoTarde = teclado.nextInt();

            double valorDiario = 0.0;

            if (dia <= 15) {
                if (producaoManha >= 30 && producaoTarde >= 30 && (producaoManha + producaoTarde) > 100) {
                    valorDiario = (producaoManha + producaoTarde) * 0.8;
                } else {
                    valorDiario = (producaoManha + producaoTarde) * 0.5;
                }
            } else {
                valorDiario = (producaoManha * 0.4) + (producaoTarde * 0.3);
            }

            System.out.printf("Valor recebido: R$ %.2f\n", valorDiario);

            if (producaoManha + producaoTarde > maiorProducao) {
                maiorProducao = producaoManha + producaoTarde;
                diaMaiorProducao = dia;
            }

            if (producaoManha > totalProducaoManha) {
                totalProducaoManha = producaoManha;
            }

            if (producaoTarde > totalProducaoTarde) {
                totalProducaoTarde = producaoTarde;
            }

            totalFuncionarios++;

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            resposta = teclado.nextInt();
        }

        System.out.println("Dia da maior produção: " + diaMaiorProducao);
        System.out.println("Período de maior produção: " + (totalProducaoManha > totalProducaoTarde ? "manhã" : "tarde"));
        System.out.println("Quantidade de funcionários: " + totalFuncionarios);

        teclado.close();
    }
}

