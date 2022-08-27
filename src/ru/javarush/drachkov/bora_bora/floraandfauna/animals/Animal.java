package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

import java.util.function.Consumer;

public class Animal extends BasicItem{

    public static String emogi;
    public static double weight;
    public static int maxNumberOfAnimals;
    public static int movementSpeed;
    public static double saturation;

    public Animal(int x, int y) {
        super(x, y);
    }




    public void toEat(){

    }
    public void toMultiply() {

    }
    public void directionOfMovement () {

    }

    public static String getEmogi() {
        return emogi;
    }
}
