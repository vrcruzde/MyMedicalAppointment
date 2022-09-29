import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Victor Cruz","Cardiology");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient myPatient = new Patient("Alejandro Cruz","acruz@desarrollo.com");

    }


}