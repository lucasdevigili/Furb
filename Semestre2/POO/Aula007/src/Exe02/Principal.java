package Exe02;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private ArrayList<Computador> listaCimputadores;

    public Principal() {
        listaCimputadores = new ArrayList<Computador>();
        popular();
        imprimir();
    }

    private void imprimir() {
        for (int i = 0; i < listaCimputadores.size(); i++) {
            System.out.println(listaCimputadores.get(i).toString());
        }
    }

    private void popular() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero de serial ou \"0\" pra sair");
        int serial = teclado.nextInt();

        while (serial != 0) {
            System.out.println("Digite a capacidade do HD");
            double capacidadeHD = teclado.nextDouble();

            System.out.println("Digite a quantidade de memoria");
            double quantidadeMemoria = teclado.nextDouble();

            Computador comp = new Computador(serial, capacidadeHD, quantidadeMemoria);

            listaCimputadores.add(comp);

            System.out.println("Digite o numero do serial ou \"0\" pra sair");
            serial = teclado.nextInt();
        }
        teclado.close();
    }

    public static void main(String[] args) {
        new Principal();
    }
}
