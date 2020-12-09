package HomeWork1;

public class HomeWorkOneTask5 {
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vocation = false;

        if (sleepln(weekday, vocation)) {
            System.out.println("Sleep");
        }
        else {
            System.out.println("Get up");
        }
    }

    public static boolean sleepln(boolean weekday, boolean vocation) {
        if (weekday || vocation) {
             return true;
         }
         else {
             return false;
         }
        // return (weekday || vocation ? true : false);     // Более компактный вариант
    }
}
