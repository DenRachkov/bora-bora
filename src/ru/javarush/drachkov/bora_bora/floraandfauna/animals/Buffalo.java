package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Buffalo extends Herbivore{

    public static String emogi = "\uD83D\uDC03";
    public static double weight = 700;
    public static int maxNumberOfAnimals = 10;
    public static int movementSpeed = 3;
    public static double saturation = 100;

    public Buffalo(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public static void setEmogi(String emogi) {
        Buffalo.emogi = emogi;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Buffalo.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Buffalo.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Buffalo.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Buffalo.saturation = saturation;
    }
}
