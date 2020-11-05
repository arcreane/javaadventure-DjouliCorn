package com.company;

import java.util.Scanner;

public class Barbare {

    //pop dans la room au hasard
    //appelle la méthode axe
    //subis l'attaque de la sword
    //réattaque si héros n'utilise pas la sword

    public static void barbare(){

        Scanner sc = new Scanner(System.in);

        // appelle les variables health, waterflask et damage dans des classes différentes
        HealthPoint health = new HealthPoint();
        Sword weapon = new Sword();
        Flash damageF = new Flash();

        System.out.println("I'm the barbarian "+"("+health.healthM+" pv"+")");
        System.out.println("Choose the sword if you wan to beat him.");

        //Combat au tour par tour

        do {
            System.out.println(" ");
            System.out.println("Choose your weapon : ");
            System.out.println("Sword or WaterFlask");

            String input = sc.nextLine();

            if (input.contentEquals("Sword")) {
                System.out.println("You've chosen Sword.");
                health.healthB = health.healthB - weapon.sword;
                System.out.println("You've hitten him : -"+weapon.sword+" PV.");
                System.out.println(health.healthB + " PV left");
            } else {
                System.out.println("The barbarian hits you.");
                health.healthH = health.healthH - damageF.damage;
                System.out.println(health.healthH + " PV left");
            }

            if (health.healthB == 0){
                System.out.println("You win ! Go to the next room");
            }
            else if(health.healthH == 0){
                System.out.println("You loose ! Sorry, it's the end of the adventure for you.");
            }

        } while (health.healthB != 0 && health.healthH != 0);


    }

}
