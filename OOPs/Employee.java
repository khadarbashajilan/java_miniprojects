/*STATIC keyword- The static keyword in Java is used for memory management.
 It indicates that a member (variable or method) belongs to the class itself, 
 rather than to individual instances (objects) of the class. */
public class Employee {
    int empID;
    String dept;
    String name;
    private static int numofEmployees=0;
    Employee(int empID, String dept, String name){
        this.empID = empID;
        this.name=name;
        this.dept=dept;
        numofEmployees++;
    }
    public static int getnoEmployees(){
        return numofEmployees;
    }

    public static void main(String[] args) {
        Employee emp1  = new Employee(01, "ABC", "abc");
        Employee emp2  = new Employee(02, "XYZ", "xyz");
        //System.out.print(numofEmployees); or
        System.out.print(getnoEmployees());

    }
}
/*This Java program tracks how many Employee objects are created using a special counter called numofEmployees. 
The counter is marked as static, which means it belongs to the whole Employee class rather than individual employees—so 
every time a new employee is created, this shared counter goes up by one. 
The Employee constructor takes details like ID, department, and name, and automatically increments the counter. 
There’s also a static method, getnoEmployees(), which lets you check the total number of employees without needing an object. 
In the main method, two employees are created, and the program prints the total count (which outputs 2).
 The code keeps the counter private to prevent accidental changes, ensuring only the class itself can update it. Simple and efficient! */