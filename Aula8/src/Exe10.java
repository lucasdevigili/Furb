import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        double x1;
        double y1;
        double x2;
        double y2;

        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();

        double subX = x2 - x1;
        double subY = y2 - y1;

        double xQuad = subX * subX;
        double yQuad = subY * subY;

        double sumXY = xQuad + yQuad;

        double distancia = Math.sqrt(sumXY);

        System.out.println(df_4.format(distancia));
        teclado.close();
    }
}