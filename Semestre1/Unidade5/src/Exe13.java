import java.util.Scanner;

public class Exe13{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o número total de reabastecimentos: ");
        int numReabastecimentos = teclado.nextInt();
        
        double totalKilometros = 0;
        double totalCombustivel = 0;
        
        System.out.println("Insira os dados de cada reabastecimento:");
        for (int i = 1; i <= numReabastecimentos; i++) {
            System.out.println("Reabastecimento #" + i);
            System.out.print("Odômetro na parada (em quilômetros): ");
            double odometro = teclado.nextDouble();
            
            System.out.print("Quantidade de combustível comprado (em litros): ");
            double combustivelComprado = teclado.nextDouble();
            
            double quilometragemPorLitro = odometro / combustivelComprado;
            System.out.println("Quilometragem por litro nesta parada: " + quilometragemPorLitro);
            
            totalKilometros += odometro;
            totalCombustivel += combustivelComprado;
        }
        
        double quilometragemMedia = totalKilometros / totalCombustivel;
        System.out.println("Quilometragem média por litro em toda a viagem: " + quilometragemMedia);
        teclado.close();
    }
}