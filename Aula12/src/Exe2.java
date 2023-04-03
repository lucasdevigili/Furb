import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número");
        int numero = teclado.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
        
        teclado.close();
    }
}