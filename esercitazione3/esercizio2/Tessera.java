public class Tessera {
    private int codice;
    private double credito;

    public Tessera(int co, double cr) {
        codice = co;
        credito = cr;
    }

    public int getCodice() {
        return codice;
    }

    public double getCredito() {
        return credito;
    }

}