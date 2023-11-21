package Exe2;

public class Funcionario extends Pessoa{

    private Float salario;

    public Funcionario(Float salario, String nome) {
        super(nome);
        this.salario = salario;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getBonus() {
        return this.salario * 0.10f;
    }
    
}
