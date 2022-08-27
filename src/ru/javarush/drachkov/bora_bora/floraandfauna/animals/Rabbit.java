package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Rabbit extends Herbivore{

    public static String emogi = "\uD83D\uDC07";
    public static double weight = 2;
    public static int maxNumberOfAnimals = 150;
    public static int movementSpeed = 2;
    public static double saturation = 0.45;

    public Rabbit(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public static void setEmogi(String emogi) {
        Rabbit.emogi = emogi;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Rabbit.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Rabbit.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Rabbit.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Rabbit.saturation = saturation;
    }
}
