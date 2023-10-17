package Exe1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Preencha os dados do concorrente " + (i + 1) + ":");
            
            System.out.print("Nome do Concorrente: ");
            String nomeDoConcorrente = scanner.nextLine();
            
            System.out.print("Área: ");
            String area = scanner.nextLine();
            
            System.out.print("Inscrição: ");
            int inscricao = scanner.nextInt();
            
            System.out.print("Telefone: ");
            int telefone = scanner.nextInt();
            
            scanner.nextLine();
            
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            
            System.out.print("Nota: ");
            int nota = scanner.nextInt();
            
            scanner.nextLine();

            Prova umaProva = new Prova(nomeDoConcorrente, area, inscricao, telefone, endereco, nota);
            System.out.println("Dados do concorrente " + (i + 1) + ":");
            System.out.println(umaProva.Imprimir());
        }
        
        scanner.close();
    }
}

