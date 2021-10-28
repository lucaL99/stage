public class Application {
    public static void main(String[] args) {
        Distributore d = new Distributore();
        d.aggiungiBevanda("Acqua", 0.20);
        d.aggiungiBevanda("Coca", 0.30);
        d.aggiungiBevanda("Birra", 1.20);

        try {
            System.out.println(d.getName('A'));
            System.out.println(d.getPrice('A'));
            System.out.println(d.getName('D'));
            System.out.println(d.getPrice('D'));
        } catch (BevandaNonValida e) {
            e.printStackTrace();
        }
    }

}
