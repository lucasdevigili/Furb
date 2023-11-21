// Lucas Gabriel Devigili

package Exe5;

public class Estudante extends Passageiro{

    private int ra;

    public Estudante(String nome, int ra) {
        super(nome);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String imprimir() {
        return "Nome: " + super.getNome() + 
                "\nRA: " + getRa();
    }
}
