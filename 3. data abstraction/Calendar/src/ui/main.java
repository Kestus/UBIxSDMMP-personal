package ui;

import model.*;

public class main {
    public static void main(String[] args) {
        Date currentDate = new Date(12, Month.JULY, 2022);
        String email = "mail@email.com";

        Calendar myCalendar = new Calendar(currentDate, email);

        Time meetingTime1 = new Time(22, 00);
        Meeting meeting1 = new Meeting("Meeting 1", currentDate, meetingTime1);
        meeting1.addAttendee("Bob");
        meeting1.addAttendee("Jim");

        myCalendar.addEntry(meeting1);
        for (Meeting meeting : myCalendar.getMeetings()) {
            meeting.sendInvites();
        }
    }
}
