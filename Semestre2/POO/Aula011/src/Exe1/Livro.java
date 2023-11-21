package Exe1;
public class Livro extends Publicacao{
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String imprimir() {
        return "Nome:" + getNome() + "\n" +
                "ISBN" + getISBN();
    }
}
