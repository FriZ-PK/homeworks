package HomeWork2.arrays;

import java.util.Random;

public class HomeWorkTwoArraysTask2 {
    public static void main(String[] args) {
        int[] mass = arrayRandom(5, 100);

    }
    public static int[] arrayRandom(int size,int maxValueExclusion) {
        Random rand = new Random();
        int[] mass = new int[size];

        for (int i = 0;i < size;i++) {
            mass[i] = rand.nextInt(maxValueExclusion);
        }
        return mass;
    }

    public static int sumPositiveNumbers(int[] mass) {
        int sum = 0;
        for (int i = 0;i < mass.length;++i) {
            if (mass[i] > 0) {
                sum += mass[i];
            }
            ++i;
        }
        return sum;
    }

    public static int maxPositiveNumber(int[] mass) {
        int maxNumber = 0;
        for (int i = 0;i < mass.length;++i) {
            if (maxNumber < mass[i]) {
                maxNumber = mass[i];
            }
            ++i;
        }
        return maxNumber;
    }

    public static void averageNumbers(int[] mass) {
        int averageNumber = 0;

        for (int i = 0;i < mass.length;++i) {
            averageNumber += mass[i];
        }
        averageNumber /= mass.length;
        for (int i = 0;i < mass.length;i++) {
            if (mass[i] < averageNumber) {
                System.out.println(mass[i]);
            }
        }
    }

    public static void minNumbers(int[] mass) {
        int indexMin1 = 0;
        int min1 = 0;
        int min2 = 0;

        for (int i = 0;i < mass.length;i++) {
            if (min1 < mass[i]) {
                min1 = mass[i];
                indexMin1 = i;
            }
        }
        for (int i = 0;i < mass.length;i++) {
            if (i != indexMin1) {
                if (min2 < mass[i]) {
                    min2 = mass[i];
                }
            }
        }
        System.out.println(min1 + " " + min2);
    }

    public static void sortMass(int[] mass, int start, int end) {
        for (int i = 0;i < mass.length;i++) {
            if (mass[i] >= start && mass[i] <= end) {
                mass[i] = 0;
            }
        }
    }

    public static void sumNumbers(int[] mass) {
        String number = null;
        int sum = 0;
        for (int i = 0;i < mass.length;i++) {
            number = String.valueOf(mass[i]);
            for (int b = 0;b < number.length();b++) {
                sum += number.charAt(b) - '0';
            }
        }
    }
}
