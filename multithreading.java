import java.util.*;
class MyThread extends Thread{
    public void greet(){
        System.err.println("Hello from my side");
    }

}
class MyThread2 extends Thread{
    public void gee(){
        System.out.println("Iam Anushka");
    }
}
public class Main{
    public static void main(String[]args)
    {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
