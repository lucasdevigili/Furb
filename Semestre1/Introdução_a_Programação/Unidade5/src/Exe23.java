import java.util.Scanner;

public class Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Digite o nome do vendedor: ");
            String nome = teclado.nextLine();
            
            System.out.print("Digite o número de produtos vendidos: ");
            int numeroProdutos = teclado.nextInt();
            
            double totalVendas = 0.0;
            
            for (int i = 1; i <= numeroProdutos; i++) {
                System.out.println("Produto #" + i);
                System.out.print("Digite o preço unitário do produto: R$ ");
                double precoUnitario = teclado.nextDouble();
                
                System.out.print("Digite a quantidade vendida do produto: ");
                int quantidadeVendida = teclado.nextInt();
                
                double vendaProduto = precoUnitario * quantidadeVendida;
                totalVendas += vendaProduto;
            }
            
            double salario = totalVendas * 0.3;
            
            System.out.println("Relatório do Vendedor");
            System.out.println("Nome: " + nome);
            System.out.println("Total de vendas: R$ " + totalVendas);
            System.out.println("Salário: R$ " + salario);
            
            teclado.nextLine(); // Limpar o buffer de entrada
            
            System.out.print("Deseja digitar os dados de mais um vendedor? (s/N): ");
            String resposta = teclado.nextLine();
            
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
        
        teclado.close();
    }
}

