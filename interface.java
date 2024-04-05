interface Conversions{
    int a = 5;
    public void greet();
    public void aValue();
}
class A implements Conversions{
    public void greet(){
        System.out.println("Hello there..");
    }
    public void aValue(){
        System.out.println("The value of a will be: "+ a);
        
    }
}
class B implements Conversions{
    public void greet(){
        System.out.println("Nice to meet you..");
    }
    public void aValue(){
        System.out.println("The value of a in b is :" + a);
    }

    public static void main(String[]args){
        A a = new A();
        B b = new B();
        a.greet();
        a.aValue();
        b.aValue();
        b.greet();
    }
}
