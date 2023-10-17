package Exe3;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Site> dicionario = new HashMap<>();

        // Inserir sites no dicionário
        inserirSite(new Site("Google", "192.168.1.1", true), dicionario);
        inserirSite(new Site("Facebook", "192.168.1.2", true), dicionario);
        inserirSite(new Site("Twitter", "192.168.1.3", false), dicionario);

        // Acessar sites
        acessarSite(scanner, dicionario);

        // Imprimir informações dos sites
        imprimirInformacoesSites(dicionario);

        scanner.close();
    }

    public static void inserirSite(Site site, HashMap<String, Site> dicionario) {
        dicionario.put(site.toString(), site);
    }

    public static void acessarSite(Scanner scanner, HashMap<String, Site> dicionario) {
        while (true) {
            System.out.println("Digite o nome do site que deseja acessar (ou 'sair' para encerrar):");
            String nomeSite = scanner.nextLine();

            if (nomeSite.equalsIgnoreCase("sair")) {
                break;
            }

            Site site = dicionario.get(nomeSite);

            if (site != null) {
                if (site.isAcessoLivre()) {
                    System.out.println("Acessando " + site.toString());
                } else {
                    System.out.println("Site bloqueado: " + site.toString());
                }
            } else {
                System.out.println("Site não encontrado.");
            }
        }
    }

    public static void imprimirInformacoesSites(HashMap<String, Site> dicionario) {
        System.out.println("Informações dos Sites no Dicionário:");

        for (Site site : dicionario.values()) {
            System.out.println(site.toString());
        }
    }
}

