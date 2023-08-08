public class Principal {
    public static void main(String[] args) throws Exception {
        // declando variavel do tipo string
        // que irá armazenar o nome João
        String nome = "João";

        // declarando uma variavel do tipo pessoa (com estrutura pessoa)
        // que inicialmente não existe (null)
        Pessoa umaPessoa = null;

        // criando um objeto do tipo pessoa
        umaPessoa.nome = new Pessoa();

        //imprimindo conteudo da variavel umaPessoa
        System.out.println("" + umaPessoa);
    }
}
