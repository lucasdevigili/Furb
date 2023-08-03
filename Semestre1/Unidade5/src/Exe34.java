import java.util.Scanner;

public class Exe34 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao;
        int contasEncerradas = 0;
        int totalHospedes = 0;

        do {
            exibirOpcoes();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do hóspede: ");
                    String nomeHospede = teclado.next();
                    System.out.print("Digite o número de diárias: ");
                    int numDiarias = teclado.nextInt();

                    double taxaServicos = calcularTaxaServicos(numDiarias);
                    double totalAPagar = 50 * numDiarias + taxaServicos;

                    System.out.println("Nome do hóspede: " + nomeHospede);
                    System.out.println("Total a ser pago: R$ " + totalAPagar);

                    contasEncerradas++;
                    totalHospedes++;
                    break;

                case 2:
                    System.out.println("Número de contas encerradas: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção incorreta! Digite um número de opção válido.");
            }

        } while (opcao != 3);

        System.out.println("Total de hóspedes que deixaram o hotel: " + totalHospedes);
        teclado.close();
    }

    public static void exibirOpcoes() {
        System.out.println("(1) Encerrar conta de um hóspede");
        System.out.println("(2) Verificar número de contas encerradas");
        System.out.println("(3) Sair");
        System.out.print("Digite a opção desejada: ");
    }

    public static double calcularTaxaServicos(int numDiarias) {
        if (numDiarias < 15) {
            return 7.5 * numDiarias;
        } else if (numDiarias == 15) {
            return 6.5 * numDiarias;
        } else {
            return 5 * numDiarias;
        }
    }
}
