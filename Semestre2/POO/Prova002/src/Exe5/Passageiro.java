// Lucas Gabriel Devigili

package Exe5;

public abstract class Passageiro {
    private String nome;

    public Passageiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

