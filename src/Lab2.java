import java.util.ArrayList;
import java.util.List;

public class Lab2 extends Lab {
    private static int totalcomputer=5;
    private  static List<String> Lab2Attendence = new ArrayList<>();;
    private Student student;

    public Lab2(Student student) {
        this.student = student;
    }

    public Lab2(){

    }
    @Override
    void directToLab() {
        System.out.println(student.getName()+" "+student.getReg_number()+" selected for Lab2");
        if(totalcomputer>0) {
            totalcomputer--;
            System.out.println("Please leave your belongings here and go to Lab 2");
            printAttendanceSheet();
        } else {
            System.out.println("Lab is full");
        }
    }

    @Override
    void printAttendanceSheet() {
        Lab2Attendence.add(student.getReg_number().replaceAll("/","")+" "+student.getName()+" "+student.getStatus());
    }

    @Override
    List<String> getAttendanceSheet() {
        return Lab2Attendence;
    }
}
