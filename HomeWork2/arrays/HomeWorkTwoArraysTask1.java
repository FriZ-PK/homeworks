package HomeWork2.arrays;

import java.util.Scanner;

public class HomeWorkTwoArraysTask1 {
    public static void main(String[] args) {
        int [] mass = arrayFromConsole();
    }

    public static int[] arrayFromConsole() {
        Scanner in = new Scanner(System.in);
        int [] mass;

        System.out.println("Введите размер массива :");
        mass = new int[in.nextInt()];
        for (int i = 0;i < mass.length;i++){
            System.out.println("Введите " + (i + 1) + " элемент массива :");
            mass[i] = in.nextInt();
        }
        return mass;
    }

    // С помощью do..while
    public static void doWhileSortConsole (int mass[]) {
        int i = 0;
        do {
            System.out.println(mass[i]);
            ++i;
        } while(i < mass.length);
    }
    public static void doWhileSortEachSecond (int mass[]) {
        int i = 0;
        do {
            ++i;
            System.out.println(mass[i]);
            ++i;
        } while(i < mass.length);
    }
    public static void doWhileSortBack (int mass[]) {
        int i = mass.length;
        do {
            System.out.println(mass[i]);
            --i;
        } while(i > 0);
    }

    //С помощью while
    public static void whileSortConsole(int mass[]) {
        int i = 0;
        while (i < mass.length) {
            System.out.println(mass[i]);
            i++;
        }
        i = 0;
    }
    public static void whileSortEachSecond(int mass[]) {
        int i = 0;
        while (i < mass.length) {
            ++i;
            System.out.println(mass[i]);
            ++i;
        }
        i = 0;
    }
    public static void whileSortBack(int mass[]) {
        int i = mass.length;
        while (i > 0) {
            --i;
            System.out.println(mass[i]);
        }
        i = 0;
    }

    //С помощью for
    public static void forSortConsole (int mass[]) {
        for (int i = 0;i < mass.length;i++){
            System.out.println(mass[i]);
        }
    }
    public static void forSortEachSecond (int mass[]) {
        for (int i = 0;i < mass.length;i++){
            ++i;
            System.out.println(mass[i]);
        }
    }
    public static void forSortBack (int mass[]) {
        for (int i = mass.length;i > 0;i--){
            System.out.println(mass[i]);
        }
    }

    //С помощью foreach
    public static void forEachSortConsole (int mass[]) {
        for (int element : mass) {
            System.out.println(element);
        }
    }
    public static void forEachSortEachSecond (int mass[]) {
        int i = 0;
        for (int element : mass) {
            if(i % 2 != 0) {
                System.out.println(element);
            }
            ++i;
        }
    }
    public static void forEachSortBack (int mass[]) {
        int [] mass1 = new int [mass.length];
        int b = 0;

        for (int i = mass.length;i > 0;i--){
            mass1[b] = mass[i];
        }
        for (int element : mass1) {
            System.out.println(element);
        }
    }
}
