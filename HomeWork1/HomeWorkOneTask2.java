package HomeWork1;

public class HomeWorkOneTask2 {
    public static void main(String[] args) {
        int number1 = -42;
        int number2 = -15;
        int number3 = 2;

        System.out.println(number1 & number2); // 11010110 & 11110001 = 11010000 (-48)
        System.out.println(number1 | number2); // 11010110 | 11110001 = 11110111 (-9)
        System.out.println(number1 ^ number2); // 11010110 ^ 11110001 = 00100111 (39)
        number1 ^= number2;  // 11010110 ^ 11110001 = 00100111 (39)
        number1 &= number2;  // 00100111 & 11110001 = 00100001 (33)
        number1 |= number2;  // 00100001 | 11110001 = 11110001 (-15)
        number1 <<= number3; // 11110001 = 11000100 (-60)
        number2 >>= number3; // 11110001 = 11111100 (-4)
        number2 >>>= 28;     // 11110001 = 00001111 (15)
        System.out.println("Первое число : " + number1 + "\n" + "Второе число : " + number2);
        number1 = -42;
        number2 = -15;
        System.out.println("Операции с числом -42 :" );
        System.out.println(~number1);           // 11010110 = 00101001 (41)
        System.out.println(number1 << number3); // 11010110 = 01011000 (-168)
        System.out.println(number1 >> number3); // 11010110 = 11110101 (-11)
        System.out.println(number1 >>> 28);     // 11010110 = 00001111 (15)
        System.out.println("Операции с числом -15 :" );
        System.out.println(~number2);           // 11110001 = 00001110 (14)
        System.out.println(number2 << number3); // 11110001 = 11000100 (-60)
        System.out.println(number2 >> number3); // 11110001 = 11111100 (-4)
        System.out.println(number2 >>> 28);     // 11110001 = 00001111 (15)
    }
}
