
// CAN NOT BE INITIALISED HAS TO BE INHERITED FROM
// - CORE FUNCTIONALITY -> NEED TO USE YOUR SUB CLASSES
public abstract class Animal {
    private String name;
    private AnimalType type;

    // NOT EVERYTHING NEEDS TO BE ABSTRACT CAN STILL HAVE IMPLEMENTATIONS OF METHODS
    public String getName() {
        return name;
    }

    // ABSTRACT METHOD
    // - NO IMPLEMENTATION -> SUB CLASSES HAVE TO IMPLEMENT IT.
    public abstract AnimalType getType();
}