//Getters and Setters
/*
Getters and setters are methods used to control access to an object's private fields in Java. 
A getter (like getName()) retrieves the value of a field, while a setter (like setName()) modifies it, 
often including validation logic to ensure data integrity. These methods enforce encapsulation, a core OOP
 principle that protects an object's internal state by hiding implementation details and exposing only safe, 
 controlled operations.
 * 
 */
class Bank{
 private String name;
    private long Accnum;
    private int balance=100;

    Bank(String name, long Accnum){
        this.Accnum=Accnum;
        this.name=name;
        this.balance=1000;
    }

    String getName(){
        return name;
    }

    int getBalance(){
        return balance;
    }

    long getAccnum(){
        return Accnum;
    }

    void setAccnum(long Accnum){
        this.Accnum=Accnum;
    }

    void setName(String name){
        this.name=name;
    }

}
public class Encaspulation {
   
    public static void main(String[] args) {
        Bank acc1 = new Bank("Conor", 1000121);
        System.out.println(acc1.getAccnum());
    }
}
/*
 * This Bank class demonstrates encapsulation using private fields (name, Accnum, balance) and public getters/setters. 
 * The constructor initializes these fields, with balance set to 1000 (overriding the default 100). 
 * The getters (getName(), getBalance(), getAccnum()) allow read-only access to the fields, while the setters (setAccnum(), setName()) enable controlled modification.
 */