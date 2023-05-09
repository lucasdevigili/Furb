import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double altura = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.println("Digite a altura");
            double prompt = teclado.nextDouble(); 
            altura += prompt;
        }
        System.out.println(altura/20);     
        teclado.close();
    }
}
