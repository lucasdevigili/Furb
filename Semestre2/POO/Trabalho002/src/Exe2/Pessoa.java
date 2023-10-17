package Exe2;

public class Pessoa {
    private String Nome;
    private int Idade;

    public Pessoa( String Nome, int Idade ) {
        setNome (Nome);
        setIdade (Idade);
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getIdade() {
        return Idade;
    }

    public String Imprimir() {
        return "Nome '" + getNome() + '\'' +
        ", Idade: '" + getIdade();
    }
}
