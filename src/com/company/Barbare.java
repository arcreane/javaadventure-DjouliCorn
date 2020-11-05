package com.company;

import java.util.Scanner;

public class Barbare {

    //pop dans la room au hasard
    //appelle la méthode axe
    //subis l'attaque de la sword
    //réattaque si héros n'utilise pas la sword


    public static void barbare(){

        Scanner sc = new Scanner(System.in);
        Hero health = new Hero();
        int healthB = 20;
        var chance = Math.random();

        Sword weapon = new Sword();

        System.out.println("It's a barbarian "+"("+healthB+" pv"+")");
        System.out.println("He attacks you");
        health.healthH = health.healthH - AxeDamage();
        System.out.println(health.healthH + " PV left");
        System.out.println("Choose the sword if you wan to beat him.");

        //Combat au tour par tour

        do {
            System.out.println(" ");
            System.out.println("Choose your weapon : ");
            System.out.println("Sword or WaterFlask");

            String input = sc.nextLine();

            if (input.contentEquals("Sword")) {
                System.out.println("You've chosen Sword.");
                healthB = healthB - weapon.sword;
                System.out.println("You've hitten him : -"+weapon.sword+" PV.");
                System.out.println(healthB + " PV left");

            } else {

                //30% de chance de faire un coup critique

                if (chance < 0.7){
                    System.out.println("This is critical !");
                    health.healthH = health.healthH - AxeDamage()*2;
                }
                else {
                    System.out.println("The barbarian hits you.");
                    health.healthH = health.healthH - AxeDamage();
                }
                System.out.println(health.healthH + " PV left");

            }

            //retourne à la classe qui génère le combat aléatoirement
            if (healthB == 0){
                System.out.println("You win ! Go to the next room");
                generateRandomly.generateEnemyRandomly();
            }
            else if(health.healthH == 0){
                System.out.println("You loose ! Sorry, it's the end of the adventure for you.");
            }


        } while (healthB != 0 && health.healthH != 0);


    }

    //point de dommage que cause le barbare au héros

    private static int AxeDamage() {
        return 20;
    }

}

