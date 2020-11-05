package com.company;

import java.util.Scanner;

public class Magicien {

    //si pas waterflask : réattaque le héros
    public static void magicien(){

        Scanner sc = new Scanner(System.in);

        // appelle les variables health, waterflask et damage dans des classes différentes
        HealthPoint health = new HealthPoint();
        WaterFlask waterFlask = new WaterFlask();
        Flash damageF = new Flash();

        System.out.println("I'm the magician "+"("+health.healthM+" pv"+")");
        System.out.println("Choose the WaterFlesk if you wan to beat him.");

        //Combat au tour par tour

        do {
            System.out.println(" ");
            System.out.println("Choose your weapon : ");
            System.out.println("Sword or WaterFlask");

            String input = sc.nextLine();

            if (input.contentEquals("WaterFlask")) {
                System.out.println("You've chosen WaterFlask.");
                health.healthM = health.healthM - waterFlask.waterFlask;
                System.out.println("You've hitten him : -"+waterFlask.waterFlask+" PV.");
                System.out.println(health.healthM + " PV left");
            } else {
                System.out.println("The magicien hits you.");
                health.healthH = health.healthH - damageF.damage;
                System.out.println(health.healthH + " PV left");
            }

            if (health.healthM == 0){
                System.out.println("You win ! Go to the next room");
            }
            else if(health.healthH == 0){
                System.out.println("You loose ! Sorry, it's the end of the adventure for you.");
            }

        } while (health.healthM != 0 && health.healthH != 0);

    }

}


