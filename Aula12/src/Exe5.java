import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("A cor é azul");
        char cor = teclado.next().toUpperCase().charAt(0);
        
        if (cor == 'S') {
            System.out.println("sim");
        } 
        else {
            System.out.println("não");
        }
        teclado.close();
    }
}