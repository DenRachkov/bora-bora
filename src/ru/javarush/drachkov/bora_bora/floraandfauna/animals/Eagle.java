package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Eagle extends Predator{

    //public String emogi = "\uD83E\uDD85";
    public double weight = 6;
    public int maxNumberOfAnimals = 20;
    public int movementSpeed = 3;
    public double saturation = 1;

    public Eagle(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "\uD83E\uDD85";
    }
}
