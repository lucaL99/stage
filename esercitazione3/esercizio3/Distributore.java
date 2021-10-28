import java.util.ArrayList;

public class Distributore {
    private ArrayList<Colonna> distributore = new ArrayList<Colonna>(4);

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

    public int lattineDisponibili(char codice) {
        int somma = 0;
        for (Colonna colonna : distributore) {
            if (colonna.getBevanda().getCodice() == codice) {
                somma += colonna.getNumeroLattine();
            }
        }
        return somma;
    }

}
