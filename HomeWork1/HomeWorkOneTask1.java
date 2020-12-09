package HomeWork1;

public class HomeWorkOneTask1 {
    public static void main(String[] args) {
        int number1 = 42;
        int number2 = 15;
        int number3 = 2;

        System.out.println(number1 & number2); // 00101010 & 00001111 = 00001010 (10)
        System.out.println(number1 | number2); // 00101010 | 00001111 = 00101111 (47)
        System.out.println(number1 ^ number2); // 00101010 ^ 00001111 = 00100101 (37)
        number1 ^= number2;  // 00101010 ^ 00001111 = 00100101 (37)
        number1 &= number2;  // 00100101 & 00001111 = 00000101 (5)
        number1 |= number2;  // 00000101 | 00001111 = 00001111 (15)
        number1 <<= number3; // 00001111 = 00111100 (60)
        number2 >>= number3; // 00001111 = 00000011 (3)
        number2 >>>= 1;      // 00001111 = 00000001 (1)
        System.out.println("Первое число : " + number1 + "\n" + "Второе число : " + number2);
        number1 = 42;
        number2 = 15;
        System.out.println("Операции с числом 42 :" );
        System.out.println(~number1);            // 00101010 = 11010101 (-43)
        System.out.println(number1 << number3);  // 00101010 = 10101000 (168)
        System.out.println(number1 >> number3);  // 00101010 = 00001010 (10)
        System.out.println(number1 >>> number3); // 00101010 = 00001010 (10)
        System.out.println("Операции с числом 15 :" );
        System.out.println(~number2);            // 00001111 = 11110000 (-16)
        System.out.println(number2 << number3);  // 00001111 = 00111100 (60)
        System.out.println(number2 >> number3);  // 00001111 = 00000011 (3)
        System.out.println(number2 >>> number3); // 00001111 = 00000011 (3)
    }
}
