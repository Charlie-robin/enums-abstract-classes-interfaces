public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Duck duck = new Duck();
        Cow cow = new Cow();
        Swan swan = new Swan();
        // GROUPING / INTERACTING WITH OBJECT BY FUNCTIONALITY
        CanMakeSound canMakeSound = duck;
        canMakeSound = dog;
        canMakeSound.makeSound(); // WE HAVE ONLY THE METHODS ON THE INTERFACE
        // USE CASTING TO GO BACK FROM A INTERFACE TYPE
        dog = (Dog) canMakeSound;

        if(cow instanceof Animal){
            System.out.println("Is a Animal");
        }

        if(cow instanceof CanMakeSound){
            System.out.println("Implements CanMakSound");
        }

        if(cow instanceof CanFly){
            System.out.println("Implements CanFly");
        }

        Farm farm = new Farm();
        System.out.println("Animals...");
        System.out.println(farm.getAnimals());
        System.out.println("-".repeat(10));
        System.out.println("Makes sound...");
        System.out.println(farm.getAnimalsThatMakeSound());
        System.out.println("-".repeat(10));
        System.out.println("Can Fly...");
        System.out.println(farm.getAnimalsThatFly());
        System.out.println("-".repeat(10));
        System.out.println("Both...");
        System.out.println(farm.getAnimalsThatFlyAndMakeSound());


    }

    public static void abstractClasses(){
        Animal dog = new Dog();
        Cow cow = new Cow();
        System.out.println(cow.getType());
//        Animal animal = new Animal(); // ?? ONCE ABSTRACT IT CAN NOT BE INITIALISED
    }

    public static void enums(){
        //       DayOfWeekStatic dayOfWeekStatic = new DayOfWeekStatic();
//       dayOfWeekStatic.setDayOfWeek(DayOfWeekStatic.MONDAY);
//       dayOfWeekStatic.setDayOfWeek(45); // NO CHECK ON THE VALUE OF THE CONSTANT

        DayOfWeekStatic dayOfWeekStatic = new DayOfWeekStatic();
        // WE ARE FORCED TO USE ONE OF THE ENUMS CONSTANT VALUES
        dayOfWeekStatic.setDayOfWeek(DayOfWeek.MONDAY);

        DayOfWeek userSelection = DayOfWeek.TUESDAY;

        userSelection = DayOfWeek.valueOf("MONDAY"); // CONVERT STRING TO ENUM VALUE

        // CHECK FOR EQUALITY WITH BOTH == & .equals
        if (userSelection == DayOfWeek.TUESDAY){
            System.out.println("This is Tuesday");
        } else if (userSelection.equals(DayOfWeek.MONDAY)) {
            System.out.println("This is Monday");
        }

        // ENUMS READ WELL IN SWITCH STATEMENTS
        switch (userSelection){
            case MONDAY:
                break;
            case TUESDAY:
                break;
            case WEDNESDAY:
                break;
            case THURSDAY:
                break;
            case FRIDAY:
                break;
            case SATURDAY:
                break;
            case SUNDAY:
                break;
        }

        // .values() -> AN ARRAY OF THE CONSTANT VALUES
        for (DayOfWeek day : DayOfWeek.values()){
            System.out.println(day + " is " + (day.isWeekend() ? " " : " not ") + "the weekend");
        }
    }
}