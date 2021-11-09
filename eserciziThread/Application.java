public class Application {
    public static void main(String[] args) {
        Cassetto cassetto = new Cassetto();
        Genitore genitore = new Genitore(cassetto);
        genitore.setName("Genitore");
        Figlio figlio = new Figlio(cassetto);
        figlio.setName("Figlio");
        genitore.start();
        figlio.start();
    }
}