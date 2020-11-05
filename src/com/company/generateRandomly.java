package com.company;

import java.util.Random;

public class generateRandomly {

    public static void generateEnemyRandomly() {

        //choisis un ennemi au hasard, soit le magicien, soit le barbare

        Random rd = new Random();


            int callEnemy = rd.nextInt(10);

            //System.out.println(callEnemy);

            if (callEnemy < 7) {
                Magicien.magicien();
            }
            else {
                Barbare.barbare();
            }

            System.out.println("You win ! Go to the next room");

    }
}
