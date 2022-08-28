package ru.javarush.drachkov.bora_bora.field;


import static java.lang.System.*;

public class Field {
    private static int x;
    private static int y;


    public static void getField() {


        Cell[][] grid = new Cell[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grid[i][j] = new Cell(i, j);

                grid[i][j].getArr().forEach(animal -> out.print( "[" + animal.getEmogi() + "]" ));
                out.println(grid[i][j].getArr().size());
            }
            out.println();
        }
    }

    public static int creatingQuantity(int maxNumberOfAnimals) {
        return RandomNumber.get(maxNumberOfAnimals);
    }
}