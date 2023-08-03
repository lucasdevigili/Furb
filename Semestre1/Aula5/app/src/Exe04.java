import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe04 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Digite a primeira nota do aluno");
        double notaUm = teclado.nextDouble();

        System.out.println("Digite a segunda nota do aluno");
        double notaDois = teclado.nextDouble();

        System.out.println("Digite a terceira nota do aluno");
        double notaTres = teclado.nextDouble();

        double media = ((notaUm * 5)+(notaDois * 3)+(notaTres * 2))/10;

        System.out.println("A média do aluno é de:" + df_2.format(media));
        teclado.close();

    }
}
