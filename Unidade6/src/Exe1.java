import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        lerNumeros(numeros);
        
        System.out.println("Números em ordem inversa:");
        escreverNumerosInversos(numeros);
    }
    
    public static void lerNumeros(int[] vetor) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        scanner.close();
    }
    
    public static void escreverNumerosInversos(int[] vetor) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}