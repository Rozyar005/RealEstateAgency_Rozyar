/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestateagency_rozyar;

import java.util.ArrayList;
import java.util.Scanner;


public class Apartment extends Property{
public Apartment(){
    super();
}

private int floor;

private boolean parkingLot;






    public Apartment(double area, int noR, String nn, double price, int floor, boolean parkingLot) {
        super(area, noR, nn, price);
        this.floor = floor;
        this.parkingLot = parkingLot;
    }
     @Override
     public void inputAdd(){
         super.inputAdd();
        Scanner input=new Scanner(System.in);
                        System.out.print("Enter the no. of Floor: ");
                        this.floor=input.nextInt();
                        System.out.println("Does it has parking lot? 1.Yes 2.No");
                        int x=input.nextInt();
                          this.parkingLot = (x == 1);
                       toString();

    }
    public void display(ArrayList<Property> properties) {
        System.out.println("Here are the available Apartments:");
          for (int i = 0; i < properties.size(); i++) {
            Object property = properties.get(i);
            Apartment ap = (Apartment) property;
            System.out.println("Index: "+(i+1));
             ap.display();


            if (property instanceof Apartment) {
                super.display();
                System.out.println("Floor: " +floor);
                System.out.println("Parking Lot: " + (parkingLot));
                System.out.println();
            }
        }
    }
    
     @Override
       public Object row() {
         String row=super.toString() + ", Floor:"+floor+"parkingLot: "+parkingLot;
    return row;
       }
}

       

   
   
    
    
    

