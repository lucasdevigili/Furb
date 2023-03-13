import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite a quilagem do prato");
        double pesoTotal = teclado.nextDouble();

        double pesoPrato = 0.750;
        double pesoComida = pesoTotal - pesoPrato;
        double preco = pesoComida * 25;

        System.out.println("Valor do prato foi de:" + df_2.format(preco));
        teclado.close();
    }
}