package Exe10;

public class Principal {
    public static void main(String[] args) {

        Aviao aviao1 = new Aviao("AB123", "Boeing 737", "Boeing Company", 150);

        Aeroporto aeroporto1 = new Aeroporto("SSA", "Salvador International Airport");
        System.out.println("Informações do Avião:");
        System.out.println("Prefixo: " + aviao1.getPrefixo());
        System.out.println("Modelo: " + aviao1.getModelo());
        System.out.println("Fabricante: " + aviao1.getFabricante());
        System.out.println("Assentos: " + aviao1.getAssentos());

        System.out.println("\nInformações do Aeroporto:");
        System.out.println("Código: " + aeroporto1.getCodigo());
        System.out.println("Nome: " + aeroporto1.getNome());
        System.out.println("Internacional: " + aeroporto1.isInternacional());
    }
}

