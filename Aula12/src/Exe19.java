import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de X");
        int X = teclado.nextInt();

        System.out.println("Digite o valor de Y");
        int Y = teclado.nextInt();

        if ( X == 0 && Y == 0 ) {
            System.out.println("Quadrante 0");
        } else {
            if ( X > 0 && Y > 0 ) {
                System.out.println("O quadrante é 1");
            } else {
                if ( X < 0 && Y < 0 ) {
                    System.out.println("O quadrante é 2");
                } else { 
                    if ( X < 0  && Y > 0 ) {
                        System.out.println("O quadrante é 3");
                    } else { 
                        System.out.println("O quadrante é 4");
                    }
                }
            }
        }
        teclado.close();
    }
}