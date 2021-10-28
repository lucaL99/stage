public class Bevanda {
    private char codice;
    private String nome;
    private double prezzo;

    public Bevanda(char c, String n, double p) {
        codice = c;
        nome = n;
        prezzo = p;
    }

    public char getCodice() {
        return codice;
    }

    public String getName() {
        return nome;
    }

    public double getPrice() {
        return prezzo;
    }

}
