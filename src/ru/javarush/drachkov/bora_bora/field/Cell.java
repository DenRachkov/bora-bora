package ru.javarush.drachkov.bora_bora.field;

import ru.javarush.drachkov.bora_bora.floraandfauna.animals.*;

import java.util.ArrayList;

public class Cell {
    private static int x;
    private static int y;
    public static ArrayList<Animal> arr = new ArrayList<>();
    { arr.add(new Fox(x,y));
        arr.add(new Wolf(x,y));
        arr.add(new Duck(x,y));}



    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        //this.arr = arr;
        //completion( arr, x, y);
    }

   /* public static void completion(ArrayList<Animal>arr, int x, int y) {

        arr.add(new Fox(x,y));
        arr.add(new Wolf(x,y));
        arr.add(new Duck(x,y));


    }*/

    public static int getX() {
        return x;
    }
    public static void setX(int x) {
        Cell.x = x;
    }
    public static int getY() {
        return y;
    }
    public static void setY(int y) {
        Cell.y = y;
    }
    public static ArrayList<Animal> getArr() {
        return arr;
    }


}
