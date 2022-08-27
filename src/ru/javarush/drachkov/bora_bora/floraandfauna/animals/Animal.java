package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

import java.util.function.Consumer;

public abstract class Animal extends BasicItem{

    public  String emogi;
    public double weight;
    public int maxNumberOfAnimals;
    public int movementSpeed;
    public double saturation;


    public Animal(int x, int y) {
        super(x, y);
    }




    public void toEat(){

    }
    public void toMultiply() {

    }
    public void directionOfMovement () {

    }

    public  String getEmogi() {
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

    public int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        this.maxNumberOfAnimals = maxNumberOfAnimals;
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
