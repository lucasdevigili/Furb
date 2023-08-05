import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma letra");
        char letra = teclado.next().toUpperCase().charAt(0);
        
        if (letra == 'a' || letra == 'A' ||
            letra == 'e' || letra == 'E' ||
            letra == 'i' || letra == 'I' ||
            letra == 'o' || letra == 'O' ||
            letra == 'u' || letra == 'U') {
            System.out.println("A letra é vogal");
        } else {
            System.out.println("A letra é consoante");
        }
        teclado.close();
    }
}
