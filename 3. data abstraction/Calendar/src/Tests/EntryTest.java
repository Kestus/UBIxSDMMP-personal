package Tests;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EntryTest {
    Event testEvent1;
    Event testEvent2;

    Meeting testMeeting1;
    Meeting testMeeting2;

    Reminder testReminder1;
    Reminder testReminder2;
    Date testDate;


    @Before
    public void setupEntryTest(){
        testDate = new Date(1, Month.JANUARY, 2000);

        testEvent1 = new Event("Test Event 1", testDate, new Time(1, 11));
        testEvent2 = new Event("Test Event 2", testDate, new Time(11, 22));
        testMeeting1 = new Meeting("Test Meeting 1", testDate, new Time(4, 40));
        testMeeting2 = new Meeting("Test Meeting 2", testDate, new Time(14, 44));
        testReminder1 = new Reminder("Test Reminder 1", testDate, new Time( 8, 50), "Soon");
        testReminder2 = new Reminder("Test Reminder 2", testDate, new Time(18, 48), "Almost there!");
    }

    @Test
    public void testGetters(){
        assertEquals(testEvent1.getDate(), testDate);
    }


    @Test
    public void testRepeatInterval(){
        testEvent1.setRepeatInterval(4);
        assertTrue(testEvent1.getIsRepeating());
        assertEquals(testEvent1.getRepeatInterval(), 4);
        testEvent1.removeRepeatInterval();
        assertFalse(testEvent1.getIsRepeating());
        assertEquals(testEvent1.getRepeatInterval(), 0);
    }

    @Test
    public void testReminders(){
        testMeeting2.setReminder(testReminder1);
        assertEquals(testMeeting2.getReminder(), testReminder1);
    }

    @Test
    public void testAttendees(){
        testMeeting1.addAttendee("Bob");
        assertTrue(testMeeting1.getAttendees().contains("Bob"));
        testMeeting1.addAttendee("Jim");
        assertTrue(testMeeting1.getAttendees().contains("Jim"));
        testMeeting1.removeAttendee("Bob");
        assertFalse(testMeeting1.getAttendees().contains("Bob"));
    }

    @Test
    public void testNotes(){
        assertEquals(testReminder1.getNotes(), "Soon");
        testReminder1.setNote("Now");
        assertEquals(testReminder1.getNotes(), "Now");
    }

}
