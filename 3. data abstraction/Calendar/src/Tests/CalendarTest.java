package Tests;

import model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CalendarTest {
    Calendar testCalendar;
    Entry testEntry1;
    Entry testEntry2;
    Entry testEntry3;
    Entry testEntry4;
    Date testSetupDate;
    String email = "mail@email.com";

    @Before
    public void setupCalendarTest(){
        testSetupDate = new Date(3, Month.APRIL, 2000);
        testCalendar = new Calendar(testSetupDate, email);

        Time testTime1 = new Time(1, 11);
        testEntry1 = new Event("TestEntry1 Event", testSetupDate, testTime1);
        Time testTime2 = new Time(2, 22);
        testEntry2 = new Meeting("TestEntry2 Meeting", testSetupDate, testTime2);
        Time testTime3 = new Time(12, 0);
        testEntry3 = new Event("TestEntry3 Event", testSetupDate, testTime3);
        Time testTime4 = new Time(12, 30);
        testEntry4 = new Meeting("TestEntry4 Meeting", testSetupDate, testTime4);

        testCalendar.addEntry(testEntry4);
        testCalendar.addEntry(testEntry3);
        testCalendar.addEntry(testEntry2);
        testCalendar.addEntry(testEntry1);
    }


    @Test
    public void testGetters(){
        assertEquals(testCalendar.getCurrentDate(), testSetupDate);
        assertEquals(testCalendar.getEmail(), email);
        assertTrue(testCalendar.getEntryList().contains(testEntry1));
        assertTrue(testCalendar.getEntryList().contains(testEntry2));
        assertTrue(testCalendar.getEntryList().contains(testEntry3));
        assertTrue(testCalendar.getEntryList().contains(testEntry4));
        assertTrue(testCalendar.getEntryNames().contains(testEntry1.getLabel()));
        assertTrue(testCalendar.getEntryNames().contains(testEntry2.getLabel()));
        assertTrue(testCalendar.getEntryNames().contains(testEntry3.getLabel()));
        assertTrue(testCalendar.getEntryNames().contains(testEntry4.getLabel()));
    }

    @Test
    public void testRemoveEntry(){
        assertTrue(testCalendar.getEntryList().contains(testEntry1));
        testCalendar.removeEntry(testEntry1);
        assertFalse(testCalendar.getEntryList().contains(testEntry1));
    }

    @Test
    public void testGetSoonestEntry(){
        assertEquals(testCalendar.getFirstEntry(), testEntry4);
        assertEquals(testCalendar.getSoonestEntry(), testEntry1);
    }

    @Test
    public void testGetEntryByName(){
        assertEquals(testCalendar.getEntryByName(testEntry2.getLabel()), testEntry2);
        assertEquals(testCalendar.getEntryByName("ABCS"), null);
    }

    @Test
    public void testGetMeetings(){
        List<Meeting> meetings = testCalendar.getMeetings();

        for (Entry entry : meetings) {
            assertTrue(entry instanceof Meeting);
        }
    }
}
