package Exe01;
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IllegalArgumentException {
        if (idade < 0) {
            throw new IllegalArgumentException();
        }
        this.idade = idade;
    }

    public String toString() {
        return "Nome: " + this.getNome() + ", " + "idade: " + this.getIdade();
    }
}
