package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Deer extends Herbivore{

    public static String emogi = "\uD83E\uDD8C";
    public static double weight = 300;
    public static int maxNumberOfAnimals = 20;
    public static int movementSpeed = 4;
    public static double saturation = 50;

    public Deer(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public static void setEmogi(String emogi) {
        Deer.emogi = emogi;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Deer.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Deer.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Deer.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Deer.saturation = saturation;
    }
}
