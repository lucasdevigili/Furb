package Exe1;

public class Prova {
    private String NomeConcorrente;
    private String Area;
    private int Inscricao;
    private int Telefone;
    private String Endereco;
    private int Nota;

    public Prova(String nomeConcorrente, String area, int inscricao, int telefone, String endereco, int nota) {
        setNomeConcorrente(nomeConcorrente);
        setArea(area);
        setInscricao(inscricao);
        setTelefone(telefone);
        setEndereco(endereco);
        setNota(nota);
    }
    
    public void setNomeConcorrente (String NomeConcorrente) {
        this.NomeConcorrente = NomeConcorrente;
    }

    public String getNomeConcorrente() {
        return NomeConcorrente;
    }

    public void setArea (String area) {
        this.Area = area;
    }

    public String getArea() {
        return Area;
    }

    public void setInscricao (int Inscricao) {
        this.Inscricao = Inscricao;
    }

    public int getInscricao() {
        return Inscricao;
    }

    public void setTelefone(int telefone) {
    this.Telefone = telefone;
}

    public int getTelefone() {
        return Telefone;
    }
    
    public void setEndereco (String Endereco) {
        this.Endereco = Endereco;
    }
    
    public String getEndereco() {
        return Endereco;
    }
    
    public void setNota (int Nota) {
        this.Nota = Nota;
    }
    
    public int getNota() {
        return Nota;
    }
    public String Imprimir() {
        return "NomeConcorrente='" + getNomeConcorrente() + '\'' +
                ", Area='" + getArea() + '\'' +
                ", Inscricao=" + getInscricao() +
                ", Telefone=" + getTelefone() +
                ", Endereco='" + getEndereco() + '\'' +
                ", Nota=" + getNota();
    }

}
