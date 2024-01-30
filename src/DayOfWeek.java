// ENUMS ARE TREATED A SINGULAR VALUE
public enum DayOfWeek {
    // GROUPING / STORING CONSTANT VALUES ON A TYPE
    // - ADD VALUES FOR CONSTRUCTOR
    MONDAY , TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY(true), SUNDAY(true);
    // VALUE ASSOCIATED WITH A CONSTANT
    private boolean weekend;

    // CONSTRUCTOR
    // - OVERLOAD SO DO NOT HAVE TO PASS IN TRUE / FALSE EVERYTIME
    DayOfWeek(){
      this.weekend = false;
    }

    DayOfWeek(boolean weekend) {
        this.weekend = weekend;
    }

    // ALLOWING CONTROLLED ACCESS
    // - ENCAPSULATION
    public boolean isWeekend() {
        return weekend;
    }
}
