package model;

public class Nurse extends User{

    private String speciality;

    public Nurse(String name, String email, String speciality) {
        super(name, email);

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado de Hospital Susana lopez de Valencia");
        System.out.println("Departamentos: Cirugia, UCI");
    }
}
