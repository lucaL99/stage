public class Application {
    public static void main(String[] args) {
        Person p = new Person("Loddo", "Luca", "LDDLCU99S18F205F", "Milano");
        System.out.println("Nome: " + p.getName());
        System.out.println("Cognome: " + p.getSurname());
        System.out.println("Anno di nascita: " + p.bornYear());

        // Rossi Mario nato a Genova (GE) il 10/10/1980 MRARSS80R10D969H
        Stagista s1 = new Stagista("Rossi", "Mario", "MRARSS80R10D969H", "Genova", 50, 001);
        // Bianchi Giuseppe nato a Roma (RM) il 20/05/1985 GSPBCH85E20H501B
        Stagista s2 = new Stagista("Bianchi", "Giuseppe", "GSPBCH85E20H501B", "Roma", 100, 002);
        // Esposito Andrea nato a Padova (PD) il 30/09/2001 SPSNDR01P30G224D
        Stagista s3 = new Stagista("Esposito", "Andrea", "SPSNDR01P30G224D", "Padova", 150, 003);

        Stagista[] stagisti = new Stagista[3];

        if (s1.bornYear() != 0) {
            stagisti[0] = s1;
        }
        if (s2.bornYear() != 0) {
            stagisti[1] = s2;
        }
        if (s3.bornYear() != 0) {
            stagisti[2] = s3;
        }

        int min = 1900;
        int pos = -1;
        for (int i = 0; i < stagisti.length; i++) {
            if (stagisti[i] != null) {
                if (stagisti[i].bornYear() > min) {
                    min = stagisti[i].bornYear();
                    pos = i;
                }
            }
        }

        if (pos != -1) {
            System.out.println("Nome: " + stagisti[pos].getName());
            System.out.println("Cognome: " + stagisti[pos].getSurname());
            System.out.println("Anno di nascita: " + stagisti[pos].bornYear());
        } else {
            System.out.println("Errore di input");
        }

    }
}