package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Fox extends Predator {


        //public String emogi = "\uD83E\uDD8A";
        public double weight = 8;
        public int maxNumberOfAnimals = 30;
        public int movementSpeed = 2;
        public double saturation = 2;

        public Fox(int x, int y) {
                super(x, y);
        }

        @Override
        public String getEmogi() {
                return "\uD83E\uDD8A";
        }
}




