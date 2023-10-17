package Exe3;

public class Site {
    private String nome;
    private String enderecoIP;
    private boolean statusAcesso;

    public Site(String nome, String enderecoIP, boolean statusAcesso) {
        this.nome = nome;
        this.enderecoIP = enderecoIP;
        this.statusAcesso = statusAcesso;
    }

    @Override
    public String toString() {
        return "Nome do Site: " + nome + ", Endereço IP: " + enderecoIP + ", Status de Acesso: " + (statusAcesso ? "Livre" : "Bloqueado");
    }

    public boolean isAcessoLivre() {
        return statusAcesso;
    }
}

