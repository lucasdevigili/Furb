import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        
        double salario;
        double vendas;

        String nome = teclado.next();
        salario = teclado.nextDouble();
        vendas = teclado.nextDouble();

        double bonus = vendas * 0.15;
        double total = salario + bonus;
        
        System.out.println("TOTAL = R$ " + df_2.format(total) );
        teclado.close();
    }
}