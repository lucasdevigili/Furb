import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a cartas um");
        int cartaUm = teclado.nextInt();

        System.out.println("Digite as cartas dois");
        int cartaDois = teclado.nextInt();

        System.out .println("Digite as cartas tres");
        int cartaTres = teclado.nextInt();

        int cartaBoa = 0;

        if (cartaUm == 1 || cartaUm == 2 || cartaUm == 3) {
            cartaBoa++;
        } 
        if (cartaDois == 1 || cartaDois == 2 || cartaDois == 3) {
            cartaBoa++;
        } 
        if (cartaTres == 1 || cartaTres == 2 || cartaTres == 3) {
            cartaBoa++;
        } 

        switch (cartaBoa) {
            case 1:
                System.out.println("TRUCO");
                break;
            case 2:
                System.out.println("SEIS");
                break;
            case 3:
                System.out.println("NOVE");
                break;
            default :
                System.out.println("Melhor não");
        }
        
        teclado.close();
    }
}
