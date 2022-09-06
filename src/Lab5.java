import java.util.ArrayList;
import java.util.List;

public class Lab5 extends Lab {
    private static int totalcomputer=3;
    private  static List<String> Lab5Attendence = new ArrayList<>();;
    private Student student;

    public Lab5(Student student) {
        this.student = student;
    }

    public Lab5(){

    }
    @Override
    void directToLab() {
        System.out.println(student.getName() + " " + student.getReg_number() + " selected for Lab5");
        if(totalcomputer>0) {
            totalcomputer--;
            System.out.println("Please leave your belongings here and go to Lab 5");
            printAttendanceSheet();
        } else {
            System.out.println("Lab is full, please go to Lab 2");
            Lab l2 = new Lab2(student);
            l2.directToLab();
        }
    }

    @Override
    void printAttendanceSheet() {
        Lab5Attendence.add(student.getReg_number().replaceAll("/","")+" "+student.getName()+" "+student.getStatus());
    }

    @Override
    List<String> getAttendanceSheet() {
        return Lab5Attendence;
    }
}
