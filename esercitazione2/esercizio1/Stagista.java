public class Stagista extends Person {
    private int numberOfPresence;
    private int idNumber;

    public Stagista(String s, String n, String t, String c, int nOP, int id) {
        super(s, n, t, c);
        numberOfPresence = nOP;
        idNumber = id;
    }

    public int getNumberOfPresence() {
        return numberOfPresence;
    }

    public void setNumberOfPresence(int nOP) {
        numberOfPresence = nOP;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int id) {
        idNumber = id;
    }
}