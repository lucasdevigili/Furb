// Lucas Gabriel Devigili

package Exe5;

public class Municipal extends Onibus {

    private int capacidadeSentado;
    private int capacidadePe;

    private int nrRegulares;
    private int nrEstudantes;
    private int nrAposentados;

    public Municipal(String placa, int nrRegulares, int nrEstudantes, int nrAposentados) {
        super(placa);
        this.nrRegulares = nrRegulares;
        this.nrEstudantes = nrEstudantes;
        this.nrAposentados = nrAposentados;
    }
    public int getCapacidadeSentado() {
        return capacidadeSentado;
    }
    public void setCapacidadeSentado(int capacidadeSentado) {
        this.capacidadeSentado = capacidadeSentado;
    }
    public int getCapacidadePe() {
        return capacidadePe;
    }
    public void setCapacidadePe(int capacidadePe) {
        this.capacidadePe = capacidadePe;
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

    public void capacidade() {
        int ocupacao = getNrAposentados() + getNrEstudantes() + getNrRegulares();
 
        if(ocupacao > 65) {
            System.out.println("Onibus de placa: " + getPlaca() + " está acima da capacidade limite");
        }
     }

    String valorArrecadado() {
        double pasagem = 5.30f;
        double Total = (getNrRegulares() * pasagem) + ((getNrEstudantes() * pasagem) / 2) + ((getNrAposentados() * pasagem) * 0);
        return "Valor arrecadado pelo onibus de placa: " + getPlaca() + "\n" +
                "Regulares: " + getNrRegulares() * pasagem + "\n" +
                "Estudantes: " + (getNrEstudantes() * pasagem) / 2 + "\n" + 
                "Idosos: " +  (getNrAposentados() * pasagem) * 0 + "\n" +
                "Total: " + Total;
    }
}
