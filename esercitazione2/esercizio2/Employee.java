public class Employee extends Person {

    private int annoDiAssunzione;
    private double stipendio;

    public Employee(String su, String n, String t, String c, int a, double st) {
        super(su, n, t, c);
        annoDiAssunzione = a;
        stipendio = st;
    }

    public int getAnnoDiAssunzione() {
        return annoDiAssunzione;
    }

    public void setAnnoDiAssunzione(int a) {
        annoDiAssunzione = a;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double s) {
        stipendio = s;
    }

    public boolean gainsMore(Employee e) {
        if (getStipendio() >= e.getStipendio()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", annoDiAssunzione=" + annoDiAssunzione + ", stipendio=" + stipendio;
    }

}