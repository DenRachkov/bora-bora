package ru.javarush.drachkov.bora_bora.floraandfauna.plants;

import ru.javarush.drachkov.bora_bora.floraandfauna.animals.BasicItem;

public class Plant extends BasicItem {
    private static int x;
    private static int y;
    public String emogi = "\uD83C\uDF3F";
    public double weight = 1;
    public int maxNumberOfAnimals = 200;

    @Override
    public String getEmogi() {
        return emogi;
    }

    @Override
    public void setEmogi(String emogi) {
        this.emogi = emogi;
    }

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

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        this.maxNumberOfAnimals = maxNumberOfAnimals;
    }
}
