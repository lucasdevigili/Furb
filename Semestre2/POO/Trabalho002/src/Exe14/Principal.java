package Exe14;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vereador[] vereadores = new Vereador[9];

        int totalProjetosApresentados = 0;
        int totalProjetosAprovados = 0;
        double somaDesempenho = 0;
        Vereador vereadorComMaisAprovados = null;
        Vereador vereadorComMenorDesempenho = null;
        double desempenhoMaisAlto = 0;

        for (int i = 0; i < 9; i++) {
            System.out.println("Informe os dados do vereador " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Partido (Número): ");
            int partidoNumero = scanner.nextInt();
            System.out.print("Partido (Nome): ");
            String partidoNome = scanner.next();
            System.out.print("Projetos Apresentados: ");
            int projetosApresentados = scanner.nextInt();
            System.out.print("Projetos Aprovados: ");
            int projetosAprovados = scanner.nextInt();

            vereadores[i] = new Vereador(nome, partidoNumero, partidoNome, projetosApresentados, projetosAprovados);

            totalProjetosApresentados += projetosApresentados;
            totalProjetosAprovados += projetosAprovados;
            somaDesempenho += vereadores[i].calcularDesempenho();

            if (vereadorComMaisAprovados == null || vereadores[i].projetosAprovados > vereadorComMaisAprovados.projetosAprovados) {
                vereadorComMaisAprovados = vereadores[i];
            }

            if (vereadorComMenorDesempenho == null || vereadores[i].calcularDesempenho() < vereadorComMenorDesempenho.calcularDesempenho()) {
                vereadorComMenorDesempenho = vereadores[i];
            }

            if (vereadores[i].calcularDesempenho() > desempenhoMaisAlto) {
                desempenhoMaisAlto = vereadores[i].calcularDesempenho();
            }
        }

        double mediaDesempenho = somaDesempenho / 9;

        System.out.println("\nResultado da Estatística:");
        System.out.println("Total de projetos apresentados na câmara: " + totalProjetosApresentados);
        System.out.println("Total de projetos aprovados na câmara: " + totalProjetosAprovados);
        System.out.println("Vereador com mais projetos aprovados: " + vereadorComMaisAprovados.nome + " (" + vereadorComMaisAprovados.partidoNome + ") - Desempenho: " + vereadorComMaisAprovados.calcularDesempenho());
        System.out.println("Vereador com menor desempenho: " + vereadorComMenorDesempenho.nome + " (" + vereadorComMenorDesempenho.partidoNome + ") - Desempenho: " + vereadorComMenorDesempenho.calcularDesempenho());

        System.out.println("Vereadores com desempenho maior que a média:");
        for (Vereador vereador : vereadores) {
            if (vereador.calcularDesempenho() > mediaDesempenho) {
                System.out.println(vereador.nome + " (" + vereador.partidoNome + ") - Desempenho: " + vereador.calcularDesempenho());
            }
        }

        System.out.println("Média de desempenho por partido político:");
        for (Vereador vereador : vereadores) {
            System.out.println(vereador.partidoNome + ": " + calcularMediaDesempenhoPorPartido(vereadores, vereador.partidoNome));
        }

        System.out.println("Total de projetos apresentados e aprovados por partido político:");
        for (Vereador vereador : vereadores) {
            System.out.println(vereador.partidoNome + ": Apresentados: " + calcularTotalProjetosApresentadosPorPartido(vereadores, vereador.partidoNome) + ", Aprovados: " + calcularTotalProjetosAprovadosPorPartido(vereadores, vereador.partidoNome));
        }

        scanner.close();
    }

    public static double calcularMediaDesempenhoPorPartido(Vereador[] vereadores, String partidoNome) {
        double somaDesempenho = 0;
        int contador = 0;

        for (Vereador vereador : vereadores) {
            if (vereador.partidoNome.equals(partidoNome)) {
                somaDesempenho += vereador.calcularDesempenho();
                contador++;
            }
        }

        return contador > 0 ? somaDesempenho / contador : 0;
    }

    public static int calcularTotalProjetosApresentadosPorPartido(Vereador[] vereadores, String partidoNome) {
        int totalProjetosApresentados = 0;

        for (Vereador vereador : vereadores) {
            if (vereador.partidoNome.equals(partidoNome)) {
                totalProjetosApresentados += vereador.projetosApresentados;
            }
        }

        return totalProjetosApresentados;
    }

    public static int calcularTotalProjetosAprovadosPorPartido(Vereador[] vereadores, String partidoNome) {
        int totalProjetosAprovados = 0;

        for (Vereador vereador : vereadores) {
            if (vereador.partidoNome.equals(partidoNome)) {
                totalProjetosAprovados += vereador.projetosAprovados;
            }
        }

        return totalProjetosAprovados;
    }
}
