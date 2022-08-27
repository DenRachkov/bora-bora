package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Goat extends Herbivore{

   // public String emogi = "\uD83D\uDC10";
    public double weight = 60;
    public int maxNumberOfAnimals = 140;
    public int movementSpeed = 3;
    public double saturation = 10;

    public Goat(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83D\uDC10";
    }
}
