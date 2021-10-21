public class RegistrazioneAudio extends ElementoMultimediale implements ElementoRiproducibile {

    private int durata;
    private int volume;

    public RegistrazioneAudio(String t, int d, int v) {
        super(t);
        durata = d;
        volume = v;
    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public boolean weaker(int v) {
        if ((volume - v) >= 0) {
            volume -= v;
            return true;
        } else {
            System.out.println("Operazione non consentita");
            return false;
        }
    }

    public boolean louder(int v) {
        if ((volume + v) <= 100) {
            volume += v;
            return true;
        } else {
            System.out.println("Operazione non consentita");
            return false;
        }
    }

    public void play() {
        String volumeStringa = "";
        for (int i = 0; i < volume; i++) {
            volumeStringa += "!";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + volumeStringa);
        }
    }

    @Override
    public String toString() {
        return "RegistrazioneAudio [titolo=" + getTitolo() + ", durata=" + durata + ", volume=" + volume + "]";
    }

}
