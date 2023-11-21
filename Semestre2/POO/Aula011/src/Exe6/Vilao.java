// Lucas e Jaqueline

package Exe6;

public class Vilao extends Personagem{

    private int tempoDePrisao;

    public Vilao(String nomePoder, int categoria, String nome, String nomeReal) {
        super(nomePoder, categoria, nome, nomeReal);
        setTempoDePrisao(tempoDePrisao);
    }

    public int getTempoDePrisao() {
        return tempoDePrisao;
    }

    public void setTempoDePrisao(int tempoDeProsao) {
        this.tempoDePrisao = tempoDeProsao;
    }
}
