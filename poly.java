class A {
    public void show(){
        System.out.println("Showing class A");
    }
}
class B extends A{
    public void show(){
        System.out.println("Showing class B");
    }
}
public class poly{
    public static void main(String[]args){
        B b = new B();
        A a = new A();
        b.show();
        a.show();
    }
}

