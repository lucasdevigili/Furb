import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_5 = new DecimalFormat("0.00000");

        double A, B, MEDIA;

        A = teclado.nextDouble();
        B = teclado.nextDouble();

        MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
        
        System.out.println("MEDIA = " + df_5.format(MEDIA));

        teclado.close();
    }
}