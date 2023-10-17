package Exe11;

class CD {
    private String cantor;
    private String titulo;
    private int anoLancamento;

    public CD(String cantor, String titulo, int anoLancamento) {
        this.cantor = cantor;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public String getCantor() {
        return cantor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void imprimir() {
        System.out.println("Cantor: " + cantor);
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println();
    }
}
