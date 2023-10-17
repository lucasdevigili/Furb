package Exe13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Principal {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();

        cadastrarCursos(cursos, professores);

        exibirInformacoesCursos(cursos);
    }

    private static void cadastrarCursos(List<Curso> cursos, List<Professor> professores) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Cursos:");
        while (true) {
            System.out.print("Nome do Curso (ou 'sair' para encerrar o cadastro): ");
            String nomeCurso = scanner.nextLine();
            if (nomeCurso.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.println("Professores Disponíveis:");
            for (int i = 0; i < professores.size(); i++) {
                System.out.println(i + 1 + ". " + professores.get(i).getNome());
            }
        }
        scanner.close();
    }

    private static void exibirInformacoesCursos(List<Curso> cursos) {
        System.out.println("\nInformações dos Cursos:");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("\nCurso " + (i + 1) + ":");
            cursos.get(i).imprimir();
        }

    }
}