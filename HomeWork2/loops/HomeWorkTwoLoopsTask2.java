package HomeWork2.loops;

import java.util.Scanner;

public class HomeWorkTwoLoopsTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;

        while(1 == 1) {
            number = in.nextInt();
            if (number >= 32) {
                System.out.println("Слишком большое число(Переполнение)");
                System.out.println("Введите другое число :");
            }
            else if (number < 0) {
                System.out.println("Введите положительное число :");
            }
            else {
                break;
            }
        }
        System.out.println( recurs(number) );
    }

    public static int recurs(int number) {
        int result = 1;

        if (number == 1 || number == 0) {
            return result;
        }
        result = number * (recurs(number - 1));
        return result;
    }
}
