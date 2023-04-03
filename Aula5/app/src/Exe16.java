import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Valor da compra: ");
        int valorCompra = teclado.nextInt();
        
        System.out.print("Valor pago: ");
        int valorPago = teclado.nextInt();
        
        int troco = valorPago - valorCompra;
        
        int notas100 = troco / 100;
        troco = troco % 100;
        
        int notas10 = troco / 10;
        troco = troco % 10;
        
        int notas1 = troco;
        
        System.out.println("Número mínimo de notas: " + (notas100 + notas10 + notas1));
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 1: " + notas1);
        teclado.close();
    }
}