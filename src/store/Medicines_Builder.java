package store;

public class Medicines_Builder implements Observer,State,Factory_Store{
    private String name;
    private int id;
    private String dose;
    private Patient patient;
    
    public Medicines_Builder() {
    
    }

    public Medicines_Builder(String name, int id, String dose,Patient patient) {
        this.name = name;
        this.id = id;
        this.dose = dose;
        this.patient = patient;
       
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    @Override
    public  double Observe_Total_Bill(double num, double price){
        return num*price;
    }

    @Override
    public  void Display_Stock_Factory_Info(){
       
        System.out.println("Stock Avialable Yet");
        System.out.println("After 10 Day, Please Order more Inventory");
       
    }

    @Override
    public void NumberOfMedicines(int number){
        number = 1;
        
        System.out.printf("%d Medicines Bought",number);
        
        number++;
        
    }
}
