package model;

public class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    // GETTERS:
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public String getTimeString(){
        return hours+":"+minutes;
    }


    // SETTERS:
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }


    public double getTimeValue(){
        return hours + (minutes * 0.01);
    }


}
