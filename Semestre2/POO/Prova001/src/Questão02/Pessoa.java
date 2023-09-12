package Questão02;

public class Pessoa {
    private String nome;
    private double altura;
    private double peso;

    public Pessoa(String nome, double altura, double peso) {
        setNome(nome);
        setAltura(altura);
        setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private double calcularIMC() {
        return getPeso() / (getAltura() * getAltura());
    }

    String imprimir() {
        String descPessoa = getNome() + "Voce está com o peso equivalente";
        double IMC = calcularIMC();
        if (IMC <= 18.5) {
            descPessoa = "abaixo";
        } else if (IMC <= 25) {
            descPessoa = "normal";
        } else if (IMC <= 30) {
            descPessoa = "acima";
        } else {
            descPessoa = "obesa";
        }
        return descPessoa;
    }
}