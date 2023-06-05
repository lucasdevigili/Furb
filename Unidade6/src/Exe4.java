import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];
        
        lerValores(vetor1, vetor2);
        
        somarVetores(vetor1, vetor2, vetor3);
        
        System.out.println("Vetor 1:");
        escreverVetor(vetor1);
        
        System.out.println("Vetor 2:");
        escreverVetor(vetor2);
        
        System.out.println("Vetor 3 (soma dos vetores 1 e 2):");
        escreverVetor(vetor3);
    }
    
    public static void lerValores(int[] vetor1, int[] vetor2) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os valores do vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = scanner.nextInt();
        }
        
        System.out.println("Digite os valores do vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = scanner.nextInt();
        }
        
        scanner.close();
    }
    
    public static void somarVetores(int[] vetor1, int[] vetor2, int[] vetor3) {
        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }
    
    public static void escreverVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
