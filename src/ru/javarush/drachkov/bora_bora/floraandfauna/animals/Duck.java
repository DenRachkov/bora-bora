package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Duck extends Herbivore{


    public static String emogi = "🦆" ;
    public static double weight = 1;
    public static int maxNumberOfAnimals = 1000;
    public static int movementSpeed = 0;
    public static double saturation = 0;

    public Duck(int x, int y) {
        super(x, y);
    }

    public static String getEmogi() {
        return emogi;
    }

    public static void setEmogi(String emogi) {
        Duck.emogi = emogi;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Duck.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Duck.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static int getMovementSpeed() {
        return movementSpeed;
    }

    public static void setMovementSpeed(int movementSpeed) {
        Duck.movementSpeed = movementSpeed;
    }

    public static double getSaturation() {
        return saturation;
    }

    public static void setSaturation(double saturation) {
        Duck.saturation = saturation;
    }
}
