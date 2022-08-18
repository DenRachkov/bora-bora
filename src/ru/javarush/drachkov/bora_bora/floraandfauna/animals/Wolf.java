package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Wolf extends Predator{
    @Override
    public void toEat() {
        super.toEat();
        System.out.println("ест фигню");
    }

}
