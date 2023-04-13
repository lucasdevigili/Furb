import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int inicio,
                fim;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        int tempo;

        if (inicio < fim) {
             tempo = fim - inicio;
        } else {
             tempo = 24 - inicio + fim;
        }

        System.out.println("O JOGO DUROU " + tempo + " HORAS");

        teclado.close();
    }
}