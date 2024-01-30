public class DayOfWeekStatic {

    public static final int MONDAY = 0;
    public static final int TUESDAY = 1;
    public static final int WEDNESDAY = 2;
    public static final int THURSDAY = 3;
    public static final int FRIDAY = 4;
    public static final int SATURDAY = 5;
    public static final int SUNDAY = 6;

    // USE ENUM VALUE AS A TYPE
    private DayOfWeek dayOfWeek;

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    // USE WITH STATIC
    //    public void setDayOfWeek(int dayOfWeek) {
//        this.dayOfWeek = dayOfWeek;
//    }
}