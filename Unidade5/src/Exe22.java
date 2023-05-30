public class Exe22 {
    public static void main(String[] args) {
        int anoContratacao = 1995;
        double salarioInicial = 2000.0;
        double aumento = 0.015;
        double salarioAtual = salarioInicial;
        
        for (int ano = anoContratacao + 1; ano <= 2023; ano++) {
            salarioAtual += salarioAtual * aumento;
            aumento *= 2;
        }
        
        System.out.println("O salário atual do funcionário é: R$ " + salarioAtual);
    }
}
 
    

