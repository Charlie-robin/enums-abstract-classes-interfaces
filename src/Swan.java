public class Swan extends Animal implements CanFly{

    @Override
    public AnimalType getType() {
        return AnimalType.SWAN;
    }

    @Override
    public void fly() {
        System.out.println("Flapping");
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }
}
