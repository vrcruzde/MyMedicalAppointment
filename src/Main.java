import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Victor Cruz","Cardiology");
        myDoctor.addAvailableAppointment(new Date(), "4:30pm");
        myDoctor.addAvailableAppointment(new Date(),"5pm");
        myDoctor.addAvailableAppointment(new Date(),"5:30pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate()+""+aA.getTime());
        }

       Patient myPatient = new Patient("Alejandro Cruz","acruz@desarrollo.com");
        System.out.println(myPatient);



    }

}