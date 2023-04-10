import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite sua renda total bruta");
        double redaTotal = teclado.nextDouble();

        System.out.println("Digite seus gastos totais");
        double despesaTotal = teclado.nextDouble();

        System.out.println("Digite a quantidade de dependentes");
        int dependentes = teclado.nextInt();

        double rendaLiquida = redaTotal - despesaTotal;
        double descontoDependente = ((2 * rendaLiquida ) / 100) * dependentes;
        int valorPago = 0;

        if (rendaLiquida <= 2000) {
            valorPago = 0;
        } else if (rendaLiquida > 2000 && rendaLiquida <= 5000) {
            valorPago = 5;
        } else if (rendaLiquida > 5000 && rendaLiquida <= 10000) {
            valorPago = 10;
        } else { 
            valorPago = 15;
        }

        double restante = rendaLiquida - (valorPago - descontoDependente);

        System.out.println("O valor restante é de: " + df_2.format(restante));

        teclado.close();
    }
}