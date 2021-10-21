public class Motocycle extends Vehicle {

    int cilindrata;

    public Motocycle(String t, String ma, String mo, int c) {
        super(t, ma, mo);
        cilindrata = c;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int c) {
        cilindrata = c;
    }
}