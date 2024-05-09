
class MyThread1 extends Thread{
    public void greet(){
        System.out.println("Hello Good nigth");
    }
}
class MyThread2 extends Thread{
    public void greet(){
        System.out.println("Hello Good morning");
    }
}
public class thread{
    public static void main(String[]args){
        MyThread1 t1 = new MyThread1();
        Thread t = new Thread(t1);
        MyThread2 t2 = new MyThread2();
        Thread t3 = new Thread(t2);
        t.start();
        t3.start();
    }
}