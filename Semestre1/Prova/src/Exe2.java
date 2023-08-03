import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite o preço do hotel");
        double preco = teclado.nextDouble();

        System.out.println("Digite o código do site");
        char menu = teclado.next().toUpperCase().charAt(0);

        int desconto = 0;

        switch (menu) {
            case 'A':
                if (preco > 1500) {
                    System.out.println("O valor ultrapassa o limite válido");
                } else {
                    desconto = (int) ((5 * preco) / 100);
                    System.out.println("Hotel: Trivago");
                    System.out.println("Desconto: " + df_2.format(desconto));
                    System.out.println("Preço total: " + df_2.format((preco - desconto)));
                }
                break;
            case 'B':
                if (preco > 800) {
                    System.out.println("O valor ultrapassa o limite válido");
                } else {
                    desconto = (int) ((10 * preco) / 100);
                    System.out.println("Hotel: Booking");
                    System.out.println("Desconto: " + df_2.format(desconto));
                    System.out.println("Preço total: " + df_2.format((preco - desconto)));
                }
                break;
            case 'C':
                if (preco > 2000) {
                    System.out.println("O valor ultrapassa o limite válido");
                } else {
                    desconto = (int) ((10 * preco) / 100);
                    System.out.println("Hotel: Hotel Hrbano");
                    System.out.println("Desconto: " + df_2.format(desconto));
                    System.out.println("Preço total: " + df_2.format((preco - desconto)));
                }
                break;
            case 'D':
                if (preco < 50 || preco > 800) {
                    System.out.println("O valor não está entre o limite válido");
                } else {
                    desconto = (int) ((15 * preco) / 100);
                    System.out.println("Hotel: Decolar");
                    System.out.println("Desconto: " + df_2.format(desconto));
                    System.out.println("Preço total: " + df_2.format((preco - desconto)));
                }
                break;
            case 'E':
                if (preco < 50 || preco > 800) {
                    System.out.println("O valor não está entre o limite válido");
                } else {
                    desconto = (int) ((20 * preco) / 100);
                    System.out.println("Hotel: Airbnb");
                    System.out.println("Desconto: " + df_2.format(desconto));
                    System.out.println("Preço total: " + df_2.format((preco - desconto)));
                }
                break;
            case 'F':
                desconto = (int) ((0 * preco) / 100);
                System.out.println("Hotel: Outros");
                System.out.println("Desconto: " + df_2.format(desconto));
                System.out.println("Preço total: " + df_2.format((preco - desconto)));
                break;
            default:
                System.out.println("Código inválido");
        }
        teclado.close();
    }
}
