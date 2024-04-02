import java.util.*;
class Student{
    String name;
    int id;
    Student(String name,int id){
        this.name = name;
        this.id = id;
    }
    public int getId(){
       return id;
    }
    public String getName(){
        return name;
    }
    public void identity(){
        System.out.println("Identy of Student..",name + id);
    }


}
class Parent extends Student{
    String name;
    int id;
    Student(String name,int id){
        this.name = name;
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
   public void identity(){
    System.out.println("Identity of Parent",name + id);
   }
}
public class polymorphism{
    public static void main(String[]args){
      Student s = new Student("Anushka",45);
      Parent p = new Parent("Arvind",50);
      System.out.println(s.getName()+s.getId() +p.getId()+p.getName());
      s.identity(); 
      p.identity();

    }
}