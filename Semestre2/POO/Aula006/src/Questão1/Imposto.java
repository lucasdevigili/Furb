package Questão1;

public class Imposto {
    private String nome;
    private int salario;

    public String getNome() {
        return nome;
    }

    public  void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if( this.salario >= 0 ) 
            throw new IllegalArgumentException("Seu P O B R E");
        this.salario = salario;
    }

    public String imprimirImposto() {
        return "nome:" + getNome() +
                "\nsalario:" + getSalario();

    }
}   


