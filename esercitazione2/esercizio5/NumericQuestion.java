import java.util.Scanner;

public class NumericQuestion extends Question {

    public NumericQuestion(String d, String rc, int p) {
        super(d, rc, p);
    }

    public boolean isInteger(String r) {
        if (r == null) {
            return false;
        }
        if (r.length() == 0) {
            return false;
        }
        for (int i = 0; i < r.length(); i++) {
            if (r.charAt(i) < '0' || r.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    @Override
    public int ask() {
        System.out.println(getDomanda());
        Scanner k = new Scanner(System.in);
        String r;
        System.out.println("Inserisci la risposta:");
        r = k.nextLine();
        if (!isInteger(r)) {
            System.out.println("Inserisci solo valori interi");
            return 0;
        }
        if (!getRispostaCorretta().equalsIgnoreCase(r)) {
            return 0;
        }
        return getPunteggio();
    }
}