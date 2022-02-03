package zadania.zadaniedomowe;

import java.util.concurrent.ThreadLocalRandom;

public class Odleglosc {
    public static void main(String[] args) {

        int rozmiar = Integer.parseInt(args[0]);
        int[] tablica = new int[rozmiar];
        int min = Integer.MAX_VALUE;
        int para = 0;

        for (int i = 0; i < tablica.length; i++)
            tablica[i] = ThreadLocalRandom.current().nextInt(1, 10 + 1);

        for (int i = 0; i < tablica.length; i++)
            System.out.println((i + 1) + " : " + tablica[i]);

        for (int i = 0; i < tablica.length - 1; i++) {
            int roznica = Math.abs(tablica[i] - tablica[i + 1]);
            if (roznica < min) {
                min = roznica;
                para = i;
            }
        }

        System.out.println("Najmniejsza różnica to: " + min);
        System.out.println(tablica[para] + " i " + tablica[para + 1]);
    }
}
