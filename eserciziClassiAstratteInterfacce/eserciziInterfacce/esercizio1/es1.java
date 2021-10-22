public class es1 {
    public static void main(String[] args) {
        int x = 2;
        Quadrato q = new Quadrato();
        Cubo c = new Cubo();
        System.out.println("Il quadrato di " + x + " e': " + q.potenza(x));
        System.out.println("Il cubo di " + x + " e': " + c.potenza(x));
    }
}