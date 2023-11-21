// Lucas Gabriel Devigili

package Exe5;

public class Aposentado extends Passageiro{

    private String cpf;

    public Aposentado(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String imprimir() {
        return "Nome: " + super.getNome() + 
                "\nCPF: " + getCpf();
    }
    
}
