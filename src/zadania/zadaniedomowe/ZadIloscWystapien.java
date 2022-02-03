package zadania.zadaniedomowe;

import java.util.concurrent.ThreadLocalRandom;

public class ZadIloscWystapien {
    public static void main(String[] args) {
        int rozmiar = Integer.parseInt(args[0]);

        int[] tablica = new int[rozmiar];
        int licznik = 0;

        for (int i = 0; i < tablica.length; i++)
            tablica[i] = ThreadLocalRandom.current().nextInt(1, 10 + 1);


        for (int i = 0; i < tablica.length; i++)
            System.out.println((i + 1) + " : " + tablica[i]);

        for (licznik = 0; licznik < tablica.length; licznik++) {

        }
        for (int i = 0; i <= tablica.length; i++) {
            licznik++;

            System.out.println((i + 1) + " : " + tablica[licznik]);


        }
    }
}
