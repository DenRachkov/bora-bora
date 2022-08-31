package ru.javarush.drachkov.bora_bora.field;


import static java.lang.System.out;

public class Field {
    public static final int WIDTH = 3;
    public static final int HEIGHT = 3;
    public static final Cell[][] GRID = new Cell[WIDTH][HEIGHT];
    private int x;
    private int y;


    public static void getField() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                GRID[i][j] = new Cell(i, j);

                GRID[i][j].getArr().forEach(animal -> out.print("[" + animal.getEmogi() + "]"));
                out.println(GRID[i][j].getArr().size());

            }
        }
    }


    public static int creatingQuantity(int maxNumberOfAnimals) {
        return RandomNumber.get(maxNumberOfAnimals);
    }


}