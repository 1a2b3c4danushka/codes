

class Student{
    int id;
    String name;
    String dob;
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
       this.name= name;
    }
    public void setDOB(String dob){
        this.dob = dob;
    }
    public int getId(){
        return id;
       
    }
    public String getName(){
        return name;
    }
    public String getDOB(){
        return dob;
    }
}


public class vv {
    public static void main(String[]args){
        Student s = new Student();
        s.setId(5);
        s.setName("Anushka");
        s.setDOB("07-02-2003");
        System.out.println(s.getDOB()+" "+ s.getName() + " " + s.getId());
    }
}
