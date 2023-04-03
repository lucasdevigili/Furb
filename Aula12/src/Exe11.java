import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o ano de nscimento do filho 1");
        int filhoUm = teclado.nextInt();

        System.out.println("Digite o ano de nscimento do filho 2");
        int filhoDois = teclado.nextInt();

        System.out.println("Digite o ano de nscimento do filho 3");
        int filhoTres = teclado.nextInt();

        if (filhoUm == filhoDois && filhoUm == filhoTres) {
            System.out.println("São trigemeos");
        } else if (filhoUm == filhoDois || filhoDois == filhoTres || filhoUm == filhoTres) {
            System.out.println("São gemeos");
        } else {
            System.out.println("São apenas irmãos");
        }
        teclado.close();
    }
}