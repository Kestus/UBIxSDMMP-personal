package ui;

import model.Transcript;

public class main {
    public static void main(String[] args) {
        Transcript t1 = new Transcript("Jane Doe", 7830);
        Transcript t2 = new Transcript("Ada Lovelace", 8853);
        //TODO: create another Transcript object
        Transcript t3 = new Transcript("Joe Bob", 3942);

        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("ENGL-201", 4.0);
        t1.addGrade("CPSC-110", 3.1);

        //TODO: add grades to the other Transcript objects
        t2.addGrade("IREP-222", 3.2);
        t2.addGrade("NFJE-595", 4.5);
        t2.addGrade("OOER-516", 2.8);

        t3.addGrade("IREP-222", 4.4);
        t3.addGrade("BBEQ-996", 3.2);
        t3.addGrade("MAYT-110", 2.0);


        System.out.print(t1.getStudentName() + ": "+"\n");
        t1.printTranscript();
        System.out.println("GPA: "+t1.getGPA()+"\n");


        //TODO: add more use cases here
        System.out.print(t2.getStudentName() + ": "+"\n");
        t2.printTranscript();
        System.out.println("GPA: "+t2.getGPA()+"\n");

        System.out.print(t3.getStudentName() + ": "+"\n");
        t3.printTranscript();
        System.out.println("GPA: "+t3.getGPA()+"\n");

    }
}
