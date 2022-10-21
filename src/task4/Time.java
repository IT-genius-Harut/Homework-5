package task4;

public class Time {
    private int hour;
    private int minutes;
    private int seconds;

    public Time() {}

    public Time(int hour, int minutes, int seconds){
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Hour(s) is: " + hour + " minute(s) is: " + minutes + " second(s) is: " + seconds;
    }
}
