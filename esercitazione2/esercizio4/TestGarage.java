public class TestGarage {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car c1 = new Car("GG150HL", "Ford", "Puma", "crossover");
        Car c2 = new Car("GA267AV", "Ford", "Kuga", "SUV");
        Motocycle m1 = new Motocycle("DN178KS", "Aprilia", "RS 125", 125);
        Motocycle m2 = new Motocycle("EF689DW", "KTM", "125 SX", 125);
        Car c3 = new Car("FA567RT", "Audi", "A1", "utilitaria");

        c2.setGuasto(true);
        m2.setGuasto(true);

        System.out.println(garage.repair(c1));
        System.out.println(garage.repair(c2));
        System.out.println(garage.repair(m1));
        System.out.println(garage.repair(m2));
        System.out.println(garage.repair(c3));

    }
}