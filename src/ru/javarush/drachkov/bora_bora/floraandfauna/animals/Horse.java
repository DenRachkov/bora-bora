package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Horse extends Herbivore{

    //public String emogi = "\uD83D\uDC0E";
    public double weight = 400;
    public int maxNumberOfAnimals = 20;
    public int movementSpeed = 4;
    public double saturation = 60;

    public Horse(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83D\uDC0E";
    }
}
