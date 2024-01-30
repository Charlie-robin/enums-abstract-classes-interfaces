public class Dog extends Animal implements CanMakeSound{
    @Override
    public AnimalType getType() {
        return AnimalType.DOG;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }

    @Override
    public String getSound() {
        return "woof";
    }
}