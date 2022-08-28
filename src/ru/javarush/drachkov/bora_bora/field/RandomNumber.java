package ru.javarush.drachkov.bora_bora.field;


import ru.javarush.drachkov.bora_bora.floraandfauna.animals.Animal;

import java.util.Random;
public class RandomNumber {


    public static int get(int number) {
        Random random = new Random();
        return random.nextInt(number);

    }


}

