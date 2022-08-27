package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Rabbit extends Herbivore{

    //public String emogi = "\uD83D\uDC07";
    public double weight = 2;
    public int maxNumberOfAnimals = 150;
    public int movementSpeed = 2;
    public double saturation = 0.45;

    public Rabbit(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83D\uDC07";
    }
}
