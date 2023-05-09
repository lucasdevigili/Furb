import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu genero");
        String genero = teclado.next();

        if (genero == "") {
            System.out.println("Dados incorretos");
        } else {
            System.out.println("Digite o mês de seu nascimento");
            int mesNascimento = teclado.nextInt();

            if (mesNascimento >= 7) {
                System.out.println("Nasceu no segundo semestre");
            } else {
                System.out.println("Gênero: " + genero + " Mês: " + mesNascimento);
                System.out.println("Nasceu no primeiro semestre");
            }
        }
        teclado.close();
    }
}
