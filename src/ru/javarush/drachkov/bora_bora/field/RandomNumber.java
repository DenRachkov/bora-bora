package ru.javarush.drachkov.bora_bora.field;




import java.util.Random;
public class RandomNumber {


    public static int get(int number) {
        Random random = new Random();
        return random.nextInt(number);

    }


}

