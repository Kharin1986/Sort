package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(16);
        list.add(31);
        list.add(17);
        list.add(1);
        System.out.println(list);
        list.set(1,45);
        System.out.println(list);
        System.out.println(list);

    }
}
