package HomeWork2.loops;

public class HomeWorkTwoLoopsTask5 {
    public static void main(String[] args) {
        long number1 = 1;
        long number2 = 0;
        int number3 = 3;

        if (number3 > 0) {
            while (number1 > 0) {
                if (number1 * number3 < 0 || number1 * number3 < number1) {
                    number2 = number1;
                    number1 *= number3;
                    break;
                }
                number1 *= number3;
            }
        }
        if (number3 < 0) {
            while (1 == 1) {
                if ((number1 < 0 && number1 * number3 < 0) || (number1 < 0 && number1 * -1 > number1 * number3)) {
                    number2 = number1;
                    number1 *= number3;
                    break;
                }
                else if (number1 > 0 && number1 * number3 > 0) {
                    number2 = number1;
                    number1 *= number3;
                    break;
                }
                else {
                    number1 *= number3;

                }
            }
        }
        System.out.println(number1);
        System.out.println(number2);

    }

}
