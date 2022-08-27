package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Hog extends Herbivore {

   // public String emogi = "\uD83D\uDC17";
    public double weight = 400;
    public int maxNumberOfAnimals = 50;
    public int movementSpeed = 2;
    public double saturation = 50;

    public Hog(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83D\uDC17";
    }
}
