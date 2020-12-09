package HomeWork1;

public class HomeWorkOneTask9 {
    public static void main(String[] args) {
        int[] num  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(createPhoneNumber(num));
    }

    public static String createPhoneNumber(int num[]) {
        String number = "(";
        for (int i = 0;i < 10;i++){

            if (i!= 2 && i!= 5){
                number += num[i];
            }
            else if (i == 2){
                number += num[i] + ") ";
            }
            else {
                number += num[i] + "-";
            }
        }
        return number;
    }
// number = "(" + num[0] + num[1] + num[2] + ") " + num[3] + num[4] + num[5] + "-" + num[6] + num[7] + num[8] + num[9];
}

