import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int numero, horasTrab;
        double salario;

        numero = teclado.nextInt();
        horasTrab = teclado.nextInt();
        salario = teclado.nextDouble();

        double salarioMes = horasTrab * salario;
        
        System.out.println("NUMBER = " + numero );
        System.out.println("SALARY = U$ " + df_2.format(salarioMes));
        teclado.close();
    }
}
