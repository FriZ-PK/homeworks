package HomeWork2.loops;

public class HomeWorkTwoLoopsTask6 {
    public static void main(String[] args) {
        int b = 1;

        for (int i = 2;i < 10;b++){

            if (b == 11) {
                b = 1;
                i = 6;
                System.out.println(" ");
                while (i < 11) {
                    if (b == 11){
                        return ;
                    }
                    System.out.print(i + " * " + b + " = " + i*b + "   ");
                    ++i;
                    System.out.print(i + " * " + b + " = " + i*b + "   ");
                    ++i;
                    System.out.print(i + " * " + b + " = " + i*b + "   ");
                    ++i;
                    System.out.println(i + " * " + b + " = " + i*b);
                    ++b;
                    i = 6;
                }
            }
            System.out.print(i + " * " + b + " = " + i*b + "   ");
            ++i;
            System.out.print(i + " * " + b + " = " + i*b + "   ");
            ++i;
            System.out.print(i + " * " + b + " = " + i*b + "   ");
            ++i;
            System.out.println(i + " * " + b + " = " + i*b);
            i = 2;
        }
    }
}

