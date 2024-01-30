
// implements INTERFACE, INTERFACE
// CONCRETE CLASS
public class Duck extends Animal implements CanFly, CanMakeSound {
    @Override
    public AnimalType getType() {
        return AnimalType.DUCK;
    }

    @Override
    public void fly() {
        System.out.println("Flap flap");
    }

    @Override
    public void land() {
        System.out.println("Landing...");
    }

    @Override
    public void makeSound() {
        System.out.println("Quack Quack");
    }

    @Override
    public String getSound() {
        return "Quack";
    }
}
