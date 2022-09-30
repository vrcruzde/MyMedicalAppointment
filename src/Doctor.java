import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0;  // debe ser autoincrementado por cada Doctor aumenta su valor y el primer valor cera O
    private String name;
    private String email;
    private  String speciality;



    // Comportamientos

    Doctor (){
        System.out.println("Contruyendo el objeto Doctor");

    }
    Doctor (String name, String speciality){
        System.out.println("El nombre del doctor asignado es"+ name);
        id++;
        this.name = name;// Hace referencia a todos los elementos que componen esa clase
        this.speciality = speciality;
    }
    public void showName(){
        System.out.println(name);
    }

    public void showIde(){
        System.out.println("ID Doctor:  "+id);
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
        //Doctor define fechas en las que esta disponible
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
