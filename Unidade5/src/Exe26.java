import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor máximo de pedágio: R$ ");
        double valorMaximoPedagio = teclado.nextDouble();

        int trechosAcimaValorMaximo = 0;
        int totalTrechos = 0;
        int trechosAcima150Km = 0;

        while (true) {
            System.out.print("Pedágio (R$): ");
            double valorPedagio = teclado.nextDouble();

            if (valorPedagio < 0) {
                break;
            }

            System.out.print("Distância (Km): ");
            double distancia = teclado.nextDouble();

            totalTrechos++;

            if (valorPedagio > valorMaximoPedagio) {
                trechosAcimaValorMaximo++;
            }

            if (distancia > 150 && valorPedagio <= valorMaximoPedagio) {
                trechosAcima150Km++;
            }
        }

        System.out.println(trechosAcimaValorMaximo + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(totalTrechos + " (quantidade de trechos informados)");
        System.out.println(trechosAcima150Km + " (trechos acima de 150km com valor aceito por ele)");

        teclado.close();
    }
}
