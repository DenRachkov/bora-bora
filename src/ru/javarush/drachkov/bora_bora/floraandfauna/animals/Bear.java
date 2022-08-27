package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Bear extends Predator{

    //public String emogi = "\uD83D\uDC3B";
    public double weight = 500;
    public int maxNumberOfAnimals = 5;
    public int movementSpeed = 2;
    public double saturation = 80;

    public Bear(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83D\uDC3B";
    }
}
