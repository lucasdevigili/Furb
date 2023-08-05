import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double totalRecebido = 0;
        
        while (true) {
            System.out.print("Digite o valor da compra (0 para sair): ");
            double valorCompra = teclado.nextDouble();
            
            if (valorCompra == 0) {
                break;
            }
            
            double desconto;
            if (valorCompra > 500) {
                desconto = 0.2; 
            } else {
                desconto = 0.15; 
            }
            
            double valorDesconto = valorCompra * desconto;
            double valorTotal = valorCompra - valorDesconto;
            
            System.out.println("Total a pagar: R$ " + valorTotal);
            
            totalRecebido += valorTotal;
        }
        
        System.out.println("Valor total recebido pela loja: R$ " + totalRecebido);
        
        teclado.close();
    }
}

