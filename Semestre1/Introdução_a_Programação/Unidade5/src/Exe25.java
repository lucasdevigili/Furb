import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int pontosDireita = 0;
        int pontosEsquerda = 0;
        
        while (true) {
            System.out.print("Digite o código do ponto (D/E): ");
            String codigoPonto = teclado.nextLine();
            
            if (codigoPonto.equalsIgnoreCase("D")) {
                pontosDireita++;
            } else if (codigoPonto.equalsIgnoreCase("E")) {
                pontosEsquerda++;
            } else {
                System.out.println("Código de ponto inválido. Tente novamente.");
                continue;
            }
            
            if ((pontosDireita >= 21 || pontosEsquerda >= 21) && Math.abs(pontosDireita - pontosEsquerda) >= 2) {
                break;
            }
        }
        
        if (pontosDireita > pontosEsquerda) {
            System.out.println("Jogador da direita venceu!");
        } else {
            System.out.println("Jogador da esquerda venceu!");
        }
        
        teclado.close();
    }
}
