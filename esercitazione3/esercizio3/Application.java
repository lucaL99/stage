public class Application {

    public static void main(String[] args) {
        Distributore d = new Distributore();
        d.aggiornaColonna(1, new Bevanda('A', "Acqua", 0.20), 40);
        d.aggiornaColonna(2, new Bevanda('B', "Coca", 0.30), 1);
        d.aggiornaColonna(3, new Bevanda('C', "Birra", 1.00), 50);
        d.aggiornaColonna(4, new Bevanda('A', "Acqua", 0.20), 50);
        System.out.println(d.lattineDisponibili('A'));
    }

}
