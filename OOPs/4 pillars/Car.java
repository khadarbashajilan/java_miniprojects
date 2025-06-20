// 1. Inheritance 
/*
 * Inheritance is an OOP concept where a subclass (child class) inherits fields and methods from a superclass (parent class), 
   enabling code reuse and establishing a hierarchical relationship (e.g., "Car is a Vehicle"). The child class can:
    * Extend functionality by adding new properties/methods.
    * Override inherited methods to modify behavior.
    * Use super() to call the parent’s constructor.
Key Benefit: Avoids redundancy by sharing common logic across related classes.
 */
class Vehicle{
    String Brand;
    int Year;
    public Vehicle(String b, int y){
        this.Brand=b;
        this.Year=y;
    }
    void startEngine(){
        System.out.print("Engine starts");
    }
    void displayDetails(){
        System.out.print("The brand is "+Brand+"and the year "+Year);
    }
}
    class Car extends Vehicle{
        int numDoors;
        public Car(String b, int y, int n){
            super(b,y);
            this.numDoors=n;
        }
        @Override
        void displayDetails(){
        System.out.print("The brand is "+Brand+"and the year "+Year+" number of doors "+numDoors);
    }
    
        public static void main(String[] args) {
            Car car1 = new Car("Benz", 2004, 8);
            car1.startEngine();
            car1.displayDetails();
    }
    }
    
/*Inheritance in Java allows a child class (like Car) to reuse properties and methods from a parent class (like Vehicle),
 promoting code efficiency and logical hierarchy. In your example, Car extends Vehicle, inheriting its Brand and
  Year fields while adding its own (numDoors). The super(b, y) call in Car’s constructor ensures the parent’s fields are initialized first.
  By overriding displayDetails(), the child class customizes the method to include numDoors, demonstrating polymorphism. 
  Inheritance establishes an "is-a" relationship (e.g., a Car is a Vehicle) and reduces redundancy. */