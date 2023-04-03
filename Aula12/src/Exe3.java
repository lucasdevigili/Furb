import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número A");
        int A = teclado.nextInt();

        System.out.print("Digite um número B");
        int B = teclado.nextInt();
        
        if (A > B) {
            System.out.println("o númeoro A é maior");
        } else {
            System.out.println("O número B é maior");
        }
        
        teclado.close();
    }
}