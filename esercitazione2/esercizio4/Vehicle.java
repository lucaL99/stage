public class Vehicle {
    private String targa;
    private String marca;
    private String modello;
    private boolean guasto;

    public Vehicle(String t, String ma, String mo) {
        targa = t;
        marca = ma;
        modello = mo;
        guasto = false;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String t) {
        targa = t;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String ma) {
        marca = ma;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String mo) {
        modello = mo;
    }

    public boolean getGuasto() {
        return guasto;
    }

    public void setGuasto(boolean g) {
        guasto = g;
    }

}