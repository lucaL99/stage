public class NonAlimentari extends Prodotti {
    private String materiale;

    public NonAlimentari(int c, String d, double p, String m) {
        super(c, d, p);
        materiale = m;
    }

    public String getMateriale() {
        return materiale;
    }

    public void setMateriale(String m) {
        materiale = m;
    }

    @Override
    public void applicaSconto() {
        if (materiale.equals("carta") || materiale.equals("plastica") || materiale.equals("vetro")) {
            setPrezzo(getPrezzo() - ((getPrezzo() * 10.0) / 100));
        } else {
            super.applicaSconto();
        }

    }

}
