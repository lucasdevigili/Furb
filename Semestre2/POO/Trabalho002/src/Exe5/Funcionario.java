package Exe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Classe Funcionario.java
public class Funcionario {
    private int matricula;
    private String nome;
    private int departamento;
    private float salario;
    private String funcao;

    public Funcionario(int matricula, String nome, int departamento, float salario, String funcao) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public int getDepartamento() {
        return departamento;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Nome: " + nome + ", Departamento: " + departamento +
               ", Salario: " + salario + ", Funcao: " + funcao;
    }
}

// Classe SetorPessoal.java
public class SetorPessoal {
    private List<Funcionario> funcionarios;
    private int index;

    public SetorPessoal(int numFuncionarios) {
        funcionarios = new ArrayList<>(numFuncionarios);
        index = 0;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (index < funcionarios.size()) {
            funcionarios.set(index, funcionario);
        } else {
            funcionarios.add(funcionario);
        }
        index++;
    }

    public void imprimirFolhaPagamento() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salario: " + funcionario.getSalario());
        }
    }

    public float calcularTotalFolhaPagamento() {
        float total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.getSalario();
        }
        return total;
    }

    public String funcionarioComMaiorSalario() {
        Funcionario maiorSalarioFuncionario = Collections.max(funcionarios, (f1, f2) -> Float.compare(f1.getSalario(), f2.getSalario()));
        return maiorSalarioFuncionario.getNome();
    }

    public void listarFuncionariosPorDepartamento(int departamento) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getDepartamento() == departamento) {
                System.out.println("Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getFuncao());
            }
        }
    }

    public void listarFuncionariosPorFuncao(String funcao) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getFuncao().equalsIgnoreCase(funcao)) {
                System.out.println("Nome: " + funcionario.getNome());
            }
        }
    }

    public void imprimirFolhaPagamentoOrdenadaPorSalario() {
        List<Funcionario> funcionariosOrdenados = new ArrayList<>(funcionarios);
        funcionariosOrdenados.sort((f1, f2) -> Float.compare(f1.getSalario(), f2.getSalario()));
        for (Funcionario funcionario : funcionariosOrdenados) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salario: " + funcionario.getSalario());
        }
    }
}
