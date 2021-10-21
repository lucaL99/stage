import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ListaSpesa {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        String tessera = "", descrizione = "", materiale = "";
        int scelta = 0, codice = 0, giorno = 0, mese = 0, anno = 0;
        double spesaTotale = 0, prezzo = 0;
        boolean hasNextInt = true, hasNextDouble = true;
        Calendar c = Calendar.getInstance();
        Date dataDiScadenza;

        do {
            System.out.println("Ha la tessera fedelta'? Inserire Y o N");
            tessera = k.next();
            if (!(tessera.equals("Y") || tessera.equals("N"))) {
                System.out.println("Inserisci Y o N");
            }
        } while (!(tessera.equals("Y") || tessera.equals("N")));

        System.out.println();
        System.out.println("* INSERIMENTO PRODOTTI *");

        do {
            do {
                System.out.println("Prodotto alimentare o non alimentare?");
                System.out.println("0 - Fine spesa");
                System.out.println("1 - Alimentare");
                System.out.println("2 - Non alimentare");
                hasNextInt = k.hasNextInt();
                if (hasNextInt) {
                    scelta = k.nextInt();
                    if ((scelta != 0) && (scelta != 1) && (scelta != 2)) {
                        System.out.println("Inserisci 0, 1 o 2");
                    }
                } else {
                    k.next();
                    System.out.println("Input non valido");
                }
            } while (((scelta != 0) && (scelta != 1) && (scelta != 2)) || (!hasNextInt));

            switch (scelta) {
            case 0: {
                System.out.println("* FINE SPESA *");
                System.out.println();
                System.out.format("Importo: %.2f euro", spesaTotale);
                break;
            }
            case 1: {
                do {
                    System.out.println("Codice:");
                    hasNextInt = k.hasNextInt();
                    if (hasNextInt) {
                        codice = k.nextInt();
                    } else {
                        k.next();
                        System.out.println("Input non valido");
                    }
                } while (!hasNextInt);
                System.out.println("Descrizione:");
                descrizione = k.next();
                do {
                    System.out.println("Prezzo:");
                    hasNextDouble = k.hasNextDouble();
                    if (hasNextDouble) {
                        prezzo = k.nextDouble();
                    } else {
                        k.next();
                        System.out.println("Input non valido");
                    }
                } while (!hasNextDouble);
                System.out.println("Data di scadenza");
                do {
                    System.out.println("Inserisci il giorno:");
                    hasNextInt = k.hasNextInt();
                    if (hasNextInt) {
                        giorno = k.nextInt();
                    } else {
                        k.next();
                        System.out.println("Input non valido");
                    }
                } while (!hasNextInt);
                do {
                    System.out.println("Inserisci il mese (numerico):");
                    hasNextInt = k.hasNextInt();
                    if (hasNextInt) {
                        mese = k.nextInt();
                        mese -= 1;
                    } else {
                        k.next();
                        System.out.println("Input non valido");
                    }
                } while (!hasNextInt);
                do {
                    System.out.println("Inserisci l'anno:");
                    hasNextInt = k.hasNextInt();
                    if (hasNextInt) {
                        anno = k.nextInt();
                    } else {
                        k.next();
                        System.out.println("Input non valido");
                    }
                } while (!hasNextInt);

                c.set(anno, mese, giorno);

                dataDiScadenza = c.getTime();

                Alimentari a = new Alimentari(codice, descrizione, prezzo, dataDiScadenza);

                if (tessera.equals("Y")) {
                    a.applicaSconto();
                }

                spesaTotale += a.getPrezzo();
                break;
            }
            case 2: {
                do {
                    System.out.println("Codice:");
                    hasNextInt = k.hasNextInt();
                    if (hasNextInt) {
                        codice = k.nextInt();
                    } else {
                        k.next();
                        System.out.println("Input non valido");
                    }
                } while (!hasNextInt);
                System.out.println("Descrizione:");
                descrizione = k.next();
                do {
                    System.out.println("Prezzo:");
                    hasNextDouble = k.hasNextDouble();
                    if (hasNextDouble) {
                        prezzo = k.nextDouble();
                    } else {
                        k.next();
                        System.out.println("Input non valido");
                    }
                } while (!hasNextDouble);
                System.out.println("Materiale");
                materiale = k.next();

                NonAlimentari na = new NonAlimentari(codice, descrizione, prezzo, materiale);

                if (tessera.equals("Y")) {
                    na.applicaSconto();
                }

                spesaTotale += na.getPrezzo();
                break;
            }
            }
        } while (scelta != 0);
    }
}