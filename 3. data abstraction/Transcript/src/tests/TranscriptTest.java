package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TranscriptTest {
    private Transcript testTranscript;

    @Before
    public void setUp(){
        testTranscript = new Transcript("Student Name", 1000);
        //TODO: write new values in testTranscript constructor
    }

    @Test
    public void TestAddGrade() {
        assertEquals(testTranscript.getStudentGrades().size(), 0);
        testTranscript.addGrade("TEST", 0000);
        assertEquals(testTranscript.getStudentGrades().size(),1);
    }




}
