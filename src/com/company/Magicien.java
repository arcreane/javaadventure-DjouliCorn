package com.company;

public class Magicien {

    //pop dans la room au hasard
    //appelle la méthode flash
    //subit l'attaque du héros si waterflask
    //si pas waterflask : réattaque le héros

    public static void magicien(){

        HealthPoint health = new HealthPoint();

        System.out.println("I'm the magician "+"("+health.healthM+" pv"+")");
        System.out.println("Choose the WaterFlesk if you wan to beat him.");
    }

}
