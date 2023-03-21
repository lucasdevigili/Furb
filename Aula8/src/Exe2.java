import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0000");

        Double R;
        Double Pi = 3.14159;

        R = teclado.nextDouble();

        Double R2;
        R2 = R * R;

        Double A;

        A = Pi * R2;

        System.out.println("A=" + deci.format(A));

        teclado.close();
    }  
}
