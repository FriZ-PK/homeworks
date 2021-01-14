package HomeWork4;

import java.util.Arrays;

public class DataContainer<T extends Integer> {
   private T[] data;

   public DataContainer (T[] data) {
       this.data = data;
    }

   public int add(T item) {
       int fIndex = checkFIndex();

       if (item == null) {
           return -1;
       }

       data[fIndex] = item;

       if (fIndex != 0) {
           return data[fIndex - 1];
       }
       else {
           return 0;
       }
   }

   public T get(int index) {
       if (index >= data.length) {
           return null;
       }
        return this.data[index];
   }

   public T[] getItems() {
       return this.data;
   }

   public boolean delete(int index) {
       if(index < data.length) {
           while (1 == 1) {
               if(index < data.length - 1) {
                   data[index] = data[++index];
               }
               else {
                   this.data = Arrays.copyOf(data, data.length - 1);
                   return true;
               }
           }
       }
       return false;
   }

   public boolean delete(T item) {
       for (int i = 0;i < data.length;i++) {
           if (data[i] == item) {
               delete(i);
               return true;
           }
       }
       return false;
   }

   public String toString(){
        
       return null;
   }

   public int checkFIndex() {
       for (int i = 0;i < data.length;i++) {
           if (data[i] == null) {
               return i;
           }
       }
       this.data = Arrays.copyOf(data, data.length + 1);
       return data.length - 1;
   }
   public void print(){
       System.out.println(Arrays.toString(this.data));
   }

}
