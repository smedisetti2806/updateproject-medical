package store;

public class Covid_Patients extends Medicines_Builder{
	   
    private String Instructions;
    private int noOfTablets;
    private double Price_Per_Tablets;

    public Covid_Patients() {
    }

    public Covid_Patients(String Instructions, String name, int id,String dose, int noOfTablets, 
            double Price_Per_Tablets, Patient patient) {
       
        super(name, id, dose, patient);
        this.Instructions = Instructions;
        this.Price_Per_Tablets =  Price_Per_Tablets;
        this.noOfTablets = noOfTablets;
    
    }

    
    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    public int getNoOfTablets() {
        return noOfTablets;
    }

    public void setNoOfTablets(int noOfTablets) {
        this.noOfTablets = noOfTablets;
    }

    public double getPrice_Per_Tablets() {
        return Price_Per_Tablets;
    }

    public void setPrice_Per_Tablets(double Price_Per_Tablets) {
        this.Price_Per_Tablets = Price_Per_Tablets;
    }

    
    
    
   
     @Override
    public  double Observe_Total_Bill(double Price_Per_Tablets, double noOfTablets){
        
        return Price_Per_Tablets*noOfTablets; 
    }


    
    @Override
   public void NumberOfMedicines(int number){
        number = 1;
        
        System.out.printf("%d Medicines Bought",number);
        
        number++;
        
    }
    
}
