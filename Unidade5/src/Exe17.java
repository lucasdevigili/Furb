import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int inscricaoAlto = 0;
        int alturaAlto = 0;
        int inscricaoBaixo = 0;
        int alturaBaixo = 300;
        int somaAlturas = 0;
        int contador = 0;
        int val = 1;

        while (val > 0) {
            System.out.println("Digite o número de inscrição do atleta");
            int inscricao = teclado.nextInt();

            if (inscricao == 0) {
                val = 0;
            } else {
                System.out.println("Digite a altura do atleta");
                int altura = teclado.nextInt();

                if (altura < alturaBaixo) {
                    alturaBaixo = altura;
                    inscricaoBaixo = inscricao;
                }

                if (altura > alturaAlto) {
                    alturaAlto = altura;
                    inscricaoAlto = inscricao;
                }

                somaAlturas += altura;
                contador++;
            }
        }

        if (contador > 0) {
            int media = somaAlturas / contador;
            System.out.println("Inscrição do mais alto: " + inscricaoAlto + " Altura do mais alto: " + alturaAlto);
            System.out.println("Inscrição do mais baixo: " + inscricaoBaixo + " Altura do mais baixo: " + alturaBaixo);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum atleta foi registrado.");
        }

        teclado.close();
    }
}
