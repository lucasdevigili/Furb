package exe1;
public class Principal {
    public static void main(String[] args) {
        //instanciando um objeto do tipo lutador
        Lutador umLutador = new Lutador("João", 35.3);

        //chamando metodo que define a categoria

          // metodo para imprimir o nome e a categoria
             //chamando metodo que irá imprimir as informações
        System.out.println(umLutador.imprimir());
    }
}
