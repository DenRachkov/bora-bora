package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

import java.util.function.Consumer;

public abstract class Animal extends BasicItem {
    public int movementSpeed;
    public double saturation;


    public Animal(int x, int y) {
        super(x, y);
    }



    public void toEat() {

    }

    public void toMultiply() {

    }

    public void directionOfMovement() {

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
