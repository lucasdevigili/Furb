package Exe5;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Atleta> jogos = new ArrayList<Atleta>();

        jogos.add(new Jogador("Lucas", 57, 18));
        jogos.add(new Lutador("Joney", 89, 38));

        for(Atleta umAtleta:jogos) {
            System.out.println(
                "O atleta: " + umAtleta.getNome() + 
                " está na categoria: " + umAtleta.definirCategoria()
            );
        }
    }
}
