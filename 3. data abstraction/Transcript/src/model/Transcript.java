package model;


import java.util.ArrayList;

import static java.lang.Math.round;


public class Transcript {

    String studentName;
    int studentID;
    ArrayList<Grade> grades;

    public Transcript(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.grades = new ArrayList<Grade>();
    }

    // getters
    //EFFECTS: return student's name
    public String getStudentName() { return this.studentName; }
    //EFFECTS: return student's ID
    public int getStudentID() { return this.studentID; }
    //EFFECTS: return array of student's grades
    public ArrayList<Grade> getStudentGrades() { return this.grades; }

    // setters
    //MODIFIES: this
    //EFFECTS: set student name
    public void setStudentName(String studentName) { this.studentName = studentName; }
    //MODIFIES: this
    //EFFECTS:set student ID
    public void setStudentID(int studentID) { this.studentID = studentID; }


    //MODIFIES: this
    //EFFECTS:  add course with grade to this
    //          return nothing
    public void addGrade(String course, double grade){
        Grade newGrade = new Grade(course, grade);
        grades.add(newGrade);
    }

    //EFFECTS: return string representing course and it's grade, return null if doesn't exist
    public String getCourseAndGrade(String course){
        for (Grade g : grades) {
            if (g.getCourseName() == course) {
                return "|  " + "Course: [" + g.getCourseName() + "] Grade: " + g.getCourseGrade() + "  |";
            }
        }
        return null;
    }

    //EFFECTS: print out transcript
    public void printTranscript(){
        System.out.println("-----------------------------------");
        for (Grade g : grades){
            System.out.println(getCourseAndGrade(g.getCourseName()));
            System.out.println("-----------------------------------");
        }
    }

    //EFFECTS: return average grade
    public double getGPA(){
        double sum = 0;
        int count = grades.size();

        for (Grade g : grades) {
            sum += g.getCourseGrade();
        }
        return sum/count;
    }

    //TODO: specification
    //
    public double calculateAverage(ArrayList<String> selectedGrades){
        
        return 0.0;
        //once you complete this method, figure out how to add it as a helper to getGPA()
    }

    //TODO: specification
    //
    public double getGradeByCourse(String course){
        return 0.0;
        //this method should return the grade for the given course parameter
    }

    //TODO: specification
    //
    public double getAverageOverSelectedCourses(List<String> selectedCourses){
        return 0.0;
        //think about which method you can call as a helper!
    }


}

