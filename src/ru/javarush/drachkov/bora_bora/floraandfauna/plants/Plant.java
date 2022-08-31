package ru.javarush.drachkov.bora_bora.floraandfauna.plants;

import ru.javarush.drachkov.bora_bora.floraandfauna.animals.BasicItem;

public class Plant extends BasicItem {
    private int x;
    private int y;
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

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    @Override
    public void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        this.maxNumberOfAnimals = maxNumberOfAnimals;
    }
}
