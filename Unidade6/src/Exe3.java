import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        double[] valores = new double[12];
        
        lerValores(valores);
        
        ajustarValores(valores);
        
        System.out.println("Vetor resultante:");
        escreverValores(valores);
    }
    
    public static void lerValores(double[] vetor) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 12 valores reais:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }
        
        scanner.close();
    }
    
    public static void ajustarValores(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] *= 1.02;
            } else {
                vetor[i] *= 1.05;
            }
        }
    }
    
    public static void escreverValores(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
