import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite o numero de galinhas na granja");
        double galinhas = teclado.nextDouble();

        double peDireito = galinhas*4;
        double peEscquerdo =  (galinhas*3.50)*2;
        double total = peDireito + peEscquerdo;

        System.out.println("Seu gasto com chips é de:" + df_2.format(total));
        teclado.close();
    }
}
