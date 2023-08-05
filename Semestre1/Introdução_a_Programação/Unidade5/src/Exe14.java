import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int menorDez = 0,
            entreDezVinte = 0,
            maiorVinte = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite o valor de compra");
            int pc = teclado.nextInt();
            System.out.println("Digite o valor de venda");
            int pv = teclado.nextInt();

            int dez = 0,
                dezVinte = 0,
                vinte = 0;

            int porcento = ((pv - pc) / pc * 100);

            if (porcento < 10) {
                dez++;
                menorDez += dez;
            } else if (porcento >= 10 || porcento <= 20) {
                dezVinte++;
                entreDezVinte += dezVinte;
            } else if (porcento > 20) {
                vinte++;
                maiorVinte += vinte;
            }
        }

        System.out.println("Menor que dez: " + menorDez);
        System.out.println("Entre dez e vinte: " + entreDezVinte);
        System.out.println("Maior que vinte: " + maiorVinte);
        teclado.close();
    }
}

//TODO
