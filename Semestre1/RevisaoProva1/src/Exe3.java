// 2786 BeeCrownd
import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int L,
            C;

        L = teclado.nextInt();
        C = teclado.nextInt();

        //int area = L * C;
        int quantidadeUm = (C * L) + ((C - 1) * (L - 1));
        int quantidadeDois = ((C - 1) + (L - 1)) * 2;

        System.out.println(quantidadeUm);
        System.out.println(quantidadeDois);
        teclado.close();
   }
}
