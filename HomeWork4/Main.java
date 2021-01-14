package HomeWork4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DataContainer<Integer> box = new DataContainer<>(new Integer[] {5, 15, 17, 22});

        box.delete(box.get(2));
        box.print();
    }
}
