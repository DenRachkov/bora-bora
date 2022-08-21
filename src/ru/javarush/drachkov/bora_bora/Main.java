package ru.javarush.drachkov.bora_bora;


import ru.javarush.drachkov.bora_bora.field.Field;



public class Main {

    public static void main(String[] args) {

        Field[][] grid = new Field[5][5];

        grid[2][3] = new Field();
        grid[1][1] = new Field();


    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {

            System.out.print(" " + grid[i][j] + " ");
        }
        System.out.println();


    }
        System.out.println();
}


}

