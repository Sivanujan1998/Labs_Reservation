import java.util.ArrayList;
import java.util.List;

public class Lab1 extends Lab {
    private static int totalcomputer=5;
    private  static  List<String> Lab1Attendence = new ArrayList<>();;
    private Student student;

    public Lab1(Student student) {
        this.student = student;
    }
    public Lab1(){

    }
    @Override
    void directToLab() {
        System.out.println(student.getName()+" "+student.getReg_number()+" selected for Lab1");
        if(totalcomputer>0) {
            totalcomputer--;
            System.out.println("Please leave your belongings here and go to Lab 1");
            printAttendanceSheet();
        } else {
            System.out.println("Lab is full, please go to Lab 2");
            Lab l2 = new Lab2(student);
            l2.directToLab();
        }

    }

    @Override
    void printAttendanceSheet() {
        Lab1Attendence.add(student.getReg_number().replaceAll("/","")+" "+student.getName()+" "+student.getStatus());
    }

    @Override
    List<String> getAttendanceSheet() {
        return Lab1Attendence;
    }
}
