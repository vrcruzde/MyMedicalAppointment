public class Doctor {
    //Atributos
    static int id = 0;  // debe ser autoincrementado por cada Doctor aumenta su valor y el primer valor cera O
    String name;
    String speciality;

    // Comportamientos

    Doctor (){
        System.out.println("Contruyendo el objeto Doctor");
        id++;
    }
    Doctor (String name){
        System.out.println("El nombre del doctor asignado es"+ name);
    }
    public void showName(){
        System.out.println(name);
    }

    public void showIde(){
        System.out.println("ID Doctor:  "+id);
    }
}
