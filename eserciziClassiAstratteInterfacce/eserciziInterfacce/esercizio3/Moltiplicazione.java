public class Moltiplicazione extends Stampa implements Operazione {

    private int a;
    private int b;
    private int moltiplicazione;

    public Moltiplicazione(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void operazione() {
        moltiplicazione = a * b;
    }

    @Override
    public void stampa() {
        System.out.println(a + " * " + b + " = " + moltiplicazione);
    }

}
