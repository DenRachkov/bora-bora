package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Bear extends Predator{

    public static String emogi = "\uD83D\uDC3B";
    public static double weight = 500;
    public static int maxNumberOfAnimals = 5;
    public static int movementSpeed = 2;
    public static double saturation = 80;

    public Bear(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public static void setEmogi(String emogi) {
        Bear.emogi = emogi;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Bear.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Bear.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Bear.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Bear.saturation = saturation;
    }
}
