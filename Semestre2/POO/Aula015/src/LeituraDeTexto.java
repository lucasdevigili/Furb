import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraDeTexto {  

        public LeituraDeTexto() {
            try{
                Scanner leitor = new Scanner(new File("C:/Users/lucas/Desktop/texto.aula.txt"));

                // while (leitor.hasNext()) {
                //     System.out.println(leitor.nextLine());
                // }

                String aula = leitor.nextLine();
                String turma = leitor.nextLine();
                int ano = leitor.nextInt();

                System.out.println("Informações da turma: \n" + aula + "" + turma);
                System.out.println("Ano: " + ano);

                leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        new LeituraDeTexto();
    }
}