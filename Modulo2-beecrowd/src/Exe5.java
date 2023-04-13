import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int inicio,
                fim;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        if (inicio == fim) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (inicio < fim) {
            int tempo = fim - inicio;
            
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
        } else if (inicio > fim) {
            int temp = 
        }

        teclado.close();
    }
}