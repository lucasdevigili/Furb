import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_4 = new DecimalFormat("0.0000");
   
    // Entrada
    double pi = 3.14159;
    System.out.println("Informe o valor do raio");
    double raio = teclado.nextDouble();


    // Processo
    double area = pi * Math.pow(raio, 2);

    // Saída
    System.out.println("A=" + df_4.format(area));
    teclado.close();
  }
}
