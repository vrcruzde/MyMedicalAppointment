public class Patient {
    // atributos
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double wight;
    private double height;
    private String blood;

    // constructor
    Patient (String name, String email){
        this.name = name;
        this.email = email;
        this.wight = 74.0;
        System.out.println(wight + "Kg.");

    }
}
