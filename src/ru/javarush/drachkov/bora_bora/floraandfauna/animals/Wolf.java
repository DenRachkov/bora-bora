package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Wolf extends Predator{


    public  String emogi = "\uD83D\uDC3A";
    public double weight = 50;
    public int maxNumberOfAnimals = 30;
    public int movementSpeed = 3;
    public double saturation = 8;

    public Wolf(int x, int y) {
        super(x, y);
    }


    @Override
    public String getEmogi() {
        return "\uD83D\uDC3A";
    }
}
