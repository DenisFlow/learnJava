package b4_Overloading;

/*
Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
You should validate that the first parameter minutes is >= 0.
You should validate that the 2nd parameter seconds is >= 0 and <= 59.
The method should return “Invalid value" in the method if either of the above are not true.
If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format "XXh YYm ZZs" where XX represents a number of hours, YY the minutes and ZZ the seconds.

Create a 2nd method of the same name but with only one parameter seconds.
Validate that it is >= 0, and return "Invalid value" if it is not true.
If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
*/

public class b4_2_Task {
    private static final long SEC_TO_HOURS = 3600L;
    private static final String INVALID_MSG = "Invalid value";

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0L || seconds < 0L || seconds > 59L)
            return INVALID_MSG;
        return calculationsTime(seconds + minutes * 60L);
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0L)
            return INVALID_MSG;
        return calculationsTime(seconds);
    }

    private static String calculationsTime(long seconds) {

        long hours = seconds / SEC_TO_HOURS;
        seconds %= SEC_TO_HOURS;
        long minutes = seconds / 60L;
        seconds %= 60L;
        return hours + "h " + minutes + "m " + seconds + "s";
    }
}
