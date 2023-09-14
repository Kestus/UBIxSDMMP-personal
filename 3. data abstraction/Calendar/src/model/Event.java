package model;


public class Event extends Entry {
    private Entry reminder;

    public Event(String label, Date date, Time time) {
        super(label, date, time);
    }

    public Entry getReminder() {
        return reminder;
    }
    public void setReminder(Entry reminder) {
        this.reminder = reminder;
    }
}
