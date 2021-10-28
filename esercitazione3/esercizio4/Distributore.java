import java.util.ArrayList;

public class Distributore {
    private ArrayList<Colonna> distributore = new ArrayList<Colonna>(4);
    private ArrayList<Tessera> tessere = new ArrayList<Tessera>();

    public Distributore() {
        distributore.add(new Colonna(1));
        distributore.add(new Colonna(2));
        distributore.add(new Colonna(3));
        distributore.add(new Colonna(4));
    }

    public void aggiornaColonna(int numeroColonna, Bevanda bevanda, int numeroLattine) {
        for (Colonna colonna : distributore) {
            if (colonna.getNumeroColonna() == numeroColonna) {
                colonna.setBevanda(bevanda);
                colonna.setNumeroLattine(numeroLattine);
            }
        }
    }

    public void caricaTessera(double credito) {
        Tessera t;
        if (tessere.size() == 0) {
            t = new Tessera(1, credito);
        } else {
            int c = tessere.get(tessere.size() - 1).getCodice();
            t = new Tessera(c + 1, credito);
        }
        tessere.add(t);
    }

    public int lattineDisponibili(char codice) {
        int somma = 0;
        for (Colonna colonna : distributore) {
            if (colonna.getBevanda().getCodice() == codice) {
                somma += colonna.getNumeroLattine();
            }
        }
        return somma;
    }

    public double getPrice(char codice) throws BevandaNonValida {
        boolean trovato = false;
        double price = 0;
        for (Colonna colonna : distributore) {
            if (colonna.getBevanda().getCodice() == codice) {
                trovato = true;
                price = colonna.getBevanda().getPrice();
            }
        }
        if (!trovato) {
            throw new BevandaNonValida();
        }
        return price;
    }

    public double leggiCredito(int codice) throws TesseraNonValida {
        boolean trovato = false;
        double credito = 0;
        for (Tessera tessera : tessere) {
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

    public int eroga(char codiceBevanda, int codiceTessera)
            throws BevandaNonValida, TesseraNonValida, CreditoInsufficiente, BevandaEsaurita {
        double prezzoBevanda = getPrice(codiceBevanda);
        double creditoDisponibile = leggiCredito(codiceTessera);
        if (creditoDisponibile < prezzoBevanda) {
            throw new CreditoInsufficiente();
        }
        if (lattineDisponibili(codiceBevanda) == 0) {
            throw new BevandaEsaurita();
        }
        for (Tessera tessera : tessere) {
            if (tessera.getCodice() == codiceTessera) {
                tessera.decrementaCredito(prezzoBevanda);
            }
        }
        int numeroColonna = 0;
        boolean trovato = true;
        for (int i = 0; i < distributore.size() && trovato; i++) {
            if (distributore.get(i).getBevanda().getCodice() == codiceBevanda) {
                if (distributore.get(i).getNumeroLattine() > 0) {
                    trovato = false;
                    numeroColonna = distributore.get(i).getNumeroColonna();
                    distributore.get(i).setNumeroLattine(distributore.get(i).getNumeroLattine() - 1);
                }
            }
        }
        return numeroColonna;
    }

}
