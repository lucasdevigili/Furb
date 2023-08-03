import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N;
        N = teclado.nextInt();

        int hora = N / 3600;
        int horaSec = hora * 3600;
        int minuto = (N - horaSec) / 60;

        teclado.close();
    }
    
}
