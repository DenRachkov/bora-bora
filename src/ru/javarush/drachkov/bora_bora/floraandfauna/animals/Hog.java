package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Hog extends Herbivore{

    public static String emogi = "\uD83D\uDC17";
    public static double weight = 400;
    public static int maxNumberOfAnimals = 50;
    public static int movementSpeed = 2;
    public static double saturation = 50;

    public Hog(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public void setEmogi(String emogi) {
        this.emogi = emogi;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Hog.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Hog.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Hog.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Hog.saturation = saturation;
    }
}
