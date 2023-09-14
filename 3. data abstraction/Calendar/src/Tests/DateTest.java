package Tests;

import model.Date;
import model.Month;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateTest {
    Date testDate;

    @Before
    public void setupDateTest(){
        testDate = new Date(1, Month.JANUARY, 2000);
    }

    @Test
    public void testGetters(){
        assertEquals(testDate.getDay(), 1);
        assertEquals(testDate.getMonth(), Month.JANUARY);
        assertEquals(testDate.getYear(), 2000);
        assertEquals(testDate.getDateShort(), "1/1/2000");
        assertEquals(testDate.getDateLong(), "January 1, 2000");
    }

    @Test
    public void testSetters(){
        testDate.setDay(4);
        assertEquals(testDate.getDay(), 4);
        testDate.setMonth(Month.APRIL);
        assertEquals(testDate.getMonth(), Month.APRIL);
        testDate.setYear(2004);
        assertEquals(testDate.getYear(), 2004);
    }

}
