package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Sheep extends Herbivore{

    public static String emogi = "\uD83D\uDC11";
    public static double weight = 70;
    public static int maxNumberOfAnimals = 140;
    public static int movementSpeed = 3;
    public static double saturation = 15;

    public Sheep(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public static void setEmogi(String emogi) {
        Sheep.emogi = emogi;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Sheep.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Sheep.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Sheep.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Sheep.saturation = saturation;
    }
}
