package Exe4;

public class AlunoPosGraduacao extends Aluno{

    private int pontosPoscomp;

    public AlunoPosGraduacao(String nome, String curso, int pontosPoscomp) {
        super(nome, curso);
        setPontosPoscomp(pontosPoscomp);
    }

    public int getPontosPoscomp() {
        return pontosPoscomp;
    }

    public void setPontosPoscomp(int pontosPoscomp) {
        this.pontosPoscomp = pontosPoscomp;
    }

    public String imprimir() {
        return "Nome: " + this.getNome() + "\n" + 
                "Curso: " + this.getCurso() + "\n" +
                "Pontos PosComp: " + this.getPontosPoscomp();
    }
}
