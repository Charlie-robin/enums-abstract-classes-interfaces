import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Farm {

    private  List<Animal> animals = new LinkedList<>();

    public Farm() {
        animals.add( new Cow() );
        animals.add( new Duck() );
        animals.add( new Swan() );
        animals.add( new Dog() );
//        this.animals = new ArrayList<>(List.of(new Cow(), new Duck(), new Swan(), new Dog()));
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<CanMakeSound> getAnimalsThatMakeSound() {
        List<CanMakeSound> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof CanMakeSound) {
                result.add((CanMakeSound) animal);
            }
        }
        return result;
    }

    public List<CanFly> getAnimalsThatFly() {
        List<CanFly> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof CanFly) {
                result.add((CanFly) animal);
            }
        }
        return result;
    }

    public List<Animal> getAnimalsThatFlyAndMakeSound() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if ( animal instanceof CanMakeSound || animal instanceof CanFly) {
                result.add(animal);
            }
        }
        return result;
    }

}