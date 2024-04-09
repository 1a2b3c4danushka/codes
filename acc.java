class Account{
    String name = "Anushka";
    int balance = 5000;
    public void show(){
        System.out.println("Name:" + name + "\n" + balance);
    }
}
public class acc{
    public static void main(String[]args){
        Account a = new Account();
        a.show();
    }
}