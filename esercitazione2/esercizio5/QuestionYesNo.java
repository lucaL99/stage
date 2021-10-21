import java.util.Scanner;

public class QuestionYesNo extends Question {

    public QuestionYesNo(String d, String rc, int p) {
        super(d, rc, p);
    }

    @Override
    public int ask() {
        System.out.println(getDomanda());
        Scanner k = new Scanner(System.in);
        String r;
        System.out.println("Inserisci la risposta:");
        r = k.nextLine();
        if (!(r.equals("si") || r.equals("no"))) {
            System.out.println("Inserisci solo si o no");
            return 0;
        }
        if (!r.equalsIgnoreCase(getRispostaCorretta())) {
            return 0;
        }
        return getPunteggio();

    }

}