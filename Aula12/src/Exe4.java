import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");

        System.out.print("Digite um número");
        double numero = teclado.nextDouble();
        String numeroString = Double.toString(numero);
    
        // TODO IF não está fincionando

        if (numeroString == df_1.format(numero)) {
            System.out.println("O número tem decimal");
        } else {
            System.out.println("O número não tem decimal");
        }
        
        teclado.close();
    }
}