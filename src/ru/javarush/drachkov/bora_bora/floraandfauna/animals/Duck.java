package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Duck extends Herbivore{


    //public String emogi = "🦆" ;
    public double weight = 1;
    public int maxNumberOfAnimals = 1000;
    public int movementSpeed = 0;
    public double saturation = 0;

    public Duck(int x, int y) {
        super(x, y);
    }

    @Override
    public String getEmogi() {
        return "🦆";
    }
}
