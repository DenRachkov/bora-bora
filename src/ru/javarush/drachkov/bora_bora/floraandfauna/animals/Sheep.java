package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Sheep extends Herbivore{

    public String emogi = "\uD83D\uDC11";
    public double weight = 70;
    public int maxNumberOfAnimals = 140;
    public int movementSpeed = 3;
    public double saturation = 15;

    public Sheep(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return emogi;
    }

    @Override
    public void setEmogi(String emogi) {
        this.emogi = emogi;
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

    @Override
    public int getMovementSpeed() {
        return movementSpeed;
    }

    @Override
    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    @Override
    public double getSaturation() {
        return saturation;
    }

    @Override
    public void setSaturation(double saturation) {
        this.saturation = saturation;
    }
}
