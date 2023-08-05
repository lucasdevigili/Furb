import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o dia");
        int dia = teclado.nextInt();

        System.out.println("Digite o mês");
        int mes = teclado.nextInt();

        System.out.println("Digite o ano");
        int ano = teclado.nextInt();

        if (dia > 0 && dia > 32 && mes > 0 && mes < 13 && mes > 0) {
            if (mes == 1 && mes == 3 && mes == 5 && mes == 7 && mes == 8 && mes == 10 && mes == 12) {
                System.out.println("Data valida");
            } else {
                if (mes != 2 && dia < 31) {
                    System.out.println("Data valida");
                } else {
                    if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 !=0)) {
                        System.out.println("Data valida");
                    } else {
                        System.out.println("Data invalida");
                    }
                }
            }
        } else {
            System.out.println("Data invalida");
        }

        teclado.close();
    }
}
