public class Addizione extends Stampa implements Operazione {

    private int a;
    private int b;
    private int somma;

    public Addizione(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void operazione() {
        somma = a + b;
    }

    @Override
    public void stampa() {
        System.out.println(a + " + " + b + " = " + somma);
    }

}
