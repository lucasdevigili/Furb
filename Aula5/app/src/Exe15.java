// import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        // Scanner teclado = new Scanner(System.in);

        // System.out.print("Digite um numero");
        // double numero = teclado.nextDouble();

        double x = 903;
        double unidade = x % 10;
        double dezena = x % 100;
        double dezena2 = dezena - unidade;
        double dezena3 = dezena2 / 10;
        double centena = (((x % 1000) - unidade)) / 100;

        System.out.println("unidade: " + unidade);
        System.out.println("dezena: " + dezena);
        System.out.println("centena: " + centena);

    }
}
