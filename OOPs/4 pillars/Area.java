//Abstraction (using abstract keyword):
/*Abstraction in Java is a fundamental OOP concept that focuses on hiding implementation details while exposing only essential features to users. 
    It's achieved through abstract classes and interfaces(DISCUSSED IN NEXT ONE "Playable.java"), allowing developers to define what an object does without specifying how it does it. 
    Abstract classes can contain both abstract methods (without implementation) and concrete methods (with implementation), serving as blueprints 
    for subclasses that must provide specific implementations for the abstract methods.
 */ 
class Triangle extends Area {
    int breadth;
    int height;

    Triangle(int height, int breadth) {
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return 0.5 * height * breadth;
    }
}

class Rectangle extends Area {
    int height;
    int width;

    Rectangle(int h, int w) {
        this.height = h;
        this.width = w;
    }

    @Override
    double area() {
        return height * width;
    }
}

class Circle extends Area {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

}

public abstract class Area {
    //abstract method
    abstract double area();
    //concrete method (inheritent)
    void display(){
        System.out.print("\nClass Area");
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Triangle t1 = new Triangle(2, 2);
        Rectangle r1 = new Rectangle(2, 2);

        System.out.print(r1.area());
        c1.display();
    }
}
/*This Java code demonstrates abstraction using an abstract Area class containing both abstract and concrete elements. 
The abstract area() method has no implementation, forcing subclasses like Triangle,Rectangle and Circle to provide
 their own concrete implementations - Triangle calculates area as (0.5 × base × height), Rectangle uses (length × width), 
 and Circle uses (π × radius²). The Area class also includes a concrete display() method (fully implemented with code that prints "Class Area"),
showing how abstract classes can mix unimplemented and implemented methods. 
 When executed, the code creates instances of each shape class (all concrete since they implement all abstract methods), calls r1.area() 
 to calculate and print the rectangle's area (4.0), and demonstrates inherited concrete method usage via c1.display(). 
 This structure highlights abstraction's core principles: hiding implementation details (each shape's unique area formula) 
 while exposing consistent functionality (the area() method contract), with abstract methods defining requirements and concrete methods 
 providing reusable default behavior. The display() method specifically illustrates how concrete methods in abstract classes offer immediate, 
 inheritable functionality without requiring subclass implementation.

 */