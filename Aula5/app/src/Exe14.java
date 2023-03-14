import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a distância percorrida");
        double distancia = teclado.nextDouble();
        
        System.out.print("Digite o tempo que levou");
        double tempo = teclado.nextDouble();

        double velMedia = distancia / tempo;
        double consumo = distancia / 12;

        System.out.println("Durante a viagem sua velocidade média foi de: " + velMedia + "Km/h e o combustivel gasto foi de: " + consumo + "L");
        teclado.close();
    }
}
