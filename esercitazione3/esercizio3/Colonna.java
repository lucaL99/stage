public class Colonna {
    private int numeroColonna;
    private Bevanda bevanda;
    private int numeroLattine;

    public Colonna(int nC) {
        numeroColonna = nC;
    }

    public Colonna(int nC, Bevanda b, int nL) {
        numeroColonna = nC;
        bevanda.setCodice(b.getCodice());
        bevanda.setName(b.getName());
        bevanda.setPrezzo(b.getPrice());
        numeroLattine = nL;
    }

    public int getNumeroColonna() {
        return numeroColonna;
    }

    public Bevanda getBevanda() {
        return bevanda;
    }

    public void setBevanda(Bevanda b) {
        bevanda = b;
    }

    public int getNumeroLattine() {
        return numeroLattine;
    }

    public void setNumeroLattine(int nL) {
        numeroLattine = nL;
    }

}
