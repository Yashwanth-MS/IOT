package day9;

import java.util.*;

public class pro9 {
    public static void main(String[] args) {

        String[] names = {"646545831", "634666472", "767484859"};
        String search = "5";

        ArrayList<String> result = new ArrayList<>();

        for (String name : names) {
            if (name.contains(search)) {
                result.add(name);
            }
        }

        System.out.println("Search results:");

        for (String name : result) {
            System.out.println(name);
        }
    }
}