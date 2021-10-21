public class Garage {

    public Garage() {

    }

    public int repair(Vehicle v) {
        int prezzo = 0;
        if (v.getClass().getName().equals("Car")) {
            Car c = (Car) v;
            if (c.getTipologia().equals("utilitaria")) {
                prezzo += 100;
            } else if (c.getTipologia().equals("station wagon")) {
                prezzo += 200;
            } else if (c.getTipologia().equals("crossover")) {
                prezzo += 300;
            } else {
                prezzo += 400;
            }
            if (c.getGuasto()) {
                prezzo += 300;
                c.setGuasto(false);
            }
        } else {
            prezzo = 200;
            if (v.getGuasto()) {
                prezzo += 300;
                v.setGuasto(false);
            }
        }
        return prezzo;
    }
}