package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

import ru.javarush.drachkov.bora_bora.field.Field;
import ru.javarush.drachkov.bora_bora.field.RandomNumber;

import java.util.ArrayList;


public class BasicItem {
    private int x;
    private int y;

    public String emogi;
    public double weight;
    public int maxNumberOfAnimals;
    public int movementSpeed;
    public double saturation;

    //TODO: доделать метод + проверки!!!
    private void moving(int x, int y) {
        ArrayList<String> step = new ArrayList<>();
        if (getX() > 0) {
            step.add("Left");
        }
        if (getX() < Field.WIDTH) {
            step.add("Right");
        }
        if (getY() > 0) {
            step.add("Up");
        }
        if (getY() < Field.HEIGHT) {
            step.add("Down");
        }
        int random = RandomNumber.get(step.size());
        String side = step.get(random);
        switch (side) {
            case "Left" -> x = newX(x, -1);
            case "Right" -> x = newX(x, 1);
            case "Up" -> y = newY(y, -1);
            case "Down" -> y = newY(y, 1);
        }


    }

    private int newX(int x, int i) {
        return x + this.movementSpeed * i;
    }

    private int newY(int y, int i) {
        return y + this.movementSpeed * i;
    }


    public int getMovementSpeed() {
        return movementSpeed;
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

    public int getMaxNumberOfAnimals() {
        return maxNumberOfAnimals;
    }

    public void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
        this.maxNumberOfAnimals = maxNumberOfAnimals;
    }


    public String getEmogi() {
        return emogi;
    }

    public void setEmogi(String emogi) {
        this.emogi = emogi;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BasicItem(int x, int y) {
        this.x = x;
        this.y = y;
    }


}