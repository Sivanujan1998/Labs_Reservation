import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public List<Student> GetStudentDetails() {
        List<Student> studentList = new ArrayList<>();;
        try {
            File myObj = new File("student_details.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Student s = new Student(data.split(" ")[0], data.split(" ")[1], data.split(" ")[2], data.split(" ")[3]);
                studentList.add(s);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return studentList;
    }
    public void createAttendenceList(){
        try {
            Lab l1 = new Lab1();
            Lab l2 = new Lab2();
            Lab l4 = new Lab4();
            Lab l5 = new Lab5();

            FileWriter myWriter = new FileWriter("AttendanceSheet.txt");
            myWriter.write("Attendance Sheet of Lab 1 ");
            myWriter.write("\n");
            for (int i=0;i < l1.getAttendanceSheet().size();i++){
                myWriter.write(l1.getAttendanceSheet().get(i));
                myWriter.write("\n");
            }

            myWriter.write("\n");
            myWriter.write("Attendance Sheet of Lab 5 ");
            myWriter.write("\n");
            for (int i=0;i < l5.getAttendanceSheet().size();i++){
                myWriter.write(l5.getAttendanceSheet().get(i));
                myWriter.write("\n");
            }

            myWriter.write("\n");
            myWriter.write("Attendance Sheet of Lab 2 ");
            myWriter.write("\n");
            for (int i=0;i < l2.getAttendanceSheet().size();i++){
                myWriter.write(l2.getAttendanceSheet().get(i));
                myWriter.write("\n");
            }

            myWriter.write("\n");
            myWriter.write("Attendance Sheet of Lab 4 ");
            myWriter.write("\n");
            for (int i=0;i < l4.getAttendanceSheet().size();i++){
                myWriter.write(l4.getAttendanceSheet().get(i));
                myWriter.write("\n");
            }

            myWriter.close();
            System.out.println("\nSuccessfully wrote to the file AttendanceSheet.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

