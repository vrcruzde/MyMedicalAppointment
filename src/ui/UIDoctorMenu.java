package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    //Se hace arreglo de solo los doctores que tienen disponible citas o agenda
    public static ArrayList<Doctor>doctorsAvailableAppointments = new ArrayList<>();
    public static void showDoctorMenu(){ //muestra toda la logica de opciones para el doctor
        int response=0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+ UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Schedule appointment");
            System.out.println("0. Logout");

            //leemos la respuesta
            Scanner sc=new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmentMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (response!=0);
    }

    private static void showAddAvailableAppointmentMenu(){
        int response=0;
        do {
            System.out.println();
            System.out.println(":: Add Available Appointment");
            System.out.println(":: Select a Month");

            for (int i = 0; i < 3; i++) {
                int j=i+1;
                System.out.println((j+"."+UIMenu.MONTHS[i]));
            }
            System.out.println("0. Return");

            Scanner sc=new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response > 0 && response < 4){
                //1,2,3 las opciones que tenemos
                int monthSelected = response;
                System.out.println(monthSelected+"."+UIMenu.MONTHS[monthSelected-1]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine(); // sc.nexLine: para obtener los datos

                System.out.println("You date is:  "+date+"\n 1. Correct \n 2. Charge date" );
                int responsDate = Integer.valueOf(sc.nextLine());// para obtener respuesta
                if (responsDate == 2) continue;

                int responseTime = 0;
                String time = "";// variable para recibir la hora que se estara capturando por el doctor
                do {
                    System.out.println("Insert the time available for date: " + date + "[13:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is"+time+"\n1.Correct  \n 2. Change Time");
                    responseTime = Integer.valueOf(sc.nextLine()); // para recibir la respuesta de la hora

                }while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date,time);// Se asigna a nustro doctorLogget la cita o fecha disponible
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);


                }else if (response ==0) {
                showDoctorMenu();
            }
        }while (response !=0);
    }

    //se crea metodo para delegar responsabilidades
    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size()>0
            && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }


}

