public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa umaPessoa = null;

        umaPessoa = new Pessoa();

        umaPessoa.nome = "João";

        System.out.println(umaPessoa.nome);


        Pessoa outraPessoa = null;

        outraPessoa = new Pessoa();

        outraPessoa.nome = "Maria";

        System.out.println(outraPessoa.nome);


        Pessoa terceiraPessoa = umaPessoa;
        System.out.println(terceiraPessoa.nome);


        Pessoa quartaPessoa = new Pessoa();
        Pessoa quintaPessoa = outraPessoa;
        quintaPessoa.nome = "Pedro";
        quartaPessoa.nome = "José";

        System.out.println(umaPessoa.nome);
        System.out.println(outraPessoa.nome);
        System.out.println(terceiraPessoa.nome);
        System.out.println(quartaPessoa.nome);
        System.out.println(quintaPessoa.nome);
    }
}