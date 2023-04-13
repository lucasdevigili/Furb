import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a hora de chegada");
        int hChegada = teclado.nextInt();
        System.out.println("Digite o minuto de chegada");
        int mChegada = teclado.nextInt();
        
        System.out.println("Digite a hora de saída");
        int hSaida = teclado.nextInt();
        System.out.println("Digite o minuto de saída");
        int mSaida = teclado.nextInt();

        int convertChegada = (hChegada * 60) + mChegada;
        int convertSaida = (hSaida * 60) + mSaida;

        int tempo = convertSaida - convertChegada;

        if (tempo < 30) {
            System.out.println("Você ficou menos de uma hora, não pagará nada");
        } else if (tempo >= 30 || tempo < 78) {
            System.out.println("Você ficou o equivalente a uma hora, pagará: " + (1 * 5));
        } else if (tempo >= 78 || tempo < 138) {
            System.out.println("Você ficou o equivalente a duas horas, pagará: " + (2 * 5));
        }  else if (tempo >= 138|| tempo < 198) {
            System.out.println("Você ficou o equivalente a duas horas, pagará: " + (3 * 7.50));
        } else if (tempo >= 198 || tempo < 258) {
            System.out.println("Você ficou o equivalente a três horas, pagará: " + (4 * 7.50));
        } else if (tempo >= 258) {
            System.out.println("Você ficou o equivalente a duas horas, pagará: " + (5 * 750));
        }

        teclado.close();
    }
}