package ru.javarush.drachkov.bora_bora.floraandfauna.animals;



public class BasicItem {
    private static int x;
    private static int y;

    public String emogi;
    public double weight;
    public int maxNumberOfAnimals;



    public static int getX() {
        return x;
    }

    public int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        this.maxNumberOfAnimals = maxNumberOfAnimals;
    }

    public static void setX(int x) {
        BasicItem.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        BasicItem.y = y;
    }

    public String getEmogi() {
        return emogi;
    }

    public void setEmogi(String emogi) {
        this.emogi = emogi;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BasicItem(int x, int y) {
        this.x = x;
        this.y = y;
    }




}