interface A{
    public String getName();
    public int getId();
}
class B implements A{
    public String getName(){
        return "Anushka";
    }
    public int getId(){
        return 642;
    }
}
public class in{
    public static void main(String[]args){
        B b = new B();
        System.out.println(b.getName() + b.getId());
    }
}