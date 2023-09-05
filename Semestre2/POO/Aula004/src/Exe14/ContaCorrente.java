public class ContaCorrente {
    // declarando atributos da classe
    private String nome;
    private double saldo;

    // definindo os construtores
    public ContaCorrente() {
        setNome("Sem nome");
        setSaldo(0);
    }

    public ContaCorrente(String nome) {
        setNome(nome);
        setSaldo(0);
    }

    public ContaCorrente(String nome, double saldo) {
        setNome(nome);
        setSaldo(saldo);
    }

    // criando metodos acessores e modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // metodo para realizar o deposito na conta corrente
    public void fazerDeposito(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Deposito com valor negativo");
        }
        // atualizando o saldo da conta corrente
        setSaldo(getSaldo() + valor);
    }

    /// fazer metodo sacar
    /*
     * Método que modifica o conteúdo do atributo saldo para saldo - parâmetro
     * recebido (usar setSaldo). Antes de fazer a retirada, deve-se verificar se há
     * disponibilidade (saldo maior ou igual ao parâmetro recebido). Se a operação
     * for
     * realizada com sucesso, retornar True, caso contrário, retornar False
     */

    public void sacar(double valor) {
        if (valor <= 0)
            throw new IllegalArgumentException("Valor do saque negado ou zerado");
        if(getSaldo() < valor)
    }

    /// fazer metodo transferir
    /*
     * Método que modifica o conteúdo do atributo saldo para saldo – parâmetro
     * recibo (usar fazerRetirada). Se o método fazerRetirada retornar False, isso
     * quer
     * dizer que o saldo suficiente (retorne False indicando que a operação não pode
     * ser realizada). Do contrário, efetue a transferência a partir da conta
     * corrente
     * recebida como parâmetro (referência da conta corrente destino), chamando o
     * método fazerDeposito passando o segundo parâmetro recebido como valor a ser
     * transferido.
     */
    public void transferir(ContaCorrente outraConta, double valor) {

    }
}