package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    private  String speciality;
    //Coleccion de objetos
    //Cada vez que se agrege un nueva cita se estara acumulado en el array
    private ArrayList<AvailableAppointment>availableAppointments = new ArrayList<>();

    // Comportamientos

    public Doctor (String name, String email){
        super(name, email);
        
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado de Clinica la Estancia");
        System.out.println("Departamentos: Imagenologia");

    }


    public void addAvailableAppointment(String date, String time){ //metodo para disponibilidad de citas

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
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");// no ayuda a dar formato y trabajar con fechas

        public AvailableAppointment(String date,String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
               e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE){
            return date;
        }
        public String getDate() {
            return format.format(date);
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
