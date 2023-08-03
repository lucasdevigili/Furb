import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a idade do Marquinhos");
        int marquinhos = teclado.nextInt();

        System.out.println("Digite a idade do Zezinho");
        int zezinho = teclado.nextInt();

        System.out.println("Digite a idade da Luluzinha");
        int luluzinha = teclado.nextInt();

        if (marquinhos < zezinho && marquinhos < luluzinha) {
            System.out.println("Marquinhos é o caçula");
        } else if (zezinho < marquinhos && zezinho < luluzinha) {
            System.out.println("Zezinho é o caçula");
        } else {
            System.out.println("Luluzinha é a caçula");
        }
        teclado.close();
    }
}
