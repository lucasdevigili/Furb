import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores (N): ");
        int N = scanner.nextInt();

        if (N > 20) {
            System.out.println("O valor informado excede o limite de 20 posições.");
            return;
        }

        double[] vetor = new double[N];

        preencherVetor(vetor); // Chama o método para preencher o vetor

        Map<Double, Integer> contagemValores = contarValores(vetor); // Chama o método para contar os valores

        System.out.println("Tabela de valores e contagem:");

        for (Map.Entry<Double, Integer> entry : contagemValores.entrySet()) {
            System.out.println("Valor: " + entry.getKey() + " | Contagem: " + entry.getValue());
        }

        scanner.close();
    }

    public static void preencherVetor(double[] vetor) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores para preencher o vetor:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        scanner.close();
    }

    public static Map<Double, Integer> contarValores(double[] vetor) {
        Map<Double, Integer> contagemValores = new HashMap<>();

        for (double valor : vetor) {
            if (contagemValores.containsKey(valor)) {
                contagemValores.put(valor, contagemValores.get(valor) + 1);
            } else {
                contagemValores.put(valor, 1);
            }
        }

        return contagemValores;
    }
}
