import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numb;

        numb = teclado.nextInt();

        if (numb > 0 && numb < 25) {
            System.out.println("Intervalo [0,25]");
        } else if (numb > 25 && numb < 50) {
            System.out.println("Intervalo [25,50]");
        } else if (numb > 50 && numb < 75) {
            System.out.println("Intervalo [50,75]");
        } else if (numb > 75 && numb < 100) {
            System.out.println("Intervalo [75,100]");
        } else {
            System.err.println("Fora de intervalo");
        }

        teclado.close();
    }
}
