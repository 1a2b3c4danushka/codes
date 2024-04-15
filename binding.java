//Binding
class Base{
    public void show(){
        System.out.println("It Show Base class");
    }
    public void display(){
        System.out.println("It Display Base class");
    }
}
class Derived extends Base{
    public void show(){
        System.out.println("Derived class showed");
    }
    public void display(){
        System.out.println("Derived class display");
    }
}
public class binding{
    public static void main(String[]args){
        Base b = new Base();
        Derived d = new Derived();
        b.show();
        b.display();
        d.show();
        d.display();
    }
}