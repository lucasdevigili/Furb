import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de valores (N): ");
        int N = teclado.nextInt();
        
        double[] vetor = new double[N];
        
        lerVetor(vetor);

        System.out.print("Informe um valor real: ");
        double valor = teclado.nextDouble();
        
        boolean encontrado = encontrarValor(vetor, valor);
        
        if (encontrado) {
            System.out.println("O valor " + valor + " está cadastrado no vetor.");
        } else {
            System.out.println("O valor " + valor + " não está cadastrado no vetor.");
        }
        
        teclado.close();
    }
    
    public static void lerVetor(double[] vetor) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe os valores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextDouble();
        }
        
        teclado.close();
    }
    
    public static boolean encontrarValor(double[] vetor, double valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        
        return false;
    }
}
