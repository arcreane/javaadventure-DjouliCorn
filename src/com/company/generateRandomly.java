package com.company;

import java.util.Random;

public class generateRandomly {

    public static void generateEnemyRandomly() {

        Random rd = new Random();
        int callEnemy = rd.nextInt(100);

        if (callEnemy < 50) {
            Magicien.magicien();
        }
        else {
            Barbare.barbare();

        }
    }
}
