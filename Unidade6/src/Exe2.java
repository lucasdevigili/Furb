import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        double[] valores = new double[12];
        
        lerValores(valores);
        
        double media = calcularMedia(valores);
        
        System.out.println("Valores maiores que a média:");
        valoresMaioresQueMedia(valores, media);
    }
    
    public static void lerValores(double[] vetor) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 12 valores reais:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }
        
        scanner.close();
    }
    
    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        
        return soma / vetor.length;
    }
    
    public static void valoresMaioresQueMedia(double[] vetor, double media) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println(vetor[i]);
            }
        }
    }
}
