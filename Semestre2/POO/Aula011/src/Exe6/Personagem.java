// Lucas e Jaqueline

package Exe6;

public class Personagem extends Poder{
    private String nome;
    private String nomeReal;

    public Personagem(String nomePoder, int categoria, String nome, String nomeReal) {
        super(nomePoder, categoria);
        setNome(nome);
        setNomeReal(nomeReal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeReal() {
        return nomeReal;
    }

    public void setNomeReal(String nomeReal) {
        this.nomeReal = nomeReal;
    }  
    
}
