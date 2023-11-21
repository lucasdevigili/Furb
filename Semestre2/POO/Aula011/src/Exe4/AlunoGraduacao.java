package Exe4;

public class AlunoGraduacao extends Aluno{

    private int semestre;

    public AlunoGraduacao(String nome, String curso, int semestre) {
        super(nome, curso);
        setSemestre(semestre);
    }

    public int getSemestre() throws IllegalArgumentException{
        if(semestre <= 0) {
            throw new IllegalArgumentException();
        }
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public String imprimir() {
        return "Nome: " + this.getNome() + "\n" + 
                "Curso: " + this.getCurso() + "\n" +
                "Semestre: " + this.getSemestre();
    }
}
