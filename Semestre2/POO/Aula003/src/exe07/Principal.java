package exe07;

public interface Principal {
    public double calcularDistancia(Ponto p1, Ponto p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
    public static void main(String[] args) {
        Ponto pl = new Ponto(1, 1);
        Ponto p2 = new Ponto(1, 3);
    }
}
