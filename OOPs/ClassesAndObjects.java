    public class ClassesAndObjects {
    String name;
    String Color;
    void details(){
        System.out.print("Name of Car: "+this.name+" color is "+this.Color);
    }
    public static void main(String[] args) {
        ClassesAndObjects car1 = new ClassesAndObjects();
        car1.name = "Mustang";
        car1.Color = "Black";
        car1.details();
    }
}

