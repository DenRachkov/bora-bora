package ru.javarush.drachkov.bora_bora.floraandfauna.animals;


public abstract class Animal extends BasicItem {
    public Animal(int x, int y) {
        super(x, y);
    }

    public void toEat() {

    }

    public void toMultiply() {

    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public double getSaturation() {
        return saturation;
    }

    public void setSaturation(double saturation) {
        this.saturation = saturation;
    }
}

