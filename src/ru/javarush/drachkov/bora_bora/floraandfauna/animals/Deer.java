package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Deer extends Herbivore{

    //public String emogi = "\uD83E\uDD8C";
    public double weight = 300;
    public int maxNumberOfAnimals = 20;
    public int movementSpeed = 4;
    public double saturation = 50;

    public Deer(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83E\uDD8C";
    }
}
