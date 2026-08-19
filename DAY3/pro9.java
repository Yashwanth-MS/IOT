package day3;

class pro9 implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {

        pro9 d = new pro9();

        Thread t1 = new Thread(d, "Thread-1");
        Thread t2 = new Thread(d, "Thread-2");

        t1.start();
        t2.start();
    }
}
