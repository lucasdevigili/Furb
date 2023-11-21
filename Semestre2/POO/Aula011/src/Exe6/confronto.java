// Lucas e Jaqueline

package Exe6;

public class confronto{

    private SuperHeroi heroi;
    private Vilao vilao;

    public confronto(SuperHeroi heroi, Vilao vilao) {
        this.heroi = heroi;
        this.vilao = vilao;
    }

    

    public String definirConfronto() {
        if (heroi.getCategoria() > vilao.getCategoria()) {
            return ("O Super Heroi: " + heroi.getNome() + " ganhou o confronto contra o " + vilao.getNome());
        } else if (heroi.getCategoria() == vilao.getCategoria()) {
            return ("A batalha entre: " + heroi.getNome() + " e " + vilao.getNome() + " empatou");
        } else {
            return ("O Super Heroi: " + heroi.getNome() + " perdeu o confronto contra o " + vilao.getNome());
        }
    }
}