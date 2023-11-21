// Lucas Gabriel Devigili

package Exe5;

public class Interminicipal extends Onibus{

    private int nrRegulares;
    private int nrEstudantes;
    private int nrAposentados;

    public Interminicipal(String placa, int nrRegulares, int nrEstudantes, int nrAposentados) {
        super(placa);
        this.nrRegulares = nrRegulares;
        this.nrEstudantes = nrEstudantes;
        this.nrAposentados = nrAposentados;
    }

    public int getNrRegulares() {
        return nrRegulares;
    }
    public void setNrRegulares(int nrRegulares) {
        this.nrRegulares = nrRegulares;
    }
    public int getNrEstudantes() {
        return nrEstudantes;
    }
    public void setNrEstudantes(int nrEstudantes) {
        this.nrEstudantes = nrEstudantes;
    }
    public int getNrAposentados() {
        return nrAposentados;
    }
    public void setNrAposentados(int nrAposentados) {
        this.nrAposentados = nrAposentados;
    }

    String valorArrecadado() {
        double taxa = 0.70;
        double pasagem = 5.30 + taxa;
        double Total = (getNrRegulares() * pasagem) + ((getNrEstudantes() * pasagem) / 2) + ((getNrAposentados() * pasagem) * 0);
        return "Valor arrecadado pelo onibus de placa: " + getPlaca() + "\n" +
                "Regulares: " + getNrRegulares() * pasagem + "\n" +
                "Estudantes: " + (getNrEstudantes() * pasagem) + "\n" + 
                "Idosos: " +  (getNrAposentados() * pasagem) + "\n" +
                "Total: " + Total;
    }
}
