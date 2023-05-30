import java.util.Scanner;

public class Exe32 {

    public static void imprimirCalendario(int primeiroDia, int numDias) {
        String[] diasSemana = {"D", "S", "T", "Q", "Q", "S", "S"};

        for (String dia : diasSemana) {
            System.out.print(dia + "\t");
        }
        System.out.println();

        int posicao = primeiroDia - 1;

        for (int i = 0; i < posicao; i++) {
            System.out.print("\t");
        }

        for (int dia = 1; dia <= numDias; dia++) {
            System.out.print(dia + "\t");
            posicao++;

            if (posicao % 7 == 0) {
                System.out.println();
            }
        }


        System.out.println();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o dia da semana do primeiro dia (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int primeiroDia = teclado.nextInt();

        System.out.print("Informe o número de dias do mês: ");
        int numDias = teclado.nextInt();

        imprimirCalendario(primeiroDia, numDias);
        teclado.close();
    }
}
