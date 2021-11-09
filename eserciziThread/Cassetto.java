import java.util.Random;

public class Cassetto {

    private int soldi;

    public Cassetto() {
        soldi = 0;
    }

    public int getSoldi() {
        return soldi;
    }

    public synchronized int preleva() {
        int prelevato = soldi;
        soldi = 0;
        return prelevato;
    }

    public synchronized void versa() {
        Random r = new Random();
        soldi = r.nextInt(100);
    }

}
