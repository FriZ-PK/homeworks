package HomeWork1;

import java.util.Scanner;

public class HomeWorkOneTask7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String name;

        System.out.println("Введите ваше имя :");
        name = in.next();
        if (name.equals("Вася")) {
            System.out.println("Привет! \n" + "Я тебя так долго ждал");
        }
        else if (name.equals("Анастасия")) {
                System.out.println("Я тебя так долго ждал");
        }
        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
