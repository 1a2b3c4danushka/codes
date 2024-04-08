class A{
    int radius;
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int calculateArea(){
        return 22/7 * radius * radius;
    }
    public int calculatePerimeter(){
        return 2 * 22/7 * radius;
    }
}

public class circle {
    public static void main(String[]args){
        A a = new A();
        a.setRadius(4);
        System.out.println(a.calculateArea() + " " +  a.calculatePerimeter());
    }
}
