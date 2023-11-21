package Exe5;

public class Lutador extends Atleta{

    public Lutador(String nome, double peso, int idade) {
        super(nome, peso, idade);
    }

    public String definirCategoria() {
        if (getPeso() < 54) {
            return "Pluma";
        } else {
            if (getPeso() < 60) {
                return "Leve";
            } else {
                if (getPeso() < 75) {
                    return "Meio-leve";
                }
            }
        }
        return "Pesado";
    }

}