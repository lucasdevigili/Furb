import java.util.Scanner;
import java.util.Random;

public class Exe8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();   

        System.out.println("Digite um número");
        int n = teclado.nextInt();

        int numeroN = 0;
        int numeroP = 0;
        int soma = 0;
        int I = 0;

        for(int i = 0; i < n; i++){
            int randomNumber = random.nextInt(2001) - 1000;
            if(randomNumber <= numeroN) {
               numeroN += randomNumber;
            } else {
                int sum = numeroP + randomNumber;
                soma += sum;
            }
            I += i;
            
            System.out.println(randomNumber);
        }
        int divisao = soma / I;

        System.out.println("Menor numero: " + numeroN);
        System.out.println("Media: " + divisao);
        teclado.close();
    }
}
