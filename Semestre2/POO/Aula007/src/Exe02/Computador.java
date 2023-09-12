package Exe02;

public class Computador {
    private int numeroSerial;
    private double capacidadeHD;
    private double quantidadeMemoria;

    public Computador(int serial, double capacidadeHD, double quantidadeMemoria) {
        setNumeroSerial(serial);
        setCapacidadeHD(capacidadeHD);
        setQuantidadeMemoria(quantidadeMemoria);
    }

    public int getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(int serial) {
        this.numeroSerial = serial;
    }

    public double getCapacidadeHD() {
        return capacidadeHD;
    }

    public void setCapacidadeHD(double capacidadeHD) throws IllegalAccessError {
        if (capacidadeHD <= 0) {
            throw new IllegalArgumentException();
        }
        this.capacidadeHD = capacidadeHD;
    }

    public double getQuantidadeMemoria() {
        return quantidadeMemoria;
    }

    public void setQuantidadeMemoria(double quantidadeMemoria) throws IllegalAccessError {
        if (quantidadeMemoria < capacidadeHD) {
            throw new IllegalArgumentException();
        }
        this.quantidadeMemoria = quantidadeMemoria;
    }

    public String toString() {
        return "numero Serial: " + this.numeroSerial + ", " + "Capacidade do HD: " + this.capacidadeHD + ", "
                + "Quantidade Memoria: " + this.quantidadeMemoria;
    }

}
