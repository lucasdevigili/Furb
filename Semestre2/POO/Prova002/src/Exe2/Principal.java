package Exe2;

public class Principal {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente(2.500f, "João");
        Supervisor supervisor1 = new Supervisor(3.000f, "José");
        Funcionario funcionario1 = gerente1;

        System.out.println(gerente1.getBonus());
        System.out.println(supervisor1.getBonus());
        System.out.println(funcionario1.getBonus());
    }
}
