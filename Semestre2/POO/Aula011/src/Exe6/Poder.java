// Lucas e Jaqueline

package Exe6;

public class Poder {
    private String nomePoder;
    private int categoria;
    
    public Poder(String nomePoder, int categoria) {
        setNome(nomePoder);
        setCategoria(categoria);
    }

    public String getNome() {
        return nomePoder;
    }

    public void setNome(String nome) {
        this.nomePoder = nome;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
