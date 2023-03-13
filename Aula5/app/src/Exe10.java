import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite o comprimento do primeiro cateto");
        double catUm = teclado.nextDouble();

        System.out.println("Digite o comprimento do segundo cateto");
        double catDois = teclado.nextDouble();

        double hipotenusa = ((catUm * 2)+(catDois * 2))/2;

        System.out.println("A hipotenusa é:" + df_2.format(hipotenusa));
        teclado.close();
    }
}
