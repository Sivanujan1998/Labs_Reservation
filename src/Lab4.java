import java.util.ArrayList;
import java.util.List;

public class Lab4 extends Lab {
    private static int totalcomputer=3;
    private  static List<String> Lab4Attendence = new ArrayList<>();;
    private Student student;

    public Lab4(Student student) {
        this.student = student;
    }

    public Lab4(){

    }

    @Override
    void directToLab() {
        System.out.println(student.getName()+" "+student.getReg_number()+" selected for Lab4");
        if(totalcomputer>0) {
            totalcomputer--;
            System.out.println("Please leave your belongings here and go to Lab 4");
            printAttendanceSheet();
        } else {
            System.out.println("Lab is full");
        }
    }

    @Override
    void printAttendanceSheet() {
        Lab4Attendence.add(student.getReg_number().replaceAll("/","")+" "+student.getName()+" "+student.getStatus());
    }

    @Override
    List<String> getAttendanceSheet() {
        return Lab4Attendence;
    }
}
