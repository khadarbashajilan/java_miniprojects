// toString() - 
/*The toString() method is a built-in Java method (from the Object class) that converts an object into a string representation. 
By default, it returns the class name + memory address (e.g., Student@1a2b3c). 
We override it to return a meaningful, human-readable description of the object's data (e.g., Student: [Name=ABC, RollNo=1, Grade=A]). 
It’s automatically called when printing an object or concatenating it with strings. */
public class Student {
    int rollno;
    char grade;
    String name;
    Student(String name, int rollno, char grade){
        this.name=name;
        this.rollno=rollno;
        this.grade=grade;
    }
    @Override
    public String toString(){
        return "Student: [Name=" + name + ", RollNo=" + rollno + ", Grade=" + grade + "]";
    } 
    public static void main(String[] args) {
        // The below decleration is called array of objects, i guess u know that 
        // Student stud1[] = {
        //                     new Student("abc", 01, 'A'),
        //                     new Student("def", 02, 'B'),
        //                 };
        Student stud1 = new Student("ABC",01,'A');

        System.out.print(stud1);
    }
}
/*This Student class demonstrates how to override toString() to display object details cleanly. 
The class has three fields: rollno (integer), grade (character), and name (string). 
The constructor initializes these fields when a Student object is created. 
The overridden toString() method formats these fields into a structured string (e.g., "Student: [Name=ABC, RollNo=1, Grade=A]"). 
In the main method, a Student object (stud1) is created with sample data ("ABC", 01, 'A'). 
When System.out.print(stud1) executes, it implicitly calls stud1.toString(), printing the formatted string instead of the default memory address. */