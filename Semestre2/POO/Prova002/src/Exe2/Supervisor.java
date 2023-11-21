package Exe2;

public class Supervisor extends Funcionario {

    public Supervisor(Float salario, String nome) {
        super(salario, nome);
    }

    @Override
    public Float getBonus() {
        return super.getSalario() * 0.20f;
    }
    
}
