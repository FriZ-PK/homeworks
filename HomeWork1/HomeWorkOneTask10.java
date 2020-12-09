package HomeWork1;

public class HomeWorkOneTask10 {
    public static void main(String[] args) {
        System.out.println(toBinaryString((byte) 42));
        System.out.println(toBinaryString((byte) 15));
        System.out.println(toBinaryString((byte) -42));
        System.out.println(toBinaryString((byte) -15));
    }

    public static String toBinaryString(byte number) {
        String binaryNumber = null;
        int lenString = 0;

        if (number >= 0) {
            binaryNumber = "0000000" + Integer.toBinaryString(number);
            lenString = binaryNumber.length();
            for (int i = 0; i < lenString - 8; i++) {
                binaryNumber = binaryNumber.substring(1);
            }
            return binaryNumber;
        }
        else {
            binaryNumber = Integer.toBinaryString(number - 1);
            lenString = binaryNumber.length();
            for (int i = 0; i < lenString - 8; i++) {
                binaryNumber = binaryNumber.substring(1);
            }
        }
        return binaryNumber;
    }
}
