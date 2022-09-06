public class WaitingRoom1 extends WaitingRoom {
    @Override
    void askedToGoToWaitingRoom(Student student) {
            System.out.println("\nStudent "+student.getName()+" "+student.getReg_number()+" will be asked to go to Waiting Room 1");
            if(!student.getReg_number().split("/")[1].equals("21")){
                Lab l4 = new Lab4(student);
                l4.directToLab();
            } else {
                Lab l1 = new Lab1(student);
                l1.directToLab();
            }

    }
}
