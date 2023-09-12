package Exe01;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private ArrayList<Pessoa> listaNomes;

    public Principal() {
        listaNomes = new ArrayList<Pessoa>();
        popular();
        imprimir();
    }

    private void imprimir() {
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i).toString());
        }
    };

    private void popular() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um nome ou \"fim\" pra sair");
        String nome = teclado.next();

        while (!nome.equalsIgnoreCase("fim")) {

            System.out.println("Digite a idade");
            int idade = teclado.nextInt();

            Pessoa p = new Pessoa(nome, idade);

            // add no arraylist
            listaNomes.add(p);

            System.out.println("Digite um nome ou \"fim\" pra sair");
            nome = teclado.next();
        }
        teclado.close();
    };

    public static void main(String[] args) {
        new Principal();
    }
}