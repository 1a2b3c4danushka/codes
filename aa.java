



public class aa{
   public static void main(String[]args){
       A a = new A();
      a.greet();
      a.card();
      a.paper();
   }
}
interface Shape{
    void greet();
   
}
interface Size{
      void card();
}
interface Print extends Shape,Size{
    void paper();
}
class A  implements Print{
   public void paper(){
       System.out.println("Paper is here");
   }
   public void greet(){
       System.out.println("Hello myself Anushka nice to meet u");
   }
   public void card(){
       System.out.println("Card is printed with name : Anushkaa ");
   }
}






