package day2;
//method overriding
class p {
    void property() {
        System.out.println("Property");
    }

    void marry() {
        System.out.println("family selected girl/boy");
    }
}

public class pro1 extends p {

    @Override
    void marry() {
        System.out.println("campus selected girl/boy");
    }

    public static void main(String[] args) {
        pro1 test = new pro1();

        test.marry();
        test.property();
    }
}
