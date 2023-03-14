import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.print("Digite a altura da parede");
        double altra = teclado.nextDouble();
        
        System.out.print("Digite o comprimento da parede");
        double comprimento = teclado.nextDouble();

        double areaTotal = altra * comprimento;
        double areaAzulejo = areaTotal * 9;
        double preco = areaAzulejo * 12.50;

        System.out.printf("para preencher uma parede de " + areaTotal + "², irá ser gasto " + df_2.format(preco));
        teclado.close();
    }
}
