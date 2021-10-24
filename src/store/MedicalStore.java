package store;

import java.util.Scanner;

public class MedicalStore {
	    
	    public static void main(String[] args) {
	        // TODO code application logic here

	      
	        Scanner i = new Scanner(System.in);
	        Scanner s = new Scanner(System.in);
	        Scanner ss = new Scanner(System.in);
	        
	        System.out.println("...Welcome To Medical Store...");
	        
	        System.out.println("Please Select the Type of Patient: ");
	        
	        System.out.println("For Covid Enter 1"
	                + "\n For Diaetes Enter 2"
	                + "\n For Heart Patients Enter 3");
	        
	        int type = i.nextInt();
	        
	        if(type==1){
	        
	            System.out.println("How Many Medicines Needed?");
	            int num = i.nextInt();
	            
	            for(int j=0; j<num; j++){
	            
	            
	                System.out.println("Enter ID: ");
	                
	                int id = i.nextInt();
	            
	                System.out.println("Enter Tablet Name: ");
	            
	            
	                String name = s.nextLine();
	            
	                
	                System.out.println("Enter Dose: ");
	            
	                String dose = s.nextLine();
	                
	                System.out.println("Enter Number Of Tablets: ");
	                
	                int no = i.nextInt();
	                
	                System.out.println("Enter Price Per Tablet: ");
	                
	                double price =  s.nextDouble();
	            
	            
	                System.out.println("Patient Name:");
	                
	                String pat_Name = ss.nextLine();
	                
	                System.out.println("Patient Email: ");
	                
	                String email = ss.nextLine();
	                
	                System.out.println("Enter Instructions: ");
	                
	                String ins = ss.nextLine();
	                
	                    Patient patient = new Patient();
	                patient.setName(pat_Name);
	                patient.setEmail(email);
	                
	                Covid_Patients covid = new Covid_Patients(ins,name,id,dose,no,price,patient);
	                
	                covid.NumberOfMedicines(no);
	                
	                System.out.println("Total Bill is: "+covid.Observe_Total_Bill(price, no));
	                
	                covid.Display_Stock_Factory_Info();
	                
	            
	            }
	            
	            
	        }
	        else if(type==2){
	           
	             System.out.println("How Many Medicines Needed?");
	            int num = i.nextInt();
	            
	            for(int j=0; j<num; j++){
	            
	            
	                System.out.println("Enter ID: ");
	                
	                int id = i.nextInt();
	            
	                System.out.println("Enter Tablet Name: ");
	            
	            
	                String name = s.nextLine();
	             
	                System.out.println("Enter Dose: ");
	            
	                String dose = s.nextLine();
	                
	                System.out.println("Enter Number Of Tablets: ");
	                
	                int no = i.nextInt();
	                
	                System.out.println("Enter Price Per Tablet: ");
	                
	                double price =  s.nextDouble();
	            
	            
	                System.out.println("Patient Name:");
	                
	                String pat_Name = ss.nextLine();
	                
	                System.out.println("Patient Email: ");
	                
	                String email = ss.nextLine();
	                
	                System.out.println("Enter Instructions: ");
	                
	                String ins = ss.nextLine();
	                
	                    Patient patient = new Patient();
	                patient.setName(pat_Name);
	                patient.setEmail(email);
	                
	                Diabetes_Patients Diabetes = new Diabetes_Patients(ins,name,id,dose,no,patient,price);
	                
	                
	                Diabetes.NumberOfMedicines(no);
	                
	                System.out.println("Total Bill is: "+Diabetes.Observe_Total_Bill(price, no));
	                
	                
	                Diabetes.Display_Stock_Factory_Info();
	            
	            }
	            
	            
	            
	        }
	        else if(type==3){
	            System.out.println("How Many Medicines Needed?");
	            int num = i.nextInt();
	            
	            for(int j=0; j<num; j++){
	            
	            
	                System.out.println("Enter ID: ");
	                
	                int id = i.nextInt();
	            
	                System.out.println("Enter Tablet Name: ");
	            
	            
	                String name = s.nextLine();
	            
	            
	                System.out.println("Enter Dose: ");
	            
	                String dose = s.nextLine();
	                
	                System.out.println("Enter Number Of Tablets: ");
	                
	                int no = i.nextInt();
	                
	                System.out.println("Enter Price Per Tablet: ");
	                
	                double price =  s.nextDouble();
	            
	            
	                System.out.println("Patient Name:");
	                
	                String pat_Name = ss.nextLine();
	                
	                System.out.println("Patient Email: ");
	                
	                String email = ss.nextLine();
	                
	                System.out.println("Enter Instructions: ");
	                
	                String ins = ss.nextLine();
	                
	                    Patient patient = new Patient();
	                patient.setName(pat_Name);
	                patient.setEmail(email);
	                
	                For_Heart_Patients For_Heart = new For_Heart_Patients(ins,name,id,dose,no,patient,price);
	                
	                For_Heart.NumberOfMedicines(no);
	                
	                System.out.println("Total Bill is: "+For_Heart.Observe_Total_Bill(price, no));
	                For_Heart.Display_Stock_Factory_Info();
	             
	                
	                
	            
	            }
	        }
	        
	        

	    }
	    
}
