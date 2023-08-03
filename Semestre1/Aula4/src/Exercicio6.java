import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("Informe o seu ID");
        double id = teclado.nextDouble();

        System.out.println("Informe as suas horas trabalhadas");
        double horas = teclado.nextDouble();

        System.out.println("Informe o seu peço por hora");
        double precoH = teclado.nextDouble();

        double salario = horas * precoH * 22;

        System.out.printf("Olá funcionario" + id + "seu salário é de" + df_2.format(salario));
        teclado.close();

    }
}
