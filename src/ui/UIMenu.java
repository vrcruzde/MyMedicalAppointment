package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {
            "Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opcion");

        int response =0;
        do{
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0; // para que el ciclo de vida del bucle se complete
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                case 0:
                    System.out.println("Thanks you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response!=0);
    }
    //metodo que simula autenticacion, que define parametro para
    //saber que tipo es seria int
    private static void authUser(int userType){
        //userType=1 Doctor
        //userType=2 paciente
        //se guarda lista y llenar objetos en arraylist

        ArrayList<Doctor>doctors=new ArrayList<>();
        doctors.add(new Doctor("Alejandro Cruz", "alc@hos.com"));
        doctors.add(new Doctor("Victor Cruz","vcr@cle.com"));
        doctors.add(new Doctor("Ariana Cruz","arc@cle.com"));

        ArrayList<Patient>patients=new ArrayList<>();
        patients.add(new Patient("Deisy Imbachi", "dei@gmail.com"));
        patients.add(new Patient("Carlos Ponse","cpon@hotmail.com"));
        patients.add(new Patient("Julian Roman","jr@gmaik.com"));

        boolean emailCorrect=false;// esta en false porque hasta el momento que haga la verificacion pasa a true
        do {
            System.out.println("Insert your email Ej: a@a.com");
            Scanner sc= new Scanner(System.in);// para recibir los datos digitados
            String email = sc.nextLine(); // para recibir los datos digitados en variable email

            if (userType==1){
                for (Doctor d:doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect=true;
                        //obtener el usuario logeado
                        doctorLogged=d;
                        // showDoctorMenu
                    }
                }
            }
            if (userType==2){
                for (Patient p:patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect=true;
                        patientLogged=p;
                        //showPatientMenu
                    }
                }


            }


        }while (!emailCorrect);

    }

    public static void showPatientMenu(){
        int response =0;
        do{
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response=Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println(":: Book an appointment");// muestra lista de meses 3, que puede un paciente agendar
                    for (int i = 1; i < 3; i++) {
                        System.out.println(i+". "+MONTHS[i]); // nos muestra de 3 en 3 los meses
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response!=0);
    }

}
