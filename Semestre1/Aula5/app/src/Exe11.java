import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em °C");
        double tempC = teclado.nextDouble();

        double tempF = (tempC*1.8)+32;

        System.out.printf("A temperatura em Fahrenheit é:" + tempF);
        teclado.close();
    }
}
