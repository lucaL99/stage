import java.util.ArrayList;

public class Distributore {
    private ArrayList<Tessera> distributore = new ArrayList<Tessera>();

    public void caricaTessera(double credito) {

        Tessera t;
        if (distributore.size() == 0) {
            t = new Tessera(1, credito);
        } else {
            int c = distributore.get(distributore.size() - 1).getCodice();
            t = new Tessera(c + 1, credito);
        }
        distributore.add(t);
    }

    public double leggiCredito(int codice) throws TesseraNonValida {
        boolean trovato = false;
        double credito = 0;
        for (Tessera tessera : distributore) {
            if (tessera.getCodice() == codice) {
                trovato = true;
                credito = tessera.getCredito();
            }
        }
        if (!trovato) {
            throw new TesseraNonValida();
        }
        return credito;
    }
}
