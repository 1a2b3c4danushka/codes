interface A{
    public void greet();
    
}
interface B{
    public void print();
}
interface C extends A,B{
    public void cprint();
}
class D implements C{
    public void greet(){
        System.out.println("Nice to meet you");
    }
    public void print(){
        System.out.println("Print B interface");
    }
    public void cprint(){
        System.out.println("Printing c");
    }
}
public class exp{
    public static void main(String[]args){
        D d = new D();
        d.greet();
        d.print();
        d.cprint();
    }
}
