package com.company;

public class Barbare {

    //pop dans la room au hasard
    //appelle la méthode axe
    //subis l'attaque de la sword
    //réattaque si héros n'utilise pas la sword

    public static void barbare(){

        HealthPoint health = new HealthPoint();

        System.out.println("I'm the barbarian "+"("+health.healthB+" pv)");
        System.out.println("Choose the sword if you want to beat him.");

    }

}
