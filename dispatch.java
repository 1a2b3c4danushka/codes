//Dynamic Method dispatch
class Shape{
    int length;
    int breath;
    public Shape(int length,int breath){
        this.length = length;
       this.breath = breath;
    }
    public int getLength(){
        return length;
    }
    public int getBreath(){
        return breath;
    }
    public int area(){
        return length * breath;
    }
}
class Rectangle extends Shape{
    public Rectangle(int length,int breath){
        super(length,breath);
    }
    public int getLength(){
        return length;
    }
    public int getBreath(){
        return breath;
    }
    public int area(){
        return length * breath;
    }
}
class Triangle extends Shape{
    public Triangle(int breath,int height){
        super(breath,height);
    }
    public int area(){
        return (int)(0.5* length * breath);
    }
}
public class dispatch{
    public static void main(String[]args){
        Rectangle r = new Rectangle(4,12);
        Triangle t = new Triangle(4,2);
        
        System.out.println(r.getLength() + r.getBreath() + r.area());
        System.out.println(t.area());
    }
}
