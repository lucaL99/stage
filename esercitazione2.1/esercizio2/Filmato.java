public class Filmato extends RegistrazioneAudio {

    private int luminosita;

    public Filmato(String t, int d, int v, int l) {
        super(t, d, v);
        luminosita = l;
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

    @Override
    public void play() {
        String volumeStringa = "";
        String luminositaStringa = "";
        for (int i = 0; i < getVolume(); i++) {
            volumeStringa += "!";
        }
        for (int i = 0; i < luminosita; i++) {
            luminositaStringa += "*";
        }
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitolo() + " " + volumeStringa + " " + luminositaStringa);
        }
    }

    @Override
    public String toString() {
        return "Filmato [titolo=" + getTitolo() + ", durata=" + getDurata() + ", volume=" + getVolume()
                + ", luminosita=" + luminosita + "]";
    }

}
