public class TestVehicles {
    public static void main(String[] args) {
        Vehicle[] veicoli = new Vehicle[5];
        veicoli[0] = new Car("GG150HL", "Ford", "Puma", "crossover");
        veicoli[1] = new Car("GA267AV", "Ford", "Kuga", "SUV");
        veicoli[2] = new Motocycle("DN178KS", "Aprilia", "RS 125", 125);
        veicoli[3] = new Motocycle("EF689DW", "KTM", "125 SX", 125);
        veicoli[4] = new Car("FA567RT", "Audi", "A1", "utilitaria");

        veicoli[0].setGuasto(true);
        veicoli[3].setGuasto(true);

        for (int i = 0; i < veicoli.length; i++) {
            if (veicoli[i].getGuasto()) {
                System.out.println(veicoli[i].getTarga());
            }
        }
    }
}