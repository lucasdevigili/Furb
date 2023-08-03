import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");

        double A;
        double B;
        double C;


        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        double triangulo = (A * C) / 2;
        double circulo = (C * C)* 3.14159;
        double trapezio = ((A + B) * C) / 2;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.println("TRIANGULO: " + df_3.format(triangulo));
        System.out.println("CIRCULO: " + df_3.format(circulo));
        System.out.println("TRAPEZIO: " + df_3.format(trapezio));
        System.out.println("QUADRADO: " + df_3.format(quadrado));
        System.out.println("RETANGULO: " + df_3.format(retangulo));
        teclado.close();
    }
}
