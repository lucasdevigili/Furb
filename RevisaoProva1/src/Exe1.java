// 2950 BeeCrownd

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        double N,
            X,
            Y;

        N = teclado.nextInt();
        X = teclado.nextInt();
        Y = teclado.nextInt();

        double IMC = N / (X + Y);

        System.out.println(df_2.format(IMC));
        teclado.close();
    }
}
