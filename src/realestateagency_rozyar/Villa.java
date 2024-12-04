/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestateagency_rozyar;

import java.util.ArrayList;
import java.util.Scanner;

public class Villa extends Property {
     private int nas;
     private boolean swimmingPool;
   public Villa() {
         super();
        }
     public Villa(double area, int noR, String nn, double price) {
        super(area, noR, nn, price);
    }

    
     
     
     @Override
     public void inputAdd(){
         super.inputAdd();
        Scanner input=new Scanner(System.in);
                        System.out.print("Enter the no. of Adjacent Streets: ");
                        this.nas=input.nextInt();
                         
                        System.out.println("Does the Villa has Swiiming Pool? 1.Yes 2.No");
                        int x=input.nextInt();
                        this.swimmingPool = (x == 1);  
                       toString();

    }

    public int getNas() {
        return nas;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }
     
     

     public void display(ArrayList<Property> properties) {
        System.out.println("Here are the available Villas:");
        
       for (int i = 0; i < properties.size(); i++) {
            Property property = properties.get(i); 
            if (property instanceof Villa villa) {
                System.out.println("Index: "+(i+1));
                System.out.println("Adjacent Streets: "+villa.getNas());
                System.out.println("Swimming Pool: " + villa.isSwimmingPool());
                System.out.println();
            }
        
    }
       }
     
     @Override
       public Object row() {
           
           String row=super.toString() + ", Swimming Pool: " + swimmingPool+"no. of Adjacent Streets: "+nas;

           return row;
 }
     
     
   
}
      


    

    
    
    

