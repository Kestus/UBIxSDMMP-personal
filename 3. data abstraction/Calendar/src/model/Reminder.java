package model;

import java.util.ArrayList;
import java.util.List;

public class Reminder extends Entry {
    private String note;


    public Reminder(String label, Date date, Time time, String note) {
        super(label, date, time);
        this.note = note;
    }

    public String getNotes() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
