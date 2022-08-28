package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Caterpillar extends Herbivore{

    public String emogi = "\uD83D\uDC1B";
    public double weight = 0.01;
    public int maxNumberOfAnimals = 1000;
    public int movementSpeed = 0;
    public double saturation = 0;

    public Caterpillar(int x, int y) {
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

    public void setWeight(Double weight) {
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

    public void setSaturation(Double saturation) {
        this.saturation = saturation;
    }
}
