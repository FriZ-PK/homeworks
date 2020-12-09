package HomeWork1;

import java.util.Scanner;

public class HomeWorkOneTask8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String name;

        System.out.println("Введите ваше имя :");
        name = in.next();
        switch (name) {
            case "Вася" :
                System.out.println("Привет! \n" + "Я тебя так долго ждал");
                break;
            case "Анастасия" :
                System.out.println("Я тебя так долго ждал");
                break;
            default :
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
