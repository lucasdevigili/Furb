package Exe4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = teclado.next();

        System.out.print("Curso: ");
        String curso = teclado.next();

        System.out.println("G - Graduação - P - Pós Graduação: ");
        char tipoAluno = teclado.next().toUpperCase().charAt(0);

        switch (tipoAluno) {
            case 'G':
                System.out.print("Semestre: ");
                int semestre = teclado.nextInt();

                AlunoGraduacao alunoGraduacao = new AlunoGraduacao(nome, curso, semestre);
                System.out.println(alunoGraduacao.imprimir());
                break;
                
            case 'P':
                System.out.print("Pontos do POSCOMP: ");
                int pontosPoscomp = teclado.nextInt();

                AlunoPosGraduacao alunoPosGraduacao = new AlunoPosGraduacao(nome, curso, pontosPoscomp);
                System.out.println(alunoPosGraduacao.imprimir());
                break;
            default :
                System.out.println("Errrrrrrrrrrouuuu");
        }
        teclado.close();
    }
}
