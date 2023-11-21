// Lucas e Jaqueline

package Exe6;

public class Jogo {

    public static void main(String[] args) {
        SuperHeroi superHeroi = new SuperHeroi("MarretaBionica", 5, "ChapolinColorado", "");
        Vilao vilao = new Vilao("SoltarTeia", 3, "HomemAranha", "Peter Parker");

        confronto jogo = new confronto(superHeroi, vilao);
        System.out.println(jogo.definirConfronto());
    }
}