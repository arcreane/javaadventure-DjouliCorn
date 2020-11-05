package com.company;

import java.util.Scanner;

public class Magicien {

    boolean isMagicien = true;

    //pop dans la room au hasard
    //appelle la méthode flash
    //subit l'attaque du héros si waterflask
    //si pas waterflask : réattaque le héros

    public static void magicien(){

        Scanner sc = new Scanner(System.in);

        String sword = "Sword";
        String water = "WaterFlask";

        HealthPoint health = new HealthPoint();
        WaterFlask waterFlask = new WaterFlask();

        System.out.println("I'm the magician "+"("+health.healthM+" pv"+")");
        System.out.println("Choose the WaterFlesk if you wan to beat him.");

        System.out.println(" ");
        System.out.println("Choose your weapon : ");
        System.out.println("Sword or WaterFlask");

        String input = sc.nextLine();

        if (input.contentEquals("Sword")){
            System.out.println("The ennemie hits you.");
        }
        else if (input.contentEquals("WaterFlask")){
            System.out.println("You've chosen "+water);
            health.healthM = health.healthM - waterFlask.waterFlask;
            System.out.println("You've hitten him.");
            System.out.println(health.healthM+" PV left");

        }
        else {
            System.out.println("The ennemie hits you.");
        }
    }

}
