import java.util.Scanner;

public class LucasGabrielDevigili_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int chapaUm = 0;
        int chapaDois = 0;
        int nulo = 0;
        int encerraVotacao = 1;
        
        while (encerraVotacao == 1) {
            System.out.println(
                    "Siga as instruções: \n 1 - Votar na chapa 1. \n 2 - Votar na chapa 2. \n 3 - Anular seu voto. \n 0 - Encerrar a votação.");
            int voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    chapaUm++;
                    break;
                case 2:
                    chapaDois++;
                    break;
                case 3:
                    nulo++;
                    break;
                case 0:
                    encerraVotacao = 0;
                    break;
                default:
                    System.out.println("Opção incorreta");
            }
        }
        int numeroDeVotos = (chapaUm + chapaDois + nulo);
        
        System.out.println("Total de votos para a chapa 1: " + chapaUm);
        System.out.println("Percentual de votos para a chapa 1: " + (chapaUm * 100)/numeroDeVotos + "%");
        System.out.println("Total de votos para a chapa 2: " + chapaDois);
        System.out.println("Percentual de votos para a chapa 2: " + (chapaDois * 100)/numeroDeVotos + "%");
        System.out.println("Total de votos nulos: " + nulo);
        System.out.println("Percentual de votos nulos: " + (nulo * 100)/numeroDeVotos + "%");

        if(chapaUm > chapaDois && chapaUm > nulo) {
            System.out.println("Chapa 1 foi a vecedora");
        } else if (chapaDois > chapaUm && chapaDois > nulo) {
            System.out.println("Chapa 2 foi a vecedora");
        } else if (nulo > chapaUm && nulo > chapaDois) {
            System.out.println("Votação anulada");
        } else {
            System.out.println("Empate");
        }
        teclado.close();
    }
}