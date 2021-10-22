import java.util.Random;

import java.util.Random;

public class Dado extends OggettoLanciabile {

    public Dado() {

    }

    @Override
    public void lancia() {
        Random r = new Random();
        setFaccia(r.nextInt(6) + 1);
        System.out.println("DADO");
        System.out.println("E' uscito: " + getFaccia());
    }

}
