import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro cateto");
        double catUm = teclado.nextDouble();

        System.out.println("Digite o comprimento do segundo cateto");
        double catDois = teclado.nextDouble();

        double hipotenusa = ((catUm * catUm)+(catDois * catDois))/2;

        System.out.println("A hipotenusa é:" + hipotenusa);
        teclado.close();
    }
}