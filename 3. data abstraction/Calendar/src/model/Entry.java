package model;

public abstract class Entry {
    private String label;
    private Date date;
    private Time time;
    private boolean isRepeating;
    private int repeatInterval;


    public Entry(String label, Date date, Time time){
        this.label = label;
        this.date = date;
        this.time = time;
        this.repeatInterval = 0;
        isRepeating = false;
    }

    // GETTERS:
    public Date getDate() {
        return date;
    }
    public String getLabel() {
        return label;
    }
    public Time getTime() {
        return time;
    }
    public int getRepeatInterval() {
        return repeatInterval;
    }
    public boolean getIsRepeating(){
        return isRepeating;
    }

    public void setRepeatInterval(int interval) {
        isRepeating = true;
        repeatInterval = interval;
    }
    public void removeRepeatInterval(){
        isRepeating = false;
        this.repeatInterval = 0;
    }
}
