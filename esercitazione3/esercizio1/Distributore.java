import java.util.ArrayList;

public class Distributore {
    private ArrayList<Bevanda> distributore = new ArrayList<Bevanda>();

    public void aggiungiBevanda(String n, double p) {
        Bevanda b;

        if (distributore.size() == 0) {
            b = new Bevanda('A', n, p);
        } else {
            char c1 = distributore.get(distributore.size() - 1).getCodice();
            int c2 = ((int) c1) + 1;
            c1 = (char) c2;
            b = new Bevanda(c1, n, p);
        }

        distributore.add(b);

    }

    public double getPrice(char codice) throws BevandaNonValida {
        boolean trovato = false;
        double price = 0;
        for (Bevanda bevanda : distributore) {
            if (bevanda.getCodice() == codice) {
                trovato = true;
                price = bevanda.getPrice();
            }
        }
        if (!trovato) {
            throw new BevandaNonValida();
        }
        return price;
    }

    public String getName(char codice) throws BevandaNonValida {
        boolean trovato = false;
        String name = "";
        for (Bevanda bevanda : distributore) {
            if (bevanda.getCodice() == codice) {
                trovato = true;
                name = bevanda.getName();
            }
        }
        if (!trovato) {
            throw new BevandaNonValida();
        }
        return name;
    }

}
