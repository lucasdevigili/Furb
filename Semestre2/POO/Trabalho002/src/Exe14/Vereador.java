package Exe14;

// Classe Vereador.java
public class Vereador {
    String nome;
    int partidoNumero;
    String partidoNome;
    int projetosApresentados;
    int projetosAprovados;

    public Vereador(String nome, int partidoNumero, String partidoNome, int projetosApresentados, int projetosAprovados) {
        this.nome = nome;
        this.partidoNumero = partidoNumero;
        this.partidoNome = partidoNome;
        this.projetosApresentados = projetosApresentados;
        this.projetosAprovados = projetosAprovados;
    }

    public double calcularDesempenho() {
        int indiceTrabalho = 0;

        if (projetosApresentados >= 1 && projetosApresentados <= 5) {
            indiceTrabalho = 80;
        } else if (projetosApresentados >= 6 && projetosApresentados <= 10) {
            indiceTrabalho = 100;
        } else if (projetosApresentados >= 11 && projetosApresentados <= 17) {
            indiceTrabalho = 108;
        } else if (projetosApresentados > 17) {
            indiceTrabalho = 122;
        }

        if (projetosApresentados == 0) {
            return 0;
        }

        return ((double) projetosAprovados / projetosApresentados) * (indiceTrabalho / 100.0);
    }
}

