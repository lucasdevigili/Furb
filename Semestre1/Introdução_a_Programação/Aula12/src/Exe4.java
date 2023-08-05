import java.util.Scanner;


public class Exe4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número:");
        double number = teclado.nextDouble();
        int numba = (int)number;

        if (number - numba == 0){
            System.out.println("No seu número não há alguma casa decimal");
        }
        else {
            System.out.println("No seu número possui alguma casa decimal");
        }

        teclado.close();
    }    
}