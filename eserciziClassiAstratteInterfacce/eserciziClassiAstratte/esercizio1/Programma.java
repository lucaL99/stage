public class Programma {
    public static void main(String[] args) {

        Cilindro c = new Cilindro(10.0, 15.0);
        Parallelepipedo p = new Parallelepipedo(5.0, 20.0);

        System.out.println("Volume cilindro: " + c.calcoloVolume());

        System.out.println("Volume parallelepipedo: " + p.calcoloVolume());

    }
}