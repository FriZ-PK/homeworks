package HomeWork2.loops;

import java.util.Scanner;

public class HomeWorkTwoLoopsTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int result = 0;

        number1 = in.nextInt();
        number2 = in.nextInt();

        for (int i = 0;i < number2 - 1;i++) {
             if (i == 0) {
                 result = number1 * number1;
             }
             else {
                 result = result * number1;
             }
        }
        System.out.println(result);
    }

}
