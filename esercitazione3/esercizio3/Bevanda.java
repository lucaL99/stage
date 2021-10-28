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

    public void setCodice(char c) {
        codice = c;
    }

    public String getName() {
        return nome;
    }

    public void setName(String n) {
        nome = n;
    }

    public double getPrice() {
        return prezzo;
    }

    public void setPrezzo(double p) {
        prezzo = p;
    }

}
