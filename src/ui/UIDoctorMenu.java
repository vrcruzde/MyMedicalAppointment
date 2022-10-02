package ui;

import java.util.Scanner;

public class UIDoctorMenu {

    public static void showDoctorMenu(){ //muestra toda la logica de opciones para el doctor
        int response=0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+ UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Schedule appointment");
            System.out.println("0. Logout");

            Scanner sc=new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (response!=0)
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
                System.out.println(monthSelected+"."+UIMenu.MONTHS[monthSelected]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine(); // sc.nexLine: para obtener los datos

                System.out.println("You date is:  "+date+"\n 1. Correct \n 2. Charge date" );

            } else if (response ==0) {
                showDoctorMenu();
            }
        }while (response !=0);
    }
}
