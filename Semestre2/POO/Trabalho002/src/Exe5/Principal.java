package Exe5;

public class Principal {
    public static void main(String[] args) {
        SetorPessoal ti = new SetorPessoal(5);
    
        ti.adicionarFuncionario(new Funcionario(1, "João", 1, 1000, "Desenvolvedor"));
        ti.adicionarFuncionario(new Funcionario(2, "Maria", 2, 1200, "Gerente"));
        ti.adicionarFuncionario(new Funcionario(3, "Ana", 1, 900, "Analista"));
        ti.adicionarFuncionario(new Funcionario(4, "Carlos", 3, 1300, "Estagiário"));
        ti.adicionarFuncionario(new Funcionario(5, "Pedro", 1, 1100, "Desenvolvedor"));
    
        System.out.println("Folha de Pagamento:");
        ti.imprimirFolhaPagamento();
    
        System.out.println("\nTotal da Folha de Pagamento: " + ti.calcularTotalFolhaPagamento());
    
        System.out.println("\nNome do Funcionário com maior salário: " + ti.obterNomeFuncionarioMaiorSalario());
    
        System.out.println("\nFuncionários do departamento 1:");
        ti.listarFuncionariosDepartamento(1);
    
        System.out.println("\nFuncionários da função 'Desenvolvedor':");
        ti.listarFuncionariosFuncao("Desenvolvedor");
    
        System.out.println("\nFolha de Pagamento Ordem Crescente:");
        ti.imprimirFolhaPagamentoOrdemCrescente();
    }
}