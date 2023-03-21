import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe4 {
    public static void main(String[] args) {
        DecimalFormat df_5 = new DecimalFormat("0.00000");
        Scanner teclado = new Scanner(System.in);

        Double A, B, MEDIA;
        
        A = teclado.nextDouble();
        B = teclado.nextDouble();

        if (A >= 0 || A <= 10 & B >= 0 || B <= 10) {
            MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
        } else {
            MEDIA = 0.0;
        }

        System.out.printf("MÉDIA = " + df_5.format(MEDIA));
        teclado.close();
    }
}