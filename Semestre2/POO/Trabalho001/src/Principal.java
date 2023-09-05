import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos carros deseja cadastrar?");
        int numCarros = 0;
        boolean entradaInvalida = true;

        while (entradaInvalida) {
            try {
                numCarros = scanner.nextInt();
                entradaInvalida = false;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número válido.");
                scanner.nextLine();
            }
        }

        Carro[] carros = new Carro[numCarros];

        for (int i = 0; i < numCarros; i++) {
            System.out.println("Digite os dados do Carro #" + (i + 1));
            scanner.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Placa: ");
            String placa = scanner.nextLine();
            System.out.print("Cor: ");
            String cor = scanner.nextLine();

            int ano = 0;
            entradaInvalida = true;
            while (entradaInvalida) {
                try {
                    System.out.print("Ano: ");
                    ano = scanner.nextInt();
                    entradaInvalida = false;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um ano válido.");
                    scanner.nextLine();
                }
            }

            double preco = 0;
            entradaInvalida = true;
            while (entradaInvalida) {
                try {
                    System.out.print("Preço: R$ ");
                    preco = scanner.nextDouble();
                    entradaInvalida = false;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um preço válido.");
                    scanner.nextLine();
                }
            }

            int localizacao = 0;
            entradaInvalida = true;
            while (entradaInvalida) {
                try {
                    System.out.print("Localização: ");
                    localizacao = scanner.nextInt();
                    entradaInvalida = false;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite uma localização válida.");
                    scanner.nextLine();
                }
            }

            carros[i] = new Carro(modelo, marca, placa, cor, ano, preco, localizacao);
        }

        System.out.println("\nCarros inseridos:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        scanner.close();
    }
}
