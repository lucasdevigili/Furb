import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int inscricaoAlto = 0;
        int alturaAlto = 0;
        int inscricaoBaixo = 0; 
        int alturaBaixo = 300;
        int media = 0;
        int i = 0;
        int val = 1;

        while (val > 0) {
            System.out.println("Digite o número de inscição do atleta");
            int inscricao = teclado.nextInt();

            System.out.println("Digite a altura do atleta");
            int altura = teclado.nextInt();

            int altA = alturaAlto;
            int altB = alturaBaixo;

            if (inscricao == 0) {
                val = 0;
            } else if (altura < altB) {
                altB = altura;
                inscricaoBaixo = inscricao;
                altura += media;
                i++;
            } else if (altura > altA) {
                altA = altura;
                inscricaoAlto = inscricao;
                altura += media;
                i++;
            } else {
                altura += media;
                i++;
            }

        }
        System.out.println("Inscrição do mais alto: " + inscricaoAlto + " Altura do mais alto: " + alturaAlto);
        System.out.println("Inscrição do mais baixo: " + inscricaoBaixo + " Altura do mais baixo: " + alturaBaixo);
        System.out.println("Média: " + (media / i));
        teclado.close();
    }
}
