package Exe14;

public class ContaCorrente {
    private String nome;
    private String saldo;

    public ContaCorrente(String nome, String saldo) {
        setNome("Sem nome");
        setSaldo(0);
    }

    public ContaCorrente(String nome) {
        setNome(nome);
        setSaldo(0);
    }

    public ContaCorrete (String nome, double saldo) {  
        setNome(nome);
       setSaldo(saldo);
    }
}
