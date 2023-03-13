import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite quantas latas de tefrigerante deseja comprar");
        double QuantLatas = teclado.nextDouble();

        System.out.println("Digite a quantidade de garras de 600ml deseja comprar");
        double QuantGarrafinhas = teclado.nextDouble();

        System.out.println("Digite quantas garrafas de 2L desja comprar");
        double quantGarrafas = teclado.nextDouble();

        double litLatas = QuantLatas * 0.350;
        double litGarrafinhas = QuantGarrafinhas * 0.600;
        double litGarrafas = quantGarrafas * 2;

        double litTotal = litLatas+litGarrafinhas+litGarrafas;

        System.out.println("Você comprou " + df_2.format(litTotal) + " litros de refrigerante");
        teclado.close();
    }
}
