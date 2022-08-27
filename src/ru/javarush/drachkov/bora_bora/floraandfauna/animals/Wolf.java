package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Wolf extends Predator{

    public static String emogi = "\uD83D\uDC3A";
    public static double weight = 50;
    public static int maxNumberOfAnimals = 30;
    public static int movementSpeed = 3;
    public static double saturation = 8;

    public Wolf(int x, int y) {
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
        Wolf.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Wolf.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Wolf.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Wolf.saturation = saturation;
    }
}
