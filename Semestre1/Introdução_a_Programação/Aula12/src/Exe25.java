import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número");
        double numbOne = teclado.nextDouble();

        System.out.println("Digite um número");
        double numbTwo = teclado.nextDouble();

        System.out.println("Selecione a operação" + "\n 1 para soma de dois números"
                + "\n 2 para diferênça entre dois números" + "\n 3 para produto entre dois números"
                + "\n 4 para divisão entre dois números (o denominador não pode ser zero)");
        int menu = teclado.nextInt();

        switch (menu) {
            case 1:
                System.out.println("O resutado é:" + (numbOne + numbTwo));
                break;
            case 2:
                System.out.println("O resutado é:" + (numbOne - numbTwo));
                break;
            case 3:
                System.out.println("O resutado é:" + (numbOne * numbTwo));
                break;
            case 4:
                if (numbOne <= 0 || numbTwo <= 0) {
                    System.out.println("Digite um valor maior que 0");
                } else {
                    System.out.println("O resutado é:" + (numbOne / numbTwo));
                }
                break;
            default :
                System.out.println("Digite um valor válido");
        }

        teclado.close();
    }
}