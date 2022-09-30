public class Patient extends User{
    // atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    // constructor, se encarga de definir los parametros obligatorios
    //para que el objeto exista
     Patient(String name, String email){
         super(name,email);
     }

    //METODOS GET Y SET
    //me validan todo dato que se quiera asignar
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height + "Mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Age:  "+birthday+"  Weight: "+getWeight()+
                                "  Height:  "+ getHeight()+"  Blood: "+getBlood();
    }
}
