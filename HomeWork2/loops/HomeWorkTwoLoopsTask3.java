package HomeWork2.loops;

import java.util.Scanner;

public class HomeWorkTwoLoopsTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = null;
        int result = 1;

        number = in.next();
        for (int i = 0;i < number.length();i++) {

            if (i == 0 && number.length() != 1) {
                result = number.charAt(i) - '0';
                System.out.print(result + " * ");
            }
            else if (i != number.length() - 1) {
                result = result * (number.charAt(i) - '0');
                System.out.print((number.charAt(i) - '0') + " * ");
            }
            else {
                result = result * (number.charAt(i) - '0');
                System.out.print((number.charAt(i) - '0') + " = " + result);
            }
        }

    }

}
