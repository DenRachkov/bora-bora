package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Goat extends Herbivore{

    public static String emogi = "\uD83D\uDC10";
    public static double weight = 60;
    public static int maxNumberOfAnimals = 140;
    public static int movementSpeed = 3;
    public static double saturation = 10;

    public Goat(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public static void setEmogi(String emogi) {
        Goat.emogi = emogi;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Goat.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Goat.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Goat.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Goat.saturation = saturation;
    }
}
