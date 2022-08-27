package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Boa extends Predator{

    //public String emogi = "\uD83D\uDC10";
    public double weight = 15;
    public int maxNumberOfAnimals = 30;
    public int movementSpeed = 1;
    public double saturation = 3;

    public Boa(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83D\uDC10";
    }
}
