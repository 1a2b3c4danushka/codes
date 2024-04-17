//abstract class
abstract class Shape{
    public abstract  String getName();
    public abstract  int getId();
}
class Identity extends Shape{
    public String getName(){
        return "Anushka";
    }
    public int getId(){
        return 245;
    }
}
class B extends Shape{
    public String getName(){
        return "Anshika";
    }
    public int getId(){
        return 642;
    }
}
public class abst{
    public static void main(String[]args){
        Identity i = new Identity();
        B b = new B();
        System.out.println(i.getName() + " " + i.getId() + "\n" +  " " + b.getName() + " " +  b.getId());
        
    }
}