package Exe11;

import java.util.ArrayList;
import java.util.List;

public class Principal {
     public static void main(String[] args) {
        List<CD> colecao = new ArrayList<>();

        // Exemplo de cadastro de CDs na coleção
        CD cd1 = new CD("Artista 1", "CD 1", 2000);
        CD cd2 = new CD("Artista 2", "CD 2", 1995);

        colecao.add(cd1);
        colecao.add(cd2);

        // Exemplo de consulta da coleção de CDs
        System.out.println("Minha Coleção de CDs:");
        for (CD cd : colecao) {
            cd.imprimir();
        }
    }
}




