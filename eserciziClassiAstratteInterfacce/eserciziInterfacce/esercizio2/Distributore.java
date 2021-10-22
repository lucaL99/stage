public class Distributore implements Comparable {
    private String citta;
    private String proprietario;
    private int capacita;
    private int benzina;

    public Distributore(String ci, String p, int ca, int b) {
        citta = ci;
        proprietario = p;
        capacita = ca;
        benzina = b;
    }

    public String getCitta() {
        return citta;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void erogazioneCarburante(int benzina) {
        if (this.benzina - benzina >= 0) {
            this.benzina = this.benzina - benzina;
        }
    }

    @Override
    public int confronta(Distributore d2) {
        if (this.capacita < d2.capacita) {
            return -1;
        } else if (this.capacita > d2.capacita) {
            return 1;
        } else {
            return 0;
        }
    }

}