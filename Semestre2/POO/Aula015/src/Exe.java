import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exe {
    public Exe() {
        Scanner teclado = new Scanner(System.in);

         try {

            String nomeArquivo = "";
            System.out.println("Digite o nome do arquivo: ");
            nomeArquivo = teclado.nextLine();
            File arquivo = new File(nomeArquivo);
            FileOutputStream fos = new FileOutputStream(arquivo, true);

            // if(arquivo.exists()) {
            //     System.out.println("Esta pasta já existe");
            //     System.out.println("Você desejá substituir? S ou N");
            //     char substituir = teclado.next().charAt(0);
            // }
            

            try (PrintWriter arquivoTexto = new PrintWriter(fos)) {
                System.out.println("Digite algo");
                String texto = teclado.nextLine();

                while (!texto.equals("FIM")) {
                    arquivoTexto.println(texto);
                    System.out.println("Digite algo");
                    texto = teclado.nextLine();
                }
            }

            teclado.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        new Exe();
    }
}