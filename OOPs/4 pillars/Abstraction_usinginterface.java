//Abstraction (using interface) -
/*In Java, an interface is a pure form of abstraction that defines what actions a class can perform (method signatures) 
without specifying how they are implemented. It acts as a contract, forcing implementing classes to provide concrete 
implementations for all declared methods. This hides implementation details and exposes only functionality, enabling 
polymorphism and loose coupling. */
interface Actions {
    void attack();

    void jump();
}

class Archer implements Actions {
    @Override
    public void attack() {
        System.out.print("The archer going to attack\n");
    }

    @Override
    public void jump() {
        System.out.print("The archer going to jump\n");
    }
}

class Warrior implements Actions {
    @Override
    public void attack() {
        System.out.print("The warrior going to attack\n");
    }

    @Override
    public void jump() {
        System.out.print("The warrior going to jump\n");
    }
}

public class Abstraction_usinginterface {
    public static void main(String[] args) {
        Archer a1 = new Archer();
        Warrior w1 = new Warrior();

        a1.attack();
        a1.jump();

        w1.attack();
        w1.jump();
    }
}
/*This code demonstrates abstraction through interfaces in Java. 
The Actions interface defines what operations are possible (attack() and jump()) without specifying how they work, 
creating a contract that implementing classes must follow. Both Archer and Warrior classes implement this interface but
provide their own unique implementations - the archer's actions are different from the warrior's,
yet both satisfy the same interface requirements. In the Playable class's main method, we create instances of each character type
and call their methods, resulting in different behaviors (archer-specific and warrior-specific outputs) while using the same method names.
This showcases the power of interface abstraction - it hides the specific implementation details of each character while guaranteeing
they'll have the required capabilities. The output clearly shows this polymorphic behavior, with each character performing attacks and jumps
in their own distinctive way while adhering to the common Actions interface structure. 
This approach makes the code flexible and extensible, allowing easy addition of new character types in the future. */