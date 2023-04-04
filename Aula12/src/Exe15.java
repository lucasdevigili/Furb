import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite seu salário");
        double salario = teclado.nextDouble();

        System.out.println("Digite seu tempo de contribuição");
        int tempo = teclado.nextInt();

        double valorBonus = 0;

        if (tempo <= 12) {
            valorBonus = 0.05;
        } else if (tempo <= 13 || tempo <= 48) {
            valorBonus = 0.07;
        }

        double salarioBonus = valorBonus * salario;

        System.out.println("Seu bônus será de: " + df_2.format(salarioBonus));

        teclado.close();
    }
}