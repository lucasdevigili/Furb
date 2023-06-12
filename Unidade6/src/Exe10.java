import java.util.Scanner;

public class Exe10 {
    private static final int CAPACIDADE = 50;
    private static int[] vetor = new int[CAPACIDADE];
    private static int tamanho = 0;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao;

        do {
            exibirMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    incluirValor();
                    break;
                case 2:
                    pesquisarValor();
                    break;
                case 3:
                    alterarValor();
                    break;
                case 4:
                    excluirValor();
                    break;
                case 5:
                    mostrarValores();
                    break;
                case 6:
                    ordenarValores();
                    break;
                case 7:
                    inverterValores();
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }
        } while (opcao != 8);

        teclado.close();
    }

    public static void exibirMenu() {
        System.out.println("----------- MENU -----------");
        System.out.println("1 - Incluir valor");
        System.out.println("2 - Pesquisar valor");
        System.out.println("3 - Alterar valor");
        System.out.println("4 - Excluir valor");
        System.out.println("5 - Mostrar valores");
        System.out.println("6 - Ordenar valores");
        System.out.println("7 - Inverter valores");
        System.out.println("8 - Sair do sistema");
        System.out.println("-----------------------------");
    }

    public static void incluirValor() {
        if (tamanho >= CAPACIDADE) {
            System.out.println("Não é possível incluir mais valores. O vetor está cheio.");
            return;
        }

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor a ser incluído: ");
        int valor = teclado.nextInt();

        vetor[tamanho] = valor;
        tamanho++;

        System.out.println("Valor incluído no vetor.");
        teclado.close();
    }

    public static void pesquisarValor() {
        if (tamanho == 0) {
            System.out.println("O vetor está vazio. Não é possível pesquisar valores.");
            return;
        }

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor a ser pesquisado: ");
        int valor = teclado.nextInt();

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                System.out.println("O valor está presente no vetor.");
                return;
            }
        }

        System.out.println("O valor não está presente no vetor.");
        teclado.close();
    }

    public static void alterarValor() {
        if (tamanho == 0) {
            System.out.println("O vetor está vazio. Não é possível alterar valores.");
            return;
        }

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número a ser alterado: ");
        int numeroAntigo = teclado.nextInt();

        System.out.print("Digite o novo número: ");
        int novoNumero = teclado.nextInt();

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numeroAntigo) {
                vetor[i] = novoNumero;
                System.out.println("Número alterado com sucesso.");
                return;
            }
        }
        
        System.out.println("Número não encontrado no vetor.");
        teclado.close();
    }

    public static void excluirValor() {
        if (tamanho == 0) {
            System.out.println("O vetor está vazio. Não é possível excluir valores.");
            return;
        }

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor a ser excluído: ");
        int valor = teclado.nextInt();

        int posicao = -1;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                posicao = i;
                break;
            }
        }

        if (posicao == -1) {
            System.out.println("Valor não encontrado no vetor.");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            vetor[i] = vetor[i + 1];
        }

        tamanho--;
        System.out.println("Valor excluído do vetor.");
        teclado.close();
    }

    public static void mostrarValores() {
        if (tamanho == 0) {
            System.out.println("O vetor está vazio.");
            return;
        }

        System.out.println("Valores no vetor:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
    }

    public static void ordenarValores() {
        if (tamanho == 0) {
            System.out.println("O vetor está vazio. Não é possível ordenar valores.");
            return;
        }

        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("Valores ordenados em ordem crescente.");
    }

    public static void inverterValores() {
        if (tamanho == 0) {
            System.out.println("O vetor está vazio. Não é possível inverter valores.");
            return;
        }

        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio < fim) {
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
        }

        System.out.println("Valores invertidos.");
    }
}
