import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Selecione a operação" + "\n T para calcular a área de um triângulo"
                + "\n Q para calcular a área de um quadrado" + "\n R para calcular a área de um retângulo"
                + "\n C para calcular a área de um círculo");
        char menu = teclado.next().toUpperCase().charAt(0);

        switch (menu) {
            case 'T' :
                System.out.println("Digite o valor da base");
                double baseT = teclado.nextDouble();
                System.out.println("Digite o valor da altura");
                double alturaT = teclado.nextDouble();
                System.out.println("A área é de: " + ((baseT * alturaT) / 2));
            case 'Q' :
                System.out.println("Digite o valor da base");
                double baseQ = teclado.nextDouble();
                System.out.println("A área é de: " + (baseQ * baseQ));
            case 'R' :
                System.out.println("Digite o valor da base");
                double baseR = teclado.nextDouble();
                System.out.println("Digite o valor da altura");
                double alturaR = teclado.nextDouble();
                System.out.println("A área é de: " + (baseR * alturaR));
            case 'C' :
                System.out.println("Digite o valor do raio");
                double raio = teclado.nextDouble();
                System.out.println("A área é de: " + ((raio * raio) * 3.14));
            default :
                System.out.println("Digite um valor válido");
        }

        teclado.close();
    }
}