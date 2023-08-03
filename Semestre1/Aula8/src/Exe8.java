import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int codigoUm;
        int numeroUm;
        double valorUm;

        int codigoDois;
        int numeroDois;
        double valorDois;

        codigoUm = teclado.nextInt();
        numeroUm = teclado.nextInt();
        valorUm = teclado.nextDouble();

        codigoDois = teclado.nextInt();
        numeroDois = teclado.nextInt();
        valorDois = teclado.nextDouble();

        double totalUm = numeroUm * valorUm;
        double totalDois = numeroDois * valorDois;

        double total = totalUm + totalDois;

        System.out.println("VALOR A PAGAR: R$ " + df_2.format(total));
        teclado.close();
    }
}
