package ru.javarush.drachkov.bora_bora.field;



public class RandomNumber {
    public static int getRandomNumber() {
        int min = 0;
        int max = 30;
        int randomNumber = (int)(Math.random() * (max + 1 - min) + min);
        System.out.println(randomNumber);

        return 0;
    }

}
