import java.util.Random;

public class TestQuestion {
    public static void main(String[] args) {
        Question[] quesiti = new Question[5];

        quesiti[0] = new Question("Cos'e' l'ereditarieta'?",
                "L’ereditarieta' permette di far derivare nuove classi da classi gia' esistenti", 5);

        quesiti[1] = new QuestionYesNo("E' necessario aggiungere nuove classi per modificare quelle gia' presenti?",
                "No", 5);

        quesiti[2] = new NumericQuestion("Quanto fa 2 + 2?", "4", 5);

        String[] opzioni = { "implements", "extends", "abstract" };
        String[] opzioniCorrette = { "extends" };
        quesiti[3] = new MultipleQuestion("Cosa si utilizza per definire una sotto classe?", "", 5, opzioni,
                opzioniCorrette);

        quesiti[4] = new Question("Cosa succede se la super classe non ha alcun costruttore?",
                "Se la superclasse non ha alcun costruttore, la JVM da' errore di compilazione", 5);

        Random r = new Random();
        int punteggio = 0;
        int[] numeriRandom = new int[3];
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                numeriRandom[i] = r.nextInt(5);
            } else if (i == 1) {
                do {
                    numeriRandom[i] = r.nextInt(5);
                } while (numeriRandom[i - 1] == numeriRandom[i]);
            } else {
                do {
                    numeriRandom[i] = r.nextInt(5);
                } while ((numeriRandom[i - 1] == numeriRandom[i]) || (numeriRandom[i - 2] == numeriRandom[i]));
            }
            punteggio += quesiti[numeriRandom[i]].ask();
            System.out.println();
        }

        System.out.println("Punteggio: " + punteggio);
    }
}