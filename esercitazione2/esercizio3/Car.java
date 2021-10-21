public class Car extends Vehicle {

    private String tipologia;

    public Car(String ta, String ma, String mo, String ti) {
        super(ta, ma, mo);
        tipologia = ti;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String ti) {
        tipologia = ti;
    }
}