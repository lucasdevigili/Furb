package Exe5;

import java.util.Arrays;

public class SetorPessoal {

    private Funcionario[] funcionarios;
    private int indice;

    public SetorPessoal(int quantidadeFuncionarios) {
        this.funcionarios = new Funcionario[quantidadeFuncionarios];
        this.indice = 0;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios[indice++] = funcionario;
    }

    public void imprimirFolhaPagamento() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " - " + funcionario.getSalario());
        }
    }

    public float calcularTotalFolhaPagamento() {
        float total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.getSalario();
        }
        return total;
    }

    public String obterNomeFuncionarioMaiorSalario() {
        Funcionario maiorSalario = funcionarios[0];
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSalario() > maiorSalario.getSalario()) {
                maiorSalario = funcionario;
            }
        }
        return maiorSalario.getNome();
    }

    public void listarFuncionariosDepartamento(int departamento) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getDepartamento() == departamento) {
                System.out.println(funcionario.getNome() + " - " + funcionario.getFuncao());
            }
        }
    }

    public void listarFuncionariosFuncao(String funcao) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getFuncao().equalsIgnoreCase(funcao)) {
                System.out.println(funcionario.getNome());
            }
        }
    }

    public void imprimirFolhaPagamentoOrdemCrescente() {
        Funcionario[] funcionariosOrdenados = Arrays.copyOf(funcionarios, indice);
        Arrays.sort(funcionariosOrdenados, (f1, f2) -> Float.compare(f1.getSalario(), f2.getSalario()));
        for (Funcionario funcionario : funcionariosOrdenados) {
            System.out.println(funcionario.getNome() + " - " + funcionario.getSalario());
        }
    }
}