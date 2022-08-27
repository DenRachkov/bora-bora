package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Boa extends Predator{

    public static String emogi = "\uD83D\uDC10";
    public static double weight = 15;
    public static int maxNumberOfAnimals = 30;
    public static int movementSpeed = 1;
    public static double saturation = 3;

    public Boa(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public static void setEmogi(String emogi) {
        Boa.emogi = emogi;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Boa.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Boa.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Boa.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Boa.saturation = saturation;
    }
}
