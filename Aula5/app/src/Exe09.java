import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite a altura do barril");
        double altura = teclado.nextDouble();

        System.out.println("Digite o raio do barril");
        double raio = teclado.nextDouble();

        double raioQuadrado = raio * raio;
        double volume = 2 * raioQuadrado * altura;

        System.out.println("O volume do barril é de:" + df_2.format(volume));
        teclado.close();
    }
}
