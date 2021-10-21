import java.util.Date;

public class Alimentari extends Prodotti {
    private Date dataDiScadenza;

    public Alimentari(int c, String d, double p, Date dds) {
        super(c, d, p);
        dataDiScadenza = dds;
    }

    public Date getDataDiScadenza() {
        return dataDiScadenza;
    }

    public void setDataDiScadenza(Date dds) {
        dataDiScadenza = dds;
    }

    public long differenzaDate() {
        return (dataDiScadenza.getTime() - new Date().getTime()) / (1000 * 60 * 60 * 24);
    }

    @Override
    public void applicaSconto() {
        if (differenzaDate() < 10) {
            setPrezzo(getPrezzo() - ((getPrezzo() * 20.0) / 100));
        } else {
            super.applicaSconto();
        }
    }

}
