package HomeWork2.loops;

import java.util.Scanner;

public class HomeWorkTwoLoopsTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        int result = 1;

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

        for (int i = 2 ;i <= number;++i) {
            result = result * i ;
        }
        System.out.println(result);

    }
}
