import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.print("Digite o peso da carta");
        double peso = teclado.nextInt();
        
        if (peso > 50) {
            double pesoExtra = peso - 50;
            double fracao = pesoExtra / 20;
            double valorExtra = fracao * 0.45;
            double valorTotal = 0.45 + valorExtra;
            System.out.println("O valor será de R$ " + df_2.format(valorTotal));
        } else {
            System.out.println("O valor será de R$ 0,45");
        }
        
        teclado.close();
    }
}