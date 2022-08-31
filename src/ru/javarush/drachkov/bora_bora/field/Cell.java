package ru.javarush.drachkov.bora_bora.field;

import ru.javarush.drachkov.bora_bora.floraandfauna.animals.*;
import ru.javarush.drachkov.bora_bora.floraandfauna.plants.Plant;

import java.util.ArrayList;


public class Cell {
    private int x;
    private int y;
    public ArrayList<BasicItem> arr = new ArrayList<>();


    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        completion(arr, x, y);
    }
//TODO: уменьшить код!!!
    public void completion(ArrayList<BasicItem> arr, int x, int y) {

        for (int i = 1; i <= Field.creatingQuantity(new Fox(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Fox(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Mouse(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Mouse(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Duck(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Duck(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Horse(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Horse(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Bear(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Bear(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Boa(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Boa(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Buffalo(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Buffalo(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Caterpillar(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Caterpillar(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Deer(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Deer(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Eagle(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Eagle(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Goat(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Goat(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Hog(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Hog(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Rabbit(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Rabbit(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Sheep(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Sheep(x, y));
        }
        for (int i = 1; i <= Field.creatingQuantity(new Wolf(x, y).maxNumberOfAnimals); i++) {
            arr.add(new Wolf(x, y));
        }for (int i = 1; i <= Field.creatingQuantity(new Plant(x,y).maxNumberOfAnimals); i++) {
            arr.add(new Plant(x, y));
        }
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<BasicItem> getArr() {
        return arr;
    }


}
