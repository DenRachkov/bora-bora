package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Sheep extends Herbivore{

   // public String emogi = "\uD83D\uDC11";
    public double weight = 70;
    public int maxNumberOfAnimals = 140;
    public int movementSpeed = 3;
    public double saturation = 15;

    public Sheep(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83D\uDC11";
    }
}
