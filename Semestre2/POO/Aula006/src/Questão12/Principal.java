package Questão12;
public class Principal {
    public static void main(String[] args) {
        Apolice umApolice = new Apolice("João", 27, 900.0);

        System.out.println("item b");
        System.out.println(umApolice.imprimir());

        System.out.println("\nitem d");
        umApolice.calcularPremio();

        System.out.println(umApolice.imprimir());

        System.out.println("\nitem e");
        umApolice.oferecerDesconto("Blumenau");

        System.out.println("\nitem f");
        System.out.println(umApolice.imprimir());
    }
}
