import jdk.jshell.EvalException;
import java.util.*;
class myThread1 implements Runnable{
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("My threads one");
        }
    }
}
class myThread2 implements Runnable{
        public void run() {
            for (int j = 0; j < 20; j++) {
                System.out.println("My thread two");

            }
        }
}
public class PracticeOnDataTypes{
    public static void main(String[] args) {
        myThread1 bullet1 = new myThread1();
        Thread gun1 = new Thread(bullet1);
        myThread2 bullet2 = new myThread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();


    }
}

