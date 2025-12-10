package util;
import static util.CustomLogger.*;
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+": run()");
    }
}
public class ThreadLoggerTest {
    public static void main(String[] args){
        logger("thread test");
        System.out.println(Thread.currentThread().getName()+":main() start");
        logger("main() start");
        MyThread t1 = new MyThread();
        System.out.println(Thread.currentThread().getName()+":start() 호출 전");
        t1.start();
        System.out.println(Thread.currentThread().getName()+":start() 호출 후");
        System.out.println(Thread.currentThread().getName()+":main() end");
    }
}
