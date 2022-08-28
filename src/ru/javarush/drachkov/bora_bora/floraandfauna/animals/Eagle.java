package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Eagle extends Predator{

    public String emogi = "\uD83E\uDD85";
    public double weight = 6;
    public int maxNumberOfAnimals = 20;
    public int movementSpeed = 3;
    public double saturation = 1;

    public Eagle(int x, int y) {
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
