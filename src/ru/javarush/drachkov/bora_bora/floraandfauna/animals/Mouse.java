package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Mouse extends Herbivore{

    public static String emogi = "\uD83D\uDC01";
    public static double weight = 0.05;
    public static int maxNumberOfAnimals = 500;
    public static int movementSpeed = 1;
    public static double saturation = 0.01;

    public Mouse(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public static void setEmogi(String emogi) {
        Mouse.emogi = emogi;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Mouse.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Mouse.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Mouse.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Mouse.saturation = saturation;
    }
}
