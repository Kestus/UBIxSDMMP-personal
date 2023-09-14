package model;

public class Grade {
    private String courseName;
    private double courseGrade;

    public Grade(String course, double grade){
        this.courseName = course;
        this.courseGrade = grade;
    }

    // getters
    //EFFECTS:  return name of the course
    public String getCourseName() {
        return this.courseName;
    }
    //EFFECTS:  return grade of the course
    public double getCourseGrade() {
        return this.courseGrade;
    }
}
