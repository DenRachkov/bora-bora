package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Rabbit extends Herbivore{

    public String emogi = "\uD83D\uDC07";
    public double weight = 2;
    public int maxNumberOfAnimals = 150;
    public int movementSpeed = 2;
    public double saturation = 0.45;

    public Rabbit(int x, int y) {
        super(x, y);
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

    @Override
    public String getEmogi() {
        return emogi;

    }
}
