package Questão03;

public class Teste {
    private static double altura;
    private static double[] lraguras = new double[2];
    private static double largura;

    public Teste(double altura, int j, int i) {
        setAltura(altura);
        setLarguraUm(lraguras);
        setAlturaDois(lraguras);
    }

    private void setAlturaDois(double[] lraguras) {
        Teste.lraguras = lraguras;
    }

    private void setLarguraUm(double[] lraguras) {
        Teste.lraguras = lraguras;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        Teste.altura = altura;
    }

    public double[] getLraguras() {
        return lraguras;
    }

    private static double calcularVazao() {
        double quantidadeChuva = 0.067;

        for (int i = 0; i < 2;) {
            for (int j = 0; j < 2;) {
            return quantidadeChuva * altura * lraguras[i];
        }
    }
    return calcularVazao();
}
    

    double imprimir() {
        return calcularVazao();
    }
}
