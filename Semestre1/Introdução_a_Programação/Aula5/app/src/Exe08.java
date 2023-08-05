import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite a quantidade de dólares que deseja trocar");
        double dollar = teclado.nextDouble();

        double valDollar = 5.26;
        double real = dollar/valDollar;

        System.out.println("Você deve devolver " + df_2.format(real) + " reais");
        teclado.close();
    }
}
