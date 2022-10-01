import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Victor Cruz","Cardiology");
        myDoctor.addAvailableAppointment(new Date(), "4:30pm");
        myDoctor.addAvailableAppointment(new Date(),"5pm");
        myDoctor.addAvailableAppointment(new Date(),"5:30pm");


        User user =new Doctor("Victor Cruz", "vruz@cle.com");
        user.showDataUser();

       /* for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate()+""+aA.getTime());
        }
        */
       User user1 = new Patient("Alejandro Cruz","acruz@Hos.com");
        user1.showDataUser();



    }

}