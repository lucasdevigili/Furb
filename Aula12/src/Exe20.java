import java.util.Scanner;
import java.text.DecimalFormat;

public class Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");

        System.out.println("Digite o valor da prova um");
        double provaUm = teclado.nextInt();

        System.out.println("Digite o valor da prova dois");
        double provaDois = teclado.nextInt();

        System.out.println("Digite o valor da prova três");
        double provaTres = teclado.nextInt();

        System.out.println("Digite o valor do exercício");
        double exercicio = teclado.nextInt();


        double media = (provaUm + (provaDois * 2) + (provaTres * 3) + exercicio) / 7;

        if (media >= 9) {
            System.out.println("Aluno aprovado, Nota = " + df_1.format(media) + " Conceito: A");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Aluno aprovado, Nota = " + df_1.format(media) + " Conceito: B");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("Aluno aprovado, Nota = " + df_1.format(media) + " Conceito: C");
        } else if (media >= 4 && media < 6) {
            System.out.println("Aluno reprovado, Nota = " + df_1.format(media) + " Conceito: D");
        } else if (media < 4) {
            System.out.println("Aluno reprovado, Nota = " + df_1.format(media) + " Conceito: E");
        } 
        teclado.close();
    }
}