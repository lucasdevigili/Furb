import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String name = "";

        while (!name.equals("fim")) {
            System.out.println("Digite o nome do aluno");
            String nome = teclado.next();
            name = nome.toLowerCase();
            
            if (name.equals("fim")) {
                break;
            }

            System.out.println("Digite a nota Um");
            int notaUm = teclado.nextInt();
            System.out.println("Digite a nota Dois");
            int notaDois = teclado.nextInt();

            System.out.println("Nome: " + nome + "\nMédia: " + ((notaUm + notaDois) / 2));
        }
        teclado.close();
    }
}
