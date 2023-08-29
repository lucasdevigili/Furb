package Exe10;

public class Eleitor {
    private String Nome;
    private int Idade;

    public Eleitor(String Nome, int Idade) {
        setNome(Nome);
        setIdade(Idade);
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setIdade(int Idade) {
        if (Idade < 0) {
            throw new IllegalArgumentException("Idade inválida/negada");
        }
        this.Idade = Idade;
    }

    public int getIdade() {
        return Idade;
    }

    private String verificar() {
            if (Idade < 16) {
                return"Eleitor não pode votar";
            } else {
                if (Idade >= 16 && Idade <= 65) {
                    return"Eleitor deve votar";
                }
            }
            return "Voto facultativo";
    }

    public String Imprimir() {
        return "Nome: " + getNome() + " Idade: " + getIdade() + " " + verificar();
    }
}