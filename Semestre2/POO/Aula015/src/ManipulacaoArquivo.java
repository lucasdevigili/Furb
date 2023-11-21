import java.io.File;

public class ManipulacaoArquivo {
    public static void main(String[] args) {
        File dir = new File("c:://temp/");
        File conteudoDir[] = dir.listFiles();
        for(File item: conteudoDir) {
            if (item.isDirectory()) {
                System.out.println("<DIR>" + item.getName());
            }else { 
                System.out.println(item.getName());
            }
        }
    }
}
