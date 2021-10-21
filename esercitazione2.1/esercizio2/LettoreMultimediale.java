import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {

        ElementoMultimediale[] e = new ElementoMultimediale[5];
        int sceltaVolume = 0, sceltaLuminosita = 0, sceltaParametro = 0, sceltaIniziale = 0, scelta = 0, durata = 0,
                volume = 0, luminosita = 0;
        boolean weaker = true, louder = true, darker = true, brighter = true, hasNextInt = true;
        String titolo = "";
        Scanner k = new Scanner(System.in);

        /*
         * for (int i = 0; i < e.length; i++) { do {
         * System.out.println("Inserisci un elemento multimediale");
         * System.out.println("1 - Registrazione audio");
         * System.out.println("2 - Filmato"); System.out.println("3 - Immagine");
         * hasNextInt = k.hasNextInt(); if (hasNextInt) { scelta = k.nextInt(); if
         * ((scelta <= 0) || (scelta > 3)) { System.out.println("Inserisci 1, 2 o 3"); }
         * } else { k.next(); System.out.println("Input non valido"); } } while ((scelta
         * <= 0) || (scelta > 3) || (!hasNextInt)); System.out.println("Titolo:");
         * titolo = k.next(); switch (scelta) { case 1: { do {
         * System.out.println("Durata:"); hasNextInt = k.hasNextInt(); if (hasNextInt) {
         * durata = k.nextInt(); if (durata <= 0) {
         * System.out.println("La durata deve essere maggiore di 0"); } } else {
         * k.next(); System.out.println("Input non valido"); } } while ((durata <= 0) ||
         * (!hasNextInt)); do { System.out.println("Volume:"); hasNextInt =
         * k.hasNextInt(); if (hasNextInt) { volume = k.nextInt(); if (volume < 0) {
         * System.out.println("Il volume deve essere maggiore o uguale a 0"); } else if
         * (volume > 100) {
         * System.out.println("Il volume deve essere minore o uguale a 100"); } } else {
         * k.next(); System.out.println("Input non valido"); } } while ((volume < 0) ||
         * (volume > 100) || (!hasNextInt)); e[i] = new RegistrazioneAudio(titolo,
         * durata, volume); break; } case 2: { do { System.out.println("Durata:");
         * hasNextInt = k.hasNextInt(); if (hasNextInt) { durata = k.nextInt(); if
         * (durata <= 0) { System.out.println("La durata deve essere maggiore di 0"); }
         * } else { k.next(); System.out.println("Input non valido"); } } while ((durata
         * <= 0) || (!hasNextInt)); do { System.out.println("Volume:"); hasNextInt =
         * k.hasNextInt(); if (hasNextInt) { volume = k.nextInt(); if (volume < 0) {
         * System.out.println("Il volume deve essere maggiore o uguale a 0"); } else if
         * (volume > 100) {
         * System.out.println("Il volume deve essere minore o uguale a 100"); } } else {
         * k.next(); System.out.println("Input non valido"); } } while ((volume < 0) ||
         * (volume > 100) || (!hasNextInt)); do { System.out.println("Luminosita:");
         * hasNextInt = k.hasNextInt(); if (hasNextInt) { luminosita = k.nextInt(); if
         * (luminosita < 0) {
         * System.out.println("La luminosita' deve essere maggiore o uguale a 0"); }
         * else if (luminosita > 100) {
         * System.out.println("La luminosita' deve essere minore o uguale a 100"); } }
         * else { k.next(); System.out.println("Input non valido"); } } while
         * ((luminosita < 0) || (luminosita > 100) || (!hasNextInt)); e[i] = new
         * Filmato(titolo, durata, volume, luminosita); break; } case 3: { do {
         * System.out.println("Luminosita:"); hasNextInt = k.hasNextInt(); if
         * (hasNextInt) { luminosita = k.nextInt(); if (luminosita < 0) {
         * System.out.println("La luminosita' deve essere maggiore o uguale a 0"); }
         * else if (luminosita > 100) {
         * System.out.println("La luminosita' deve essere minore o uguale a 100"); } }
         * else { k.next(); System.out.println("Input non valido"); } } while
         * ((luminosita < 0) || (luminosita > 100) || (!hasNextInt)); e[i] = new
         * Immagine(titolo, luminosita); break; } } }
         */

        e[0] = new RegistrazioneAudio("audio1", 1, 1);
        e[1] = new Filmato("video1", 2, 2, 2);
        e[2] = new Immagine("immagine1", 3);
        e[3] = new RegistrazioneAudio("audio2", 4, 4);
        e[4] = new Filmato("video2", 5, 5, 5);

        do {
            do {
                System.out.println("Quale elemento eseguire da 1 a 5? 0 per terminare");
                hasNextInt = k.hasNextInt();
                if (hasNextInt) {
                    sceltaIniziale = k.nextInt();
                    if ((sceltaIniziale < 0) || (sceltaIniziale > 5)) {
                        System.out.println("Input non valido");
                    }
                } else {
                    k.next();
                    System.out.println("Input non valido");
                }
            } while ((sceltaIniziale < 0) || (sceltaIniziale > 5) || (!hasNextInt));
            if (sceltaIniziale != 0) {
                scelta = sceltaIniziale;
                scelta -= 1;
                if (e[scelta].getClass() == Immagine.class) {
                    Immagine i = (Immagine) e[scelta];
                    i.show();
                    do {
                        System.out.println("Vuoi regolare la luminosita'?");
                        System.out.println("1 - Si");
                        System.out.println("2 - No");
                        hasNextInt = k.hasNextInt();
                        if (hasNextInt) {
                            sceltaParametro = k.nextInt();
                            if ((sceltaParametro != 1) && (sceltaParametro != 2)) {
                                System.out.println("Inserisci 1 o 2");
                            }
                        } else {
                            k.next();
                            System.out.println("Input non valido");
                        }
                    } while (((sceltaParametro != 1) && (sceltaParametro != 2)) || (!hasNextInt));

                    if (sceltaParametro == 1) {
                        do {
                            System.out.println("Vuoi alzare o abbassare la luminosita'?");
                            System.out.println("1 - Alzare");
                            System.out.println("2 - Abbassare");
                            hasNextInt = k.hasNextInt();
                            if (hasNextInt) {
                                sceltaLuminosita = k.nextInt();
                                if ((sceltaLuminosita != 1) && (sceltaLuminosita != 2)) {
                                    System.out.println("Inserisci 1 o 2");
                                }
                            } else {
                                k.next();
                                System.out.println("Input non valido");
                            }
                        } while (((sceltaLuminosita != 1) && (sceltaLuminosita != 2)) || (!hasNextInt));
                        if (sceltaLuminosita == 1) {
                            do {
                                System.out.println("Di quanto vuoi alzare la luminosita'?");
                                hasNextInt = k.hasNextInt();
                                if (hasNextInt) {
                                    sceltaLuminosita = k.nextInt();
                                    if (sceltaLuminosita <= 0) {
                                        System.out.println("Scegli un numero maggiore di 0");
                                    } else {
                                        brighter = i.brighter(sceltaLuminosita);
                                    }
                                } else {
                                    k.next();
                                    System.out.println("Input non valido");
                                }
                            } while ((sceltaLuminosita <= 0) || (!brighter) || (!hasNextInt));
                        } else {
                            do {
                                System.out.println("Di quanto vuoi abbassare la luminosita'?");
                                hasNextInt = k.hasNextInt();
                                if (hasNextInt) {
                                    sceltaLuminosita = k.nextInt();
                                    if (sceltaLuminosita <= 0) {
                                        System.out.println("Scegli un numero maggiore di 0");
                                    } else {
                                        darker = i.darker(sceltaLuminosita);
                                    }
                                } else {
                                    k.next();
                                    System.out.println("Input non valido");
                                }
                            } while ((sceltaLuminosita <= 0) || (!darker) || (!hasNextInt));
                        }
                    }
                } else if (e[scelta].getClass() == RegistrazioneAudio.class) {
                    RegistrazioneAudio r = (RegistrazioneAudio) e[scelta];
                    r.play();
                    do {
                        System.out.println("Vuoi regolare il volume?");
                        System.out.println("1 - Si");
                        System.out.println("2 - No");
                        hasNextInt = k.hasNextInt();
                        if (hasNextInt) {
                            sceltaParametro = k.nextInt();
                            if ((sceltaParametro != 1) && (sceltaParametro != 2)) {
                                System.out.println("Inserisci 1 o 2");
                            }
                        } else {
                            k.next();
                            System.out.println("Input non valido");
                        }
                    } while (((sceltaParametro != 1) && (sceltaParametro != 2)) || (!hasNextInt));

                    if (sceltaParametro == 1) {
                        do {
                            System.out.println("Vuoi alzare o abbassare il volume?");
                            System.out.println("1 - Alzare");
                            System.out.println("2 - Abbassare");
                            hasNextInt = k.hasNextInt();
                            if (hasNextInt) {
                                sceltaVolume = k.nextInt();
                                if ((sceltaVolume != 1) && (sceltaVolume != 2)) {
                                    System.out.println("Inserisci 1 o 2");
                                }
                            } else {
                                k.next();
                                System.out.println("Input non valido");
                            }
                        } while (((sceltaVolume != 1) && (sceltaVolume != 2)) || (!hasNextInt));
                        if (sceltaVolume == 1) {
                            do {
                                System.out.println("Di quanto vuoi alzare il volume?");
                                hasNextInt = k.hasNextInt();
                                if (hasNextInt) {
                                    sceltaVolume = k.nextInt();
                                    if (sceltaVolume <= 0) {
                                        System.out.println("Scegli un numero maggiore di 0");
                                    } else {
                                        louder = r.louder(sceltaVolume);
                                    }
                                } else {
                                    k.next();
                                    System.out.println("Input non valido");
                                }
                            } while ((sceltaVolume <= 0) || (!louder) || (!hasNextInt));
                        } else {
                            do {
                                System.out.println("Di quanto vuoi abbassare il volume?");
                                hasNextInt = k.hasNextInt();
                                if (hasNextInt) {
                                    sceltaVolume = k.nextInt();
                                    if (sceltaVolume <= 0) {
                                        System.out.println("Scegli un numero maggiore di 0");
                                    } else {
                                        weaker = r.weaker(sceltaVolume);
                                    }
                                } else {
                                    k.next();
                                    System.out.println("Input non valido");
                                }
                            } while ((sceltaVolume <= 0) || (!weaker) || (!hasNextInt));
                        }
                    }
                } else {
                    Filmato f = (Filmato) e[scelta];
                    f.play();
                    do {
                        System.out.println("Vuoi regolare il volume?");
                        System.out.println("1 - Si");
                        System.out.println("2 - No");
                        hasNextInt = k.hasNextInt();
                        if (hasNextInt) {
                            sceltaParametro = k.nextInt();
                            if ((sceltaParametro != 1) && (sceltaParametro != 2)) {
                                System.out.println("Inserisci 1 o 2");
                            }
                        } else {
                            k.next();
                            System.out.println("Input non valido");
                        }
                    } while (((sceltaParametro != 1) && (sceltaParametro != 2)) || (!hasNextInt));

                    if (sceltaParametro == 1) {
                        do {
                            System.out.println("Vuoi alzare o abbassare il volume?");
                            System.out.println("1 - Alzare");
                            System.out.println("2 - Abbassare");
                            hasNextInt = k.hasNextInt();
                            if (hasNextInt) {
                                sceltaVolume = k.nextInt();
                                if ((sceltaVolume != 1) && (sceltaVolume != 2)) {
                                    System.out.println("Inserisci 1 o 2");
                                }
                            } else {
                                k.next();
                                System.out.println("Input non valido");
                            }
                        } while (((sceltaVolume != 1) && (sceltaVolume != 2)) || (!hasNextInt));
                        if (sceltaVolume == 1) {
                            do {
                                System.out.println("Di quanto vuoi alzare il volume?");
                                hasNextInt = k.hasNextInt();
                                if (hasNextInt) {
                                    sceltaVolume = k.nextInt();
                                    if (sceltaVolume <= 0) {
                                        System.out.println("Scegli un numero maggiore di 0");
                                    } else {
                                        louder = f.louder(sceltaVolume);
                                    }
                                } else {
                                    k.next();
                                    System.out.println("Input non valido");
                                }
                            } while ((sceltaVolume <= 0) || (!louder) || (!hasNextInt));
                        } else {
                            do {
                                System.out.println("Di quanto vuoi abbassare il volume?");
                                hasNextInt = k.hasNextInt();
                                if (hasNextInt) {
                                    sceltaVolume = k.nextInt();
                                    if (sceltaVolume <= 0) {
                                        System.out.println("Scegli un numero maggiore di 0");
                                    } else {
                                        weaker = f.weaker(sceltaVolume);
                                    }
                                } else {
                                    k.next();
                                    System.out.println("Input non valido");
                                }
                            } while ((sceltaVolume <= 0) || (!weaker) || (!hasNextInt));
                        }
                    }
                    do {
                        System.out.println("Vuoi regolare la luminosita'?");
                        System.out.println("1 - Si");
                        System.out.println("2 - No");
                        hasNextInt = k.hasNextInt();
                        if (hasNextInt) {
                            sceltaParametro = k.nextInt();
                            if ((sceltaParametro != 1) && (sceltaParametro != 2)) {
                                System.out.println("Inserisci 1 o 2");
                            }
                        } else {
                            k.next();
                            System.out.println("Input non valido");
                        }
                    } while (((sceltaParametro != 1) && (sceltaParametro != 2)) || (!hasNextInt));

                    if (sceltaParametro == 1) {
                        do {
                            System.out.println("Vuoi alzare o abbassare la luminosita'?");
                            System.out.println("1 - Alzare");
                            System.out.println("2 - Abbassare");
                            hasNextInt = k.hasNextInt();
                            if (hasNextInt) {
                                sceltaLuminosita = k.nextInt();
                                if ((sceltaLuminosita != 1) && (sceltaLuminosita != 2)) {
                                    System.out.println("Inserisci 1 o 2");
                                }
                            } else {
                                k.next();
                                System.out.println("Input non valido");
                            }
                        } while (((sceltaLuminosita != 1) && (sceltaLuminosita != 2)) || (!hasNextInt));
                        if (sceltaLuminosita == 1) {
                            do {
                                System.out.println("Di quanto vuoi alzare la luminosita'?");
                                hasNextInt = k.hasNextInt();
                                if (hasNextInt) {
                                    sceltaLuminosita = k.nextInt();
                                    if (sceltaLuminosita <= 0) {
                                        System.out.println("Scegli un numero maggiore di 0");
                                    } else {
                                        brighter = f.brighter(sceltaLuminosita);
                                    }
                                } else {
                                    k.next();
                                    System.out.println("Input non valido");
                                }
                            } while ((sceltaLuminosita <= 0) || (!brighter) || (!hasNextInt));
                        } else {
                            do {
                                System.out.println("Di quanto vuoi abbassare la luminosita'?");
                                hasNextInt = k.hasNextInt();
                                if (hasNextInt) {
                                    sceltaLuminosita = k.nextInt();
                                    if (sceltaLuminosita <= 0) {
                                        System.out.println("Scegli un numero maggiore di 0");
                                    } else {
                                        darker = f.darker(sceltaLuminosita);
                                    }
                                } else {
                                    k.next();
                                    System.out.println("Input non valido");
                                }
                            } while ((sceltaLuminosita <= 0) || (!darker) || (!hasNextInt));
                        }
                    }
                }
            }
        } while (sceltaIniziale != 0);
    }
}
