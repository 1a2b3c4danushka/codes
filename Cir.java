


interface Circle{
    int radius = 2;
    public int area();
    public int perimeter();
 
 }
 interface Rectangle{
     int length = 2;
     int breath = 6;
     public int Area();
     public int Perimeter();
 }
 class C implements Circle,Rectangle{
     int a = 22/7 * radius *radius;
     int b = 2 * 22/7*radius;
     int l = length*breath;
     int br= length + breath;
     public int area(){
         System.out.println("The Area of circle"+ a);
         return a;
     }
     public int perimeter(){
         System.out.println("The perimeter of circle" + b);
         return b;
     }
     public int Area(){
         System.out.println("The area of rectangle:" + l);
         return l;
     }
     public int Perimeter(){
         System.out.println("The Perimeter of rectangle:" + br);
         return br;
     }
     
 }
public class Cir{
     public static void main(String[]args){
         C c = new C();
         System.out.println(c.area() + c.perimeter()+ c.Area()+c.Perimeter());
     }
 }



