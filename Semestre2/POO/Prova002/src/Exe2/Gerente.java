package Exe2;

public class Gerente extends Funcionario {

    public Gerente(Float salario, String nome) {
        super(salario, nome);
    }

    @Override
    public Float getBonus() {
        return super.getSalario() * 0.40f;
    }
    
}
