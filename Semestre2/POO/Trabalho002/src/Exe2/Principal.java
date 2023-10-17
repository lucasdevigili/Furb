package Exe2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[1]; 
        int numPessoas = 0;

        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {
            if (numPessoas == pessoas.length) {
                Pessoa[] novoArray = new Pessoa[pessoas.length * 2];
                System.arraycopy(pessoas, 0, novoArray, 0, pessoas.length);
                pessoas = novoArray;
            }

            System.out.println("Digite o nome da pessoa:");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade da pessoa:");
            int idade = Integer.parseInt(scanner.nextLine());

            Pessoa pessoa = new Pessoa(nome, idade);
            pessoas[numPessoas] = pessoa;
            numPessoas++;

            System.out.println("Deseja cadastrar mais pessoas? (S para sim, N para não):");
            resposta = scanner.nextLine().trim();
        }

        for (int i = 0; i < numPessoas - 1; i++) {
            for (int j = 0; j < numPessoas - i - 1; j++) {
                if (pessoas[j].getIdade() < pessoas[j + 1].getIdade()) {
                    Pessoa temp = pessoas[j];
                    pessoas[j] = pessoas[j + 1];
                    pessoas[j + 1] = temp;
                }
            }
        }

        System.out.println("Nomes das pessoas da mais velha para a mais nova:");
        for (int i = 0; i < numPessoas; i++) {
            System.out.println(pessoas[i].getNome() + " - Idade: " + pessoas[i].getIdade());
        }

        scanner.close();
    }
}
