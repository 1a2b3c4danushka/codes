

interface Circle{
    int radius = 2;
    public int area();
    public int perimeter();
}
class A implements Circle{
    int aa = 22/7 * radius*radius;
    int bb = 2 * 22/7 * radius;
    public int area(){
        System.out.println("Area of circle:" + aa);
        return aa;
    }
    public int perimeter(){
        System.out.println("Perimeter of circle:" + bb);
        return bb;
    }
}
   public class Main{

    public static void main(String[]args){
        A a = new A();
       System.out.println(a.area());
        System.out.println(a.perimeter());
    }
}
