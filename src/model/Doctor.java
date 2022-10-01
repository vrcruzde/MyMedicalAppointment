package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    private  String speciality;

    // Comportamientos

    public Doctor (String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es:  "+ name);

    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado de Clinica la Estancia");
        System.out.println("Departamentos: Imagenologia");

    }

    //Coleccion de objetos
    //Cada vez que se agrege un nueva cita se estara acumulado en el array
    ArrayList<AvailableAppointment>availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){ //metodo para disponibilidad de citas
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    //nos ayuda a devolver la lista completa de citas
    public ArrayList<AvailableAppointment>getAvailableAppointments(){
        return availableAppointments;
    }
    public static class AvailableAppointment{
        //model.Doctor define fechas en las que esta disponible
        private int id;
        private Date date; //fecha
        private String time;// hora

        public AvailableAppointment(Date date,String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
