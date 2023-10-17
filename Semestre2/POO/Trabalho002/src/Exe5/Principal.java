package Exe5;
public class Principal {
    public class SetorPessoal {
    private Funcionario[] funcionarios;
    private int indice;

    public SetorPessoal(int numFuncionarios) {
        this.funcionarios = new Funcionario[numFuncionarios];
        this.indice = 0;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (indice < funcionarios.length) {
            funcionarios[indice] = funcionario;
            indice++;
        } else {
            System.out.println("O vetor de funcionários está cheio.");
        }
    }

    public void imprimirFolhaPagamento() {
        System.out.println("Folha de Pagamento:");
        for (int i = 0; i < indice; i++) {
            System.out.println(funcionarios[i].getNome() + ": R$" + funcionarios[i].getSalario());
        }
    }

    public float calcularTotalFolhaPagamento() {
        float total = 0;
        for (int i = 0; i < indice; i++) {
            total += funcionarios[i].getSalario();
        }
        return total;
    }

    public String funcionarioMaiorSalario() {
        if (indice == 0) {
            return "Nenhum funcionário cadastrado.";
        }
        Funcionario maiorSalario = funcionarios[0];
        for (int i = 1; i < indice; i++) {
            if (funcionarios[i].getSalario() > maiorSalario.getSalario()) {
                maiorSalario = funcionarios[i];
            }
        }
        return maiorSalario.getNome();
    }

    public void listarFuncionariosDepartamento(int departamento) {
        System.out.println("Funcionários do Departamento " + departamento + ":");
        for (int i = 0; i < indice; i++) {
            if (funcionarios[i].getDepartamento() == departamento) {
                System.out.println(funcionarios[i].getNome() + " - " + funcionarios[i].getFuncao());
            }
        }
    }
}
     public static void main(String[] args) {
        SetorPessoal setor = new SetorPessoal(10); // Crie um SetorPessoal com espaço para 10 funcionários

        // Adicione funcionários
        setor.adicionarFuncionario(new Funcionario(1, "João", 1, 3000.0f, "Analista"));
        setor.adicionarFuncionario(new Funcionario(2, "Maria", 2, 3500.0f, "Gerente"));
        setor.adicionarFuncionario(new Funcionario(3, "Pedro", 1, 2800.0f, "Analista"));
        // Adicione mais funcionários aqui...

        // Teste os métodos
        setor.imprimirFolhaPagamento();
        System.out.println("Total da Folha de Pagamento: R$" + setor.calcularTotalFolhaPagamento());
        System.out.println("Funcionário com Maior Salário: " + setor.funcionarioMaiorSalario());
        setor.listarFuncionariosDepartamento(1);
        setor.listarFuncionariosPorFuncao("Analista");
        setor.imprimirFolhaPagamentoOrdenada();
    }
}