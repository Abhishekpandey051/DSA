class test implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is the runnable interface");
        }
    }
}

class testt implements Runnable {
    public void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println("This the second Runnable interface");
        }
    }

    public void run (String s) {
        System.out.println(s);
    }
    }

public class RunnableClassPractice {
    public static void main(String[] args) {
        test t = new test();
        Thread th = new Thread(t);
        System.out.println(th.getState());
        th.start();

        testt t1 = new testt();
        Thread th1 = new Thread(t1);
        th1.start();
        System.out.println(th1.getState());
//        System.out.println(th1.getThreadGroup());


    }
}
