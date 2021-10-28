public class Application {
    public static void main(String[] args) {
        Distributore d = new Distributore();
        d.caricaTessera(5.5);
        d.caricaTessera(10.0);
        d.caricaTessera(0.75);

        try {
            System.out.println(d.leggiCredito(1));
            System.out.println(d.leggiCredito(4));
        } catch (TesseraNonValida e) {
            e.printStackTrace();
        }
    }
}
