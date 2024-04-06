import java.nio.charset.spi.CharsetProvider;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread one start....");
        }
    }
}

class MyThreadd extends Thread {
    public void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println("Thread two start...");
        }
    }
}

public class PracticeOnThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThreadd t2 = new MyThreadd();
        t1.start();
        t2.start();
        System.out.println("Id of t1 is "+t1.getId());
        System.out.println("Id of t2 is "+t2.getId());
        System.out.println(t1.getState());
        System.out.println(t2.getState());

    }
}

