package com.company;

import java.util.Random;

public class generateRandomly {

    public static void generateEnemyRandomly() {

        //choisis un ennemi au hasard, soit le magicien, soit le barbare

        Random rd = new Random();
        int callEnemy = rd.nextInt(10);

        if (callEnemy < 5) {
            Magicien.magicien();
        }
        else {
            Barbare.barbare();

        }
    }
}
