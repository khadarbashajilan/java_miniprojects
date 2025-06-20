// 2. Polymorphism
/*
 * Polymorphism in Java allows objects of different classes to be treated as objects of a common superclass, 
 * enabling one interface with multiple implementations. It lets a single method or reference behave differently based on the actual object type, 
 * promoting flexibility and code reusability.
 */
class Animal{
    void makesSound(){
        System.out.print("Animal Makes sound \n");
    }
}

class Cat extends Animal{
    @Override
    void makesSound(){
        System.out.print("Meow\n");
    }
}

class Dog extends Animal {
    @Override
    void makesSound(){
        System.out.print("Bark!");
    }
    void fetch(){
        System.out.print("Dog fetches the stick\n");
    }
    void fetch(String item){
        System.out.print("Dog fetches the "+item+"!");
    }
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        cat1.makesSound();

        Dog dog1 = new Dog();
        dog1.makesSound();
        System.out.println();
        dog1.fetch();
        dog1.fetch("Hi");
    }
}

/*
 * Method Overriding (Runtime Polymorphism)
    Occurs when a subclass provides a specific implementation of a method already defined in its superclass.
    Requires same method name, return type, and parameters as the parent class.
    Annotated with @Override for clarity (optional but recommended).
Example: Dog overriding makesSound() to print "Bark!" instead of the generic "Animal makes sound".
 */

 /*
  * Method Overloading (Compile-Time Polymorphism)
    Occurs when multiple methods share the same name but differ in parameters (type, number, or order).
    Resolved at compile time based on the method signature.
Example: Dog’s fetch() and fetch(String item) are overloaded to handle different inputs.
  */

//   Key Difference: Overriding redefines behavior in a subclass, while overloading expands functionality in the same class.