import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite a data de vencimento");
        int vencimento = teclado.nextInt();

        System.out.println("Digite a data de pagamento");
        int pagamento = teclado.nextInt();

        System.out.println("Digite o valor pago");
        double valor = teclado.nextDouble();

        if (pagamento <= vencimento) {
            double desconto = valor - (10 * valor / 100);
            System.out.println("Pagamento em dia. Valor pago: " + df_2.format(desconto));
        } else if (pagamento > (vencimento + 5)) {
            double multa = (pagamento - vencimento) + (2 * valor / 100);
            System.out.println("Pagamento atrasado. Valor pago: " + df_2.format(multa));
        }
        teclado.close();
    }
}
