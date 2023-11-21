package Exe4;

public class Aluno {
    private String nome, curso;

    public Aluno(String nome, String curso) {
        setNome(nome);
        setCurso(curso);
    }

    public void setNome(String nome)  {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }    
}
