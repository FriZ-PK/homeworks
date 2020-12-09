package HomeWork1;

public class HomeWorkOneTask10Version2 {
    public static void main(String[] args) {
        System.out.println(toBinaryString((byte) 42));
        System.out.println(toBinaryString((byte) 15));
        System.out.println(toBinaryString((byte) -42));
        System.out.println(toBinaryString((byte) -15));
    }
    public static String toBinaryString(byte number) {
        String binaryString = "";
        int i = 0;

        if (number >= 0) {
            while (i < 8) {
                ++i;
                binaryString = number % 2 + binaryString;
                number /= 2;
            }
            return binaryString;
        }
        if (number < 0) {
            number *= (byte) -1;
            while (i < 8) {
                ++i;
                if (number % 2 == 1) {
                    binaryString = 0 + binaryString;
                }
                else {
                    binaryString = 1 + binaryString;
                }
                number /= 2;
            }
        }
        return binaryString;
    }
}
