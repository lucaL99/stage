import java.io.Serializable;
import java.util.Date;

public class Impiegato implements Serializable {
    private String nome;
    private String cognome;
    private int stipendio;
    private Date dataDiNascita;

    public Impiegato(String n, String c, int s, Date d) {
        nome = n;
        cognome = c;
        stipendio = s;
        dataDiNascita = d;
    }

    @Override
    public String toString() {
        return "Impiegato [cognome=" + cognome + ", dataDiNascita=" + dataDiNascita + ", nome=" + nome + ", stipendio="
                + stipendio + "]";
    }

}
