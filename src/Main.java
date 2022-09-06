import java.util.List;

public class Main {
    public static void main(String args[]){
       Driver d = new Driver();
       List<Student> studentDetails = d.GetStudentDetails();
       for(int i=0; i<studentDetails.size();i++) {
           WaitingRoom w1 = new WaitingRoom1();
           WaitingRoom w2 = new WaitingRoom2();
           if (studentDetails.get(i).getStatus().toUpperCase().equals("HOSTEL"))
               w1.askedToGoToWaitingRoom(studentDetails.get(i));
           else if(studentDetails.get(i).getStatus().toUpperCase().equals("HOME"))
               w2.askedToGoToWaitingRoom(studentDetails.get(i));
       }
       d.createAttendenceList();
    }
}
