package com.company;
import java.util.Scanner;

public class Magicien {

    public static void magicien(){

        Scanner sc = new Scanner(System.in);
        Hero health = new Hero();
        int healthM = 20;
        WaterFlask waterFlask = new WaterFlask();

        //Introduction de l'ennemi et ce dernier attaque d'emblée le héros

        System.out.println("It's a magician "+"("+healthM+" pv"+")");
        System.out.println("He attacks you");
        health.healthH = health.healthH - FlashDamage();
        System.out.println(health.healthH + " PV left");
        System.out.println("Choose the WaterFlesk if you want to beat him.");

        //Combat au tour par tour
        do {
            System.out.println(" ");
            System.out.println("Choose your weapon : ");
            System.out.println("Sword or WaterFlask");

            String input = sc.nextLine();

            //si l'utilisateur rentre la bonne entrée
            if (input.contentEquals("WaterFlask")) {
                System.out.println("You've chosen WaterFlask.");
                healthM = healthM - waterFlask.waterFlask;
                System.out.println("You've hitten him : -"+waterFlask.waterFlask+" PV.");
                System.out.println(healthM + " PV left");

            } else {

                //si l'utilisateur rentre la mauvaise entrée
                System.out.println("The magicien hits you.");
               health.healthH = health.healthH - FlashDamage();
                System.out.println(health.healthH + " PV left");
            }

            if (healthM == 0){
                generateRandomly.generateEnemyRandomly();
            }
            else if(health.healthH == 0){
                System.out.println("You loose ! Sorry, it's the end of the adventure for you.");
            }

        } while (healthM != 0 && health.healthH != 0);


    }

    //point de dommage que cause le magicien au héros
    private static int FlashDamage() {
        return 20;
    }

}


