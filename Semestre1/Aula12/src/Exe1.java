import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês");
        double horas = teclado.nextDouble();
        
        System.out.print("Digite quanto você ganha por hora");
        double salario = teclado.nextDouble();

        double salarioMes = salario * 40;

        if (horas > 40) {
            double horaExtra = horas - 40;
            double salarioExtra = (salario / 2) * horaExtra;
            System.out.println("seu salário será de: " + (salarioExtra + salarioMes));
        } else {
            System.out.println("seu salário será de: " + salarioMes);
        }
        teclado.close();
    }
}
