// Multiple Inheritance - 
/*multiple inheritance (a class inheriting behaviors from multiple parent classes) is not supported directly due to
 the diamond problem (ambiguity when two parent classes have the same method). However, Java allows multiple inheritance
through interfaces, where a class can implement multiple interfaces while providing its own implementations for all abstract methods.
This approach ensures loose coupling and polymorphism while avoiding conflicts. */
interface flyable {
    void fly();
}

interface fightable {
    void fight();
}

interface armored {
    void wearArmor();
}

class Superhero implements flyable, fightable, armored {
    String name;

    Superhero(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying with a jetpack!");
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting villains!");
    }

    @Override
    public void wearArmor() {
        System.out.println(name + " equipped battle armor!");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Superhero s1 = new Superhero("IRON-MAN");
        s1.wearArmor();
        s1.fly();
        s1.fight();
    }

}
/*This example demonstrates multiple inheritance using three interfaces—flyable, fightable,
and armored—each declaring a single abstract method (fly(), fight(), and wearArmor() respectively).
The Superhero class implements all three interfaces, meaning it must provide concrete implementations for each method.
The class includes a name field and a constructor to initialize it. The overridden methods (fly(), fight(),
and wearArmor()) print action-specific messages, incorporating the superhero’s name (e.g., "IRON-MAN is flying with a jetpack!").
In the MultipleInheritance class’s main method, a Superhero object (s1) is instantiated with the name "IRON-MAN",
and all three interface methods are called (wearArmor(), fly(), and fight()), producing the expected outputs. */