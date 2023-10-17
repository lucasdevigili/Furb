package Exe9;

public class Principal {
    public static void main(String[] args) {
        Proprietario proprietario = new Proprietario("João Silva", "Rua ABC, 123", "123.456.789-00");


        Veiculo veiculo = new Veiculo("ABC123", proprietario, 50000, false, false);

        veiculo.adicionarMulta(new Multa("Rua X", "Excesso de Velocidade", 150.0, "Em aberto"));
        veiculo.adicionarMulta(new Multa("Avenida Y", "Estacionamento Irregular", 100.0, "Pago"));

        veiculo.consultarInformacoes();
    }
}
