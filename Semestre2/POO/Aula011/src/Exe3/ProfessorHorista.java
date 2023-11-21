package Exe3;

public class ProfessorHorista extends Professor{
    private int Horas;
    private double ValHora;

    public ProfessorHorista(String Nome, String Matricula, int Idade, int Horas, double ValHora) {
        super(Nome, Matricula, Idade);
        setHoras(Horas);
        setValHora(ValHora);

    }
    public int getHoras() {
        return Horas;
    }
    public void setHoras(int Horas) {
        this.Horas = Horas;
    }
    public double getValHora() {
        return ValHora;
    }
    public void setValHora(double ValHora) {
        this.ValHora = ValHora;
    }

    public String toString() {
        return super.toString() + "\n" + 
                "Horas trab: " + getHoras() + "\n" +
                "Valor Hora: R$: "+ getValHora();
    }    
}
