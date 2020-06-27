package game;

import java.util.Arrays;

public class Poziom1 {

    public Poziom1() {
        int[][] tab = new int[5][5];

        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab.length; j++)
               tab[i][j] = (int) (Math.random() * 5);

        int j = 0;
        int i = 0;
        System.out.print(tab[i][j]);

    }


}
