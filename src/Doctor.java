public class Doctor {
    //Atributos
    static int id = 0;  // debe ser autoincrementado por cada Doctor aumenta su valor y el primer valor cera O
    String name;
    String email;
    String speciality;

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
}
