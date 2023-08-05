import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua massa");
        double massa = teclado.nextDouble();

        System.out.println("Digite sua altura");
        double altura = teclado.nextDouble();

        double alturaQuad = altura * altura;
        double imc = massa / alturaQuad;

        if ( imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Saudável");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Sobrepeso Grau I");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Sobrepeso Grau II (severa)");
        } else if (imc >= 40) {
            System.out.println("Sobrepeso Grau II (severa)");
        }
        teclado.close();
    }
}
