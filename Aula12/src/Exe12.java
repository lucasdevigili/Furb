import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado 1");
        int ladoUm = teclado.nextInt();

        System.out.println("Digite o tamanho do lado 2");
        int ladoDois = teclado.nextInt();

        System.out.println("Digite o tamanho do lado 3");
        int ladoTres = teclado.nextInt();

        if (ladoUm < (ladoDois + ladoTres) && ladoDois < (ladoUm + ladoTres) && ladoTres < (ladoUm + ladoTres)) {
            if (ladoUm == ladoDois && ladoUm == ladoTres) {
                System.out.println("É equilatero");
            } else {
                if (ladoUm == ladoDois || ladoDois == ladoTres || ladoUm == ladoTres) {
                    System.out.println("É isósceles");
                } else {
                    System.out.println("É escaleno");
                }
            }
        } else {
            System.out.println("Não forma nenhum triângulo");
        }
        teclado.close();
    }
}
