import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o limite diário de peso de pesca (em quilogramas): ");
        double limiteDiario = teclado.nextDouble();
        
        double pesoTotal = 0.0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Digite o peso do peixe (em gramas): ");
            double pesoPeixe = teclado.nextDouble() / 1000;
            
            pesoTotal += pesoPeixe;
            
            if (pesoTotal > limiteDiario) {
                System.out.println("Limite diário excedido!");
                break;
            }
            
            System.out.println("Peso total da pesca até o momento: " + pesoTotal + " Kg");
            
            System.out.print("Deseja informar o peso de mais um peixe? (s/N): ");
            String resposta = teclado.next();
            
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
        
        teclado.close();
    }
}

