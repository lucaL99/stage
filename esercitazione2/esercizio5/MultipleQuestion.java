import java.util.Scanner;

public class MultipleQuestion extends NumericQuestion {

    private String[] opzioni = new String[5];
    private String[] opzioniCorrette = new String[5];

    public MultipleQuestion(String d, String rc, int p, String[] o, String[] oc) {
        super(d, rc, p);
        opzioni = o;
        opzioniCorrette = oc;
    }

    @Override
    public int ask() {
        System.out.println(getDomanda());

        Scanner k = new Scanner(System.in);
        int nRisposte = 0;
        String r;
        boolean hasNextInt;

        System.out.println("Risposte: ");
        for (int i = 0; i < opzioni.length; i++) {
            System.out.println(i + " - " + opzioni[i]);
        }

        do {
            System.out.println("Inserisci il numero di risposte corrette:");
            hasNextInt = k.hasNextInt();
            if (hasNextInt) {
                nRisposte = k.nextInt();
                if (nRisposte == 0) {
                    System.out.println("Hai inserito 0");
                }
                if (nRisposte > opzioni.length) {
                    System.out.println("Hai scelto piu' opzioni rispetto a quelle disponibili");
                }
            } else {
                k.next();
                System.out.println("Input non valido");
            }

        } while ((!hasNextInt) || (nRisposte == 0) || (nRisposte > opzioni.length));

        for (int i = 0; i < nRisposte; i++) {
            boolean checkRisposta = true;

            do {
                System.out.println("Inserisci una risposta:");
                r = k.next();
                for (int j = 0; j < opzioni.length && checkRisposta; j++) {
                    if (r.equals(opzioni[j])) {
                        checkRisposta = false;
                    }
                }
                if (checkRisposta) {
                    System.out.println("Inserisci solo valori consentiti");
                }
            } while (checkRisposta);

            boolean rispostaGiusta = true;
            for (int j = 0; j < opzioniCorrette.length && rispostaGiusta; j++) {
                if (r.equals(opzioniCorrette[j])) {
                    rispostaGiusta = false;
                }
            }
            if (rispostaGiusta) {
                return 0;
            }
        }

        return getPunteggio();
    }
}