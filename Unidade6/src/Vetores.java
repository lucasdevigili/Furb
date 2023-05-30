import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        // Vetores => ARRAY - Unidimencional

        // Declaração: tipo[] nome = new tipo[tamanho]

        //EX:
        String[] NOMES = new String[10];
        for (int i = 0; i < 10; i++) {
            NOMES[i] = teclado.next();
        }
        System.out.println(NOMES[3]);
        teclado.close();
    }
}
