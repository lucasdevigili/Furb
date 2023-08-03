import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a altura do terreno");
        double altura = teclado.nextDouble();

        System.out.println("Digite o comprimento do terreno");
        double comprimento = teclado.nextDouble();

        double area = (altura*comprimento);

        System.out.printf("A área é:" + area);
        teclado.close();
    }
}