package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Buffalo extends Herbivore{

   // public String emogi = "\uD83D\uDC03";
    public double weight = 700;
    public int maxNumberOfAnimals = 10;
    public int movementSpeed = 3;
    public double saturation = 100;

    public Buffalo(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83D\uDC03";
    }
}
