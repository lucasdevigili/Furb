package exe1;
public class Lutador {
    // Definindo e declarando atributos
    private String nome;
    private double peso;

    // Definindo e criando métodos acessores e modificadores
    public Lutador(String nome, double peso) {
        setNome(nome);
        setPeso(peso);
    }

    // setNome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // getNome
    public String getNome() {
        return this.nome;
    }

    // setPeso
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // getPeso
    public double getPeso() {
        return this.peso;
    }

    public String definirCategoria() {
        String categoria = "";
        if (getPeso() <= 54) {
            categoria = "Pluma";
        } else {
            if (getPeso() <= 60) {
                categoria = "Leve";
            } else {
                if (getPeso() <= 75) {
                    categoria = "Meio-Leve";
                } else {
                    categoria = "Pesado";
                }
            }
        }
        return categoria;
    }

    // metodo para imprimir o nome e a categoria
    public String imprimir() {
        return "O lutador " + getNome() +
        " compete na categoria " + definirCategoria();
    }
}