import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Victor Cruz","Cardiology");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient myPatient = new Patient("Alejandro Cruz","acruz@desarrollo.com");
        myPatient.setWeight(72.3);
        System.out.println(myPatient.getWeight());

        myPatient.setPhoneNumber("12354697");
        System.out.println(myPatient.getPhoneNumber());
    }


}