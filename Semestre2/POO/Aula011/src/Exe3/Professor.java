package Exe3;

public class Professor {
    private String Nome, Matricula;
    private int Idade;

    public Professor(String Nome, String Matricula, int Idade) {
        setNome(Nome);
        setMatricula(Matricula);
        setIdade(Idade);
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getMatricula() {
        return Matricula;
    }
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String toString() {
        return "Nome do professor: " + getNome() + "\n" +
                "Matricula: " + getMatricula() + "\n" +
                "Idade: " + getIdade();
    }
}
