package ru.javarush.drachkov.bora_bora.field;

import ru.javarush.drachkov.bora_bora.floraandfauna.animals.*;

import java.util.ArrayList;


public class Field {
    public static void getField() {

        ArrayList<BasicItem> arr = new ArrayList<>();
        arr.add(new Fox());
        arr.add(new Wolf());
        arr.add(new Animals());

        Field[][] grid = new Field[5][5];

        grid[1][2] = new Field();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(" " + grid[i][j] + " ");
            }
            System.out.println();
        }







    }
}