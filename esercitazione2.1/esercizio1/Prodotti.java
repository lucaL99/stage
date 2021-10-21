public class Prodotti {
    private int codice;
    private String descrizione;
    private double prezzo;

    public Prodotti(int c, String d, double p) {
        codice = c;
        descrizione = d;
        prezzo = p;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int c) {
        codice = c;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String d) {
        descrizione = d;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double p) {
        prezzo = p;
    }

    public void applicaSconto() {
        setPrezzo(prezzo - ((prezzo * 5.0) / 100));
    }

    @Override
    public Prodotti clone() {
        return new Prodotti(getCodice(), getDescrizione(), getPrezzo());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Prodotti p = (Prodotti) obj;

        if (this.codice == 0) {
            return false;
        }
        if (p.codice == 0) {
            return false;
        }
        if (this.codice != p.codice) {
            return false;
        }

        if (this.descrizione == null) {
            return false;
        }
        if (p.descrizione == null) {
            return false;
        }
        if (!this.descrizione.equals(p.descrizione)) {
            return false;
        }

        if (this.prezzo == 0) {
            return false;
        }
        if (p.prezzo == 0) {
            return false;
        }
        if (this.prezzo != p.prezzo) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codice;
        result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
        long temp;
        temp = Double.doubleToLongBits(prezzo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Prodotti [codice=" + codice + ", descrizione=" + descrizione + ", prezzo=" + prezzo + "]";
    }

}
