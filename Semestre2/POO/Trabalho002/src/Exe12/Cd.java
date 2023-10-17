package Exe12;

import java.util.ArrayList;
import java.util.List;

class Musico {
    private String nome;

    public Musico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class CD {
    private String titulo;
    private boolean coletanea;
    private boolean duplo;
    private List<Musico> musicos = new ArrayList<>();
    private List<Musica> musicas = new ArrayList<>();

    public CD(String titulo, boolean coletanea, boolean duplo) {
        this.titulo = titulo;
        this.coletanea = coletanea;
        this.duplo = duplo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isColetanea() {
        return coletanea;
    }

    public boolean isDuplo() {
        return duplo;
    }

    public void adicionarMusico(Musico musico) {
        musicos.add(musico);
    }

    public List<Musico> getMusicos() {
        return musicos;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
}

class Musica {
    private String titulo;
    private int duracao;

    public Musica(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }
}
