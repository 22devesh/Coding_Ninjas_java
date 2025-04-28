// package ArrayList;

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1=new  ArrayList<>();
        System.out.println(list1.size());
        list1.add(15);
        list1.add(20);
        list1.add(25);
        System.out.println(list1.size());
        System.out.println(list1.get(2));

    }
}
