package HomeWork2.sorts;

public class HomeWorkTwoSortsTask1 {
    public static void main(String[] args) {

    }
    public static void bubble(int[] mass) {
        int massNumber;

        for (int i = 0;i < mass.length;i++){
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        while (1 == 1) {
            int i =0;
            massNumber = 0;
            for (int b = i + 1;b < mass.length;b++,i++) {
                if (mass[i] > mass[b]) {
                    massNumber = mass[i];
                    mass[i] = mass[b];
                    mass[b] = massNumber;
                }
            }
            if (massNumber == 0) {
                break;
            }
        }
        for (int i = 0;i < mass.length;i++){
            System.out.print(mass[i] + " ");
        }
    }
}
