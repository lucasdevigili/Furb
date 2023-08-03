import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int canal4 = 0,
                canal5 = 0,
                canal9 = 0,
                canal12 = 0,
                val = 1;

        while (val > 0) {
            System.out.println("Digite o canal que estava sendo assistido");
            int canal = teclado.nextInt();

            switch (canal) {
                case 4:
                    System.out.println("Digite o numero de pessoas");
                    int pessoas4 = teclado.nextInt();
                    canal4 += pessoas4;
                    break;
                case 5:
                    System.out.println("Digite o numero de pessoas");
                    int pessoas5 = teclado.nextInt();
                    canal5 += pessoas5;
                    break;
                case 9:
                    System.out.println("Digite o numero de pessoas");
                    int pessoas9 = teclado.nextInt();
                    canal9 += pessoas9;
                    break;
                case 12:
                    System.out.println("Digite o numero de pessoas");
                    int pessoas12 = teclado.nextInt();
                    canal12 += pessoas12;
                    break;
                case 0:
                    val = 0;
                    break;
                default:
                    System.out.println("Digite um canal válido");
                    break;
            }
        }
        System.out.println(
                "Canal 4: " + canal4 +
                        "\nCanal 5: " + canal5 +
                        "\ncanal 9: " + canal9 +
                        "\nCanal 12: " + canal12);
        teclado.close();
    }
}
