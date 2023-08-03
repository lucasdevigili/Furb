import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite o valor do litro");
        double valorLitro = teclado.nextDouble();

        System.out.println("Digite o valor que deseja abastecer");
        double dinheiro = teclado.nextDouble();

        double litros = dinheiro / valorLitro;

        System.out.println("A quantidade de litros abastecidos será:" + df_2.format(litros));
        teclado.close();

    }
}