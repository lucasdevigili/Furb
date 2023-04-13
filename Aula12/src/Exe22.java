import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite 1 para ciências da Computação," + "\n2 para Licenciatura de Computadores ou" + "\n3 para Sistemas da Computação");
        int curso = teclado.nextInt();

        switch (curso) {
            case 1 :
                System.out.println("Bacharel em Ciências da Computação");
                break;
            case 2 :
                System.out.println("Licenciado em Computação");
                break;
            case 3 :
                System.out.println("Bacharel em Sistemas da Computação");
                break;
            default :
                System.out.println("informe um valor correto");
        }
        teclado.close();
    }
}