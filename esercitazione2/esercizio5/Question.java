import java.util.Scanner;

public class Question {

    private String domanda;
    private String rispostaCorretta;
    private int punteggio;

    public Question(String d, String rc, int p) {
        domanda = d;
        rispostaCorretta = rc;
        punteggio = p;
    }

    public String getDomanda() {
        return domanda;
    }

    public void setDomanda(String domanda) {
        this.domanda = domanda;
    }

    public String getRispostaCorretta() {
        return rispostaCorretta;
    }

    public void setRispostaCorretta(String rispostaCorretta) {
        this.rispostaCorretta = rispostaCorretta;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public int ask() {
        System.out.println(domanda);
        Scanner k = new Scanner(System.in);
        String r;
        System.out.println("Inserisci la risposta:");
        r = k.nextLine();
        if (!rispostaCorretta.equalsIgnoreCase(r)) {
            return 0;
        }
        return punteggio;
    }
}