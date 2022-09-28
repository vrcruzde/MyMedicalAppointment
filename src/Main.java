import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name="Alejandro Cruz";
        myDoctor.showName();
        myDoctor.showIde();

        Doctor myDoctorVic=new Doctor();
        myDoctor.showIde();

        showMenu();

    }


}