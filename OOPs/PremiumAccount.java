//super Keyword - 
/*The super keyword in Java is used to refer to the immediate parent class of a subclass. It has two primary uses:
    Accessing Parent Class Members: Call parent class methods/variables (especially when overridden in the child).
    Invoking Parent Class Constructor: Must be the first statement in a child constructor.
 */
class BasicAccount{
    int accountnumber;
    int balance;

    BasicAccount(int accountnumber, int balance){
        this.accountnumber =accountnumber;
        this.balance=balance;
    }
    void Deposit(int ammount){
        balance+=ammount;
    }

}

public class PremiumAccount extends BasicAccount{
    int rewardpoints=0;
    //100 for every deposit

    PremiumAccount(int accountnumber, int balance){
        super(accountnumber, balance);

    }

    @Override
    void Deposit(int amount){
        super.Deposit(amount);
        rewardpoints+=100;
    }

    void show(){
        System.out.print("Account number:"+super.accountnumber+", Total balance"+super.balance+", Reward Points"+rewardpoints+".");
    }

    public static void main(String[] args) {
        PremiumAccount acc1 = new PremiumAccount(1121112, 1000);
        acc1.Deposit(10000);
        acc1.show();
    }
}
/*
 * This Java program demonstrates inheritance and the use of the super keyword through a banking account system. 
 * The base class BasicAccount stores fundamental account information (account number and balance) and provides a deposit method. 
 * The derived class PremiumAccount extends this functionality by adding reward points that increase with each deposit. 
 * Key uses of super include: calling the parent class constructor to properly initialize inherited fields, 
 * and invoking the parent's deposit method before adding reward point logic in the overridden version. 
 * The show method displays all account details, combining both inherited and new features. 
 * When executed, creating a PremiumAccount and making a deposit demonstrates 
 * how the child class builds upon the parent's functionality - the deposit first updates the balance (using parent logic via super.Deposit())
 * then adds 100 reward points. This showcases how super enables code reuse while extending functionality in object-oriented programming.
 */