class Animals{
    String name;

    public Animals (String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating generic food. ");
    }
}

class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    public  void bark() {
        System.out.println(name + " says woof!");
    }

    @Override
    public void eat() {
        System.out.println(name + " the dog is eating kibble .");
    }
}

public class Main {
    public static void main(String[] args){
        Dog myDog = new Dog("Buddy");

        myDog.eat();
        myDog.bark();
    }
}