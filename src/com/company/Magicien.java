package com.company;

import java.util.Scanner;

public class Magicien {

    //appelle la méthode flash
    //subit l'attaque du héros si waterflask
    //si pas waterflask : réattaque le héros

    public static void magicien(){

        Scanner sc = new Scanner(System.in);

        String water = "WaterFlask";

        HealthPoint health = new HealthPoint();
        WaterFlask waterFlask = new WaterFlask();
        Flash damageF = new Flash();

        System.out.println("I'm the magician "+"("+health.healthM+" pv"+")");
        System.out.println("Choose the WaterFlesk if you wan to beat him.");

        do {
            System.out.println(" ");
            System.out.println("Choose your weapon : ");
            System.out.println("Sword or WaterFlask");

            String input = sc.nextLine();

            if (input.contentEquals("WaterFlask")) {
                System.out.println("You've chosen " + water);
                health.healthM = health.healthM - waterFlask.waterFlask;
                System.out.println("You've hitten him : -"+waterFlask.waterFlask+" PV.");
                System.out.println(health.healthM + " PV left");
            } else {
                System.out.println("The magicien hits you.");
                health.healthH = health.healthH - damageF.damage;
            }

        } while (health.healthM != 0 && health.healthH != 0);


        }

    }


