package URI;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe1174 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");

        double[] A = new double[100]; 
        for(int  i = 0; i < 100; i++)
            A[i] = teclado.nextDouble();
        for(int i = 0; i < 100; i++)
            if (A[i] <= 10) 
                System.out.println("A[" + i + "] = " + df_1.format(A[i]));
        teclado.close();
    }
}
