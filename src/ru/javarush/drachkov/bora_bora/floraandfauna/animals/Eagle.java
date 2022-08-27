package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Eagle extends Predator{

    public static String emogi = "\uD83E\uDD85";
    public static double weight = 6;
    public static int maxNumberOfAnimals = 20;
    public static int movementSpeed = 3;
    public static double saturation = 1;

    public Eagle(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public static void setEmogi(String emogi) {
        Eagle.emogi = emogi;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Eagle.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Eagle.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Eagle.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Eagle.saturation = saturation;
    }
}
