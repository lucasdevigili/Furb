package Exe9;

import java.util.ArrayList;
import java.util.List;

class Proprietario {
    private String nome;
    private String endereco;
    private String cpf;

    public Proprietario(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}


class Veiculo {
    private String placa;
    private Proprietario proprietario;
    private List<Multa> multas;
    private double valorDeMercado;
    private boolean veiculoDeCarga;
    private boolean movidoAAlcool;

    public Veiculo(String placa, Proprietario proprietario, double valorDeMercado, boolean veiculoDeCarga, boolean movidoAAlcool) {
        this.placa = placa;
        this.proprietario = proprietario;
        this.valorDeMercado = valorDeMercado;
        this.veiculoDeCarga = veiculoDeCarga;
        this.movidoAAlcool = movidoAAlcool;
        this.multas = new ArrayList<>();
    }

    public String getPlaca() {
        return placa;
    }

    public double calcularIPVA() {
        double ipva;
        if (veiculoDeCarga) {
            if (valorDeMercado > 100000 && veiculoDeCarga) {
                ipva = valorDeMercado * 0.09;
            } else {
                ipva = valorDeMercado * 0.06;
            }
        } else {
            if (movidoAAlcool) {
                ipva = valorDeMercado * 0.03;
            } else {
                ipva = valorDeMercado * 0.04;
            }
        }
        return ipva;
    }

    public double calcularLicenciamento() {
        double totalLicenciamento = calcularIPVA();
        for (Multa multa : multas) {
            if (multa.getStatus().equalsIgnoreCase("Em aberto")) {
                totalLicenciamento += multa.getValor();
            }
        }
        return totalLicenciamento;
    }

    public void adicionarMulta(Multa multa) {
        multas.add(multa);
    }

   public void consultarInformacoes() {
    System.out.println("Informações do Veículo:");
    System.out.println("Placa: " + placa);
    System.out.println("Valor de Mercado: " + valorDeMercado);
    System.out.println("Proprietário: " + proprietario.getNome()); 
    System.out.println("CPF do Proprietário: " + proprietario.getCpf());
    System.out.println("Endereço do Proprietário: " + proprietario.getEndereco());
    System.out.println("Veículo de Carga: " + (veiculoDeCarga ? "Sim" : "Não"));
    System.out.println("Movido a Álcool: " + (movidoAAlcool ? "Sim" : "Não"));

    System.out.println("\nMultas:");
    for (Multa multa : multas) {
        System.out.println("Local: " + multa.getLocal());
        System.out.println("Tipo: " + multa.getTipo());
        System.out.println("Valor: " + multa.getValor());
        System.out.println("Status: " + multa.getStatus());
    }

    System.out.println("\nValor do Licenciamento: " + calcularLicenciamento());
}

}

