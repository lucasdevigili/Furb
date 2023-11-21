package Exe3;

public class ProfDE extends Professor{
    
    private double Salario;
    
    public ProfDE(String Nome, String Matricula, int Idade, double Salario) {
        super(Nome, Matricula, Idade);
        setSalario(Salario);
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    public String toString() {
        return super.toString() + "\n" + 
                "Salário: R$"+getSalario();
    }
}
