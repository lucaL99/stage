public class es2 {
    public static void main(String[] args) {
        Distributore d1 = new Distributore("Milano", "Mario Rossi", 5000, 3000);
        Distributore d2 = new Distributore("Torino", "Luigi Bianchi", 6000, 4000);
        if (d1.confronta(d2) < 0) {
            System.out.println("Il distributore di " + d1.getCitta() + ", di proprieta' di " + d1.getProprietario()
                    + ", ha una capacita' minore di quello di " + d2.getCitta() + ", di proprieta' di "
                    + d2.getProprietario());
        } else if (d1.confronta(d2) > 0) {
            System.out.println("Il distributore di " + d1.getCitta() + ", di proprieta' di " + d1.getProprietario()
                    + ", ha una capacita' maggiore di quello di " + d2.getCitta() + ", di proprieta' di "
                    + d2.getProprietario());
        } else {
            System.out.println("Il distributore di " + d1.getCitta() + ", di proprieta' di " + d1.getProprietario()
                    + ", ha una capacita' uguale a quello di " + d2.getCitta() + ", di proprieta' di "
                    + d2.getProprietario());
        }
    }
}
