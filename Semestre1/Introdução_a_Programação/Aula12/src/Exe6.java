import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o sexo");
        char sexo = teclado.next().toUpperCase().charAt(0);


        if (sexo == 'M') {
            System.out.println("Sexo masculino");
        } else if (sexo == 'F') {
            System.out.println("Sexo feminino");
        } else if (sexo == 'I') {
            System.out.println("Sexo não informado");
        } else {
            System.out.println("Valor invalido");
        }
        teclado.close();
    }
}   