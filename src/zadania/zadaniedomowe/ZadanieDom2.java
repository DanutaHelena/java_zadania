package zadania.zadaniedomowe;

import java.util.concurrent.ThreadLocalRandom;

public class ZadanieDom2 {
       public static void main(String[] args) {
            int rozmiar = Integer.parseInt(args[0]);

            int[] tablica = new int[rozmiar];
            int sumaParzyste = 0;


            for (int i = 0; i < tablica.length; i++)
                tablica[i] = ThreadLocalRandom.current().nextInt(1, 20 + 1);

           for (int i = 0; i < tablica.length; i++)
               System.out.println((i + 1) + " : " + tablica[i]);

            for(int i = 0; i < 20; i++){
                if(sumaParzyste % 2 == 0)
                    System.out.println(sumaParzyste);
                sumaParzyste += tablica[i];
            }
            System.out.println("suma liczb parzystych to:" + sumaParzyste);
                }
            }

