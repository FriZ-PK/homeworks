package HomeWork2.loops;

import java.util.Scanner;

public class HomeWorkTwoLoopsTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        int result = 1;

        number = in.nextInt();

        for (int i = 2 ;i <= number;++i) {
            result = result * i ;
        }
        System.out.println(result);

    }
}
