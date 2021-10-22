import java.util.Random;

public class Moneta {

    int faccia;

    public Moneta() {

    }

    public void lancia() {
        Random r = new Random();
        faccia = r.nextInt(2) + 1;
        System.out.println("MONETA");
        System.out.println(faccia);
        if (faccia == 1) {
            System.out.println("E' uscito testa");
        } else {
            System.out.println("E' uscito croce");
        }
    }
}
