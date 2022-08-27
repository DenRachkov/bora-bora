package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Caterpillar extends Herbivore{

    //public String emogi = "\uD83D\uDC1B";
    public Double weight;
    public int maxNumberOfAnimals;
    public int movementSpeed;
    public Double saturation;

    public Caterpillar(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83D\uDC1B";
    }
}
