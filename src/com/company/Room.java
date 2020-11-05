package com.company;
import java.util.Random;
import java.util.Scanner;

public class Room {

    public static void welcomeRoom(){

        Scanner sc = new Scanner(System.in);

        String sword = "Sword";
        String water = "WaterFlask";

        generateEnemyRandomly();

        System.out.println(" ");
        System.out.println("Choose your weapon : ");
        System.out.println("Sword or WaterFlask");

        String input = sc.nextLine();

        if (input.contentEquals("Sword")){
        System.out.println("You've chosen "+sword);
        }
        else if (input.contentEquals("WaterFlask")){
        System.out.println("You've chosen "+water);
        }
        else {
        System.out.println("The ennemie hits you.");
        }

    }

    public static void generateEnemyRandomly() {
        Random rd = new Random();
        int callEnemy = rd.nextInt(100);

        if (callEnemy < 50) {
            Magicien.magicien();
        }
        else Barbare.barbare();
    }
}



    //array de 5 rooms
    //appelle soit la méthode magicien, soit barbare en random
    //appelle la méthode héros
    //attaque sur le héros




