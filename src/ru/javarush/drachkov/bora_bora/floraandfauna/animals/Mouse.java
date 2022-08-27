package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Mouse extends Herbivore{

    //public String emogi = "\uD83D\uDC01";
    public double weight = 0.05;
    public int maxNumberOfAnimals = 500;
    public int movementSpeed = 1;
    public double saturation = 0.01;

    public Mouse(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83D\uDC01";
    }
}
