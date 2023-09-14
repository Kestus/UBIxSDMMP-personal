package model;

import java.util.ArrayList;
import java.util.List;

public class Meeting extends Event {
    private List<String> attendees;

    public Meeting(String label, Date date, Time time) {
        super(label, date, time);
        this.attendees = new ArrayList<String>();
    }

    public List<String> getAttendees() {
        return attendees;
    }

    public void addAttendee(String name){
        attendees.add(name);
    }

    public void removeAttendee(String name){
        if (attendees.contains(name)){
            attendees.remove(name);
        }
    }

    public void sendInvites(){
        for (String attendee : attendees){
            System.out.println("Sending invite to "+attendee+"...");
        }
        System.out.println("Invites sent!");
    }
}
