import java.util.Arrays;
import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de valores (N): ");
        int N = teclado.nextInt();
        
        if (N > 20) {
            System.out.println("O valor informado excede o limite de 20 posições.");
        }
        
        int[] vetor = new int[N];
        
        preencherVetor(vetor);
        
        System.out.println("Vetor original: " + Arrays.toString(vetor));
        
        ordenarVetor(vetor);
        
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
        
        teclado.close();
    }
    
    public static void preencherVetor(int[] vetor) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite os valores para preencher o vetor:");
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            int valor = teclado.nextInt();
            
            if (!verificarExistencia(vetor, valor, i)) {
                vetor[i] = valor;
            } else {
                System.out.println("Valor já existente. Digite um novo valor.");
                i--;
            }
        }
        
        teclado.close();
    }
    
    public static boolean verificarExistencia(int[] vetor, int valor, int indice) {
        for (int i = 0; i < indice; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        
        return false;
    }
    
    public static void ordenarVetor(int[] vetor) {
        Arrays.sort(vetor);
    }
}
