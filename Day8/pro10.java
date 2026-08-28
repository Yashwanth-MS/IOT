package day8;
import java.util.Scanner;

class pro10 {

    int age = 20;

    static String college = "ABC College";

    pro10() {
        System.out.println("Constructor called");
    }

    void display(String name) {
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the name:");
    	String name = sc.nextLine();
        pro10 s = new pro10();

        s.display(name);
    }
}
