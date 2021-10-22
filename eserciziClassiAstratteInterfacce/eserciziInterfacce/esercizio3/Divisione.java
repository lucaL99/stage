public class Divisione extends Stampa implements Operazione {

    private int a;
    private int b;
    private int divisione;

    public Divisione(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void operazione() {
        if (b != 0) {
            divisione = a / b;
        } else {
            System.out.println("Non è possibile dividere per 0");
        }
    }

    @Override
    public void stampa() {
        System.out.println(a + " / " + b + " = " + divisione);
    }

}
