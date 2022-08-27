package ru.javarush.drachkov.bora_bora.floraandfauna.plants;

import ru.javarush.drachkov.bora_bora.floraandfauna.animals.BasicItem;

public class Plant extends BasicItem {
    private static int x;
    private static int y;

    public static double weight = 1;
    public static int maxNumberOfAnimals = 200;

    public Plant(int x, int y) {
        super(x, y);
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Plant.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Plant.y = y;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Plant.weight = weight;
    }

    public static int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        Plant.maxNumberOfAnimals = maxNumberOfAnimals;
    }
}
