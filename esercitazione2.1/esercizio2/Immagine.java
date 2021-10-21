public class Immagine extends ElementoMultimediale implements ElementoNonRiproducibile {

    private int luminosita;

    public Immagine(String t, int l) {
        super(t);
        if ((l >= 0) && (l <= 100)) {
            luminosita = l;
        } else {
            luminosita = 0;
        }
    }

    public int getLuminosita() {
        return luminosita;
    }

    public boolean darker(int l) {
        if ((luminosita - l) >= 0) {
            luminosita -= l;
            return true;
        } else {
            System.out.println("Operazione non consentita");
            return false;
        }
    }

    public boolean brighter(int l) {
        if ((luminosita + l) <= 100) {
            luminosita += l;
            return true;
        } else {
            System.out.println("Operazione non consentita");
            return false;
        }
    }

    public void show() {

        String luminositaStringa = "";

        for (int i = 0; i < luminosita; i++) {
            luminositaStringa += "*";
        }

        System.out.println(getTitolo() + " " + luminositaStringa);
    }

    @Override
    public String toString() {
        return "Immagine [titolo=" + getTitolo() + ", luminosita=" + luminosita + "]";
    }

}
