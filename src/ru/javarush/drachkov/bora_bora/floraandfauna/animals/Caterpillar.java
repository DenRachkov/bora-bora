package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Caterpillar extends Herbivore{

    public static String emogi = "\uD83D\uDC1B";
    public static Double weight;
    public static int maxNumberOfAnimals;
    public static int movementSpeed;
    public static Double saturation;

    public Caterpillar(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public static void setEmogi(String emogi) {
        Caterpillar.emogi = emogi;
    }

    public static Double getWeight() {
        return weight;
    }

    public static void setWeight(Double weight) {
        Caterpillar.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Caterpillar.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Caterpillar.movementSpeed = movementSpeed;
    }

    public static Double getSaturation() {
        return saturation;
    }

    public static void setSaturation(Double saturation) {
        Caterpillar.saturation = saturation;
    }
}
