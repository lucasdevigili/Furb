import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManipilacaoArquivo {

	public ManipilacaoArquivo() {
		try {
			escreverArquivo();
			lerArquivo();
		} catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("erro: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private void escreverArquivo() throws IOException {
		File arquivo = new File("arqserializado.bin");
		FileOutputStream fos = new FileOutputStream(arquivo, true);

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject("Exemplo de gravação serializada");
		oos.writeObject(new Pessoa("Luciana", 123456789));
		oos.writeObject(new Livro("Titulo", "Autor", "123456", 30, 50));

		oos.close();
		fos.close();
		
	}

	private void lerArquivo() throws IOException, ClassNotFoundException {

		File arquivo = new File("arqserializado.bin");
		FileInputStream fis = new FileInputStream(arquivo);

		ObjectInputStream ois = new ObjectInputStream(fis);
		//try {
			while (fis.available() != 0) {
				String frase = (String) ois.readObject();
				Pessoa pessoa = (Pessoa) ois.readObject();
				Livro livro = (Livro) ois.readObject();
				
				System.out.println("Frase: " + frase);
				System.out.println(pessoa.toString());
				System.out.println(livro.toString());
			}
//		} catch (EOFException eof) {
//		}


		ois.close();
		fis.close();
		

	}

	public static void main(String[] args) {
		new ManipilacaoArquivo();
	}
}
