package Tests;

import model.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {
    Time testTime1;
    Time testTime2;

    @Before
    public void setupTimeTest(){
        testTime1 = new Time(1, 11);
        testTime2 = new Time(2, 22);
    }

    @Test
    public void testGetters(){
        assertEquals(testTime1.getTimeString(), "1:11");
        assertEquals(testTime1.getMinutes(), 11);
        assertEquals(testTime1.getHours(), 1);
    }

    @Test
    public void testSetters(){
        testTime1.setHours(5);
        assertEquals(testTime1.getHours(), 5);
        testTime1.setMinutes(55);
        assertEquals(testTime1.getMinutes(), 55);
        assertEquals(testTime1.getTimeString(), "5:55");
    }

    @Test
    public void testGetTimeValue(){
        assertEquals(testTime1.getTimeValue(), 1.11, 0.01);
        assertEquals(testTime2.getTimeValue(), 2.22, 0.01);
        assertTrue(testTime1.getTimeValue() < testTime2.getTimeValue());
    }
}
