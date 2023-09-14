package model;



public class Date {
    private int day;
    private Month month;
    private int year;

    public Date(int day, Month month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // SETTERS
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(Month month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // GETTERS
    public int getDay() {
        return day;
    }
    public int getYear() {
        return year;
    }
    public Month getMonth() {
        return month;
    }

    public String getDateShort(){
        return day+"/"+monthToInt()+"/"+year;
    }
    public String getDateLong(){
        return monthToString()+" "+day+", "+year;
    }

    private int monthToInt(){
        return month.ordinal() + 1;
    }
    private String monthToString(){
        String str = month.toString();
        return str.charAt(0)+(str.substring(1).toLowerCase());
    }
}
