package day5;
import java.util.*;

public class pro11 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("hi");
        set.add("Banana");
        set.add("bye");
        set.add("Apple");
        set.add("true");
        set.add("joy");
        set.add("A");
        set.add("Mango");
        set.add("B");

        System.out.println("Size of set: " + set.size());
        System.out.println("Set contents: " + set);

        System.out.println("Iterating:");
        for (String value : set) {
            System.out.println(value);
        }
    }
}