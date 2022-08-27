package ru.javarush.drachkov.bora_bora.floraandfauna.animals;

public class Fox extends Predator {


        public static String emogi = "\uD83E\uDD8A";
        public static double weight = 8;
        public static int maxNumberOfAnimals = 30;
        public static int movementSpeed = 2;
        public static double saturation = 2;

        public Fox(int x, int y) {
                super(x, y);
        }

        public static String getEmogi() {
                return emogi;
        }

        public void setEmogi(String emogi) {
                this.emogi = emogi;
        }

        public static double getWeight() {
                return weight;
        }

        public static void setWeight(double weight) {
                Fox.weight = weight;
        }

        public static int getMaxNumberOfAnimals() {
                return maxNumberOfAnimals;
        }

        public static void setMaxNumberOfAnimals(int maxNumberOfAnimals) {
                Fox.maxNumberOfAnimals = maxNumberOfAnimals;
        }

        public static int getMovementSpeed() {
                return movementSpeed;
        }

        public static void setMovementSpeed(int movementSpeed) {
                Fox.movementSpeed = movementSpeed;
        }

        public static double getSaturation() {
                return saturation;
        }

        public static void setSaturation(double saturation) {
                Fox.saturation = saturation;
        }
}