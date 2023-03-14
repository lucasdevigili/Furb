import java.text.DecimalFormat;

public class Exe12 {
    public static void main(String[] args) {
        DecimalFormat df_2 = new DecimalFormat("0.00");
        

        String pessoa = "Ricardo";
        String horasTrab = "170";
        String dependentes = "3";
        
        double valorHora = Double.parseDouble(horasTrab) * 10;
        double valDependentes = Double.parseDouble(dependentes) * 60;

        double salarioBrut = valorHora + valDependentes;

        double desconto = valorHora * 0.13;
        double salarioDesq = valorHora - desconto;

        double salarioLiq = salarioDesq + valDependentes;
        
        System.out.printf("O funcionario: " + pessoa + " receberá um salário bruto de: R$" + df_2.format(salarioBrut) + " dando um salário liquido de: R$" + df_2.format(salarioLiq));
    }
}
