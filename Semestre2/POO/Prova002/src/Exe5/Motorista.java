// Lucas Gabriel Devigili

package Exe5;

public class Motorista extends Passageiro{

    private int cnh;

    public Motorista(String nome, int cnh) {
        super(nome);
        this.cnh = cnh;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public String imprimir() {
        return "Nome: " + super.getNome() + 
                "\nCNH: " + getCnh();
    }
    
}
