/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestateagency_rozyar;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnishedAppartment extends Property{
    private int quality=0;
    
    public FurnishedAppartment(){
        super();
    }
    
   public FurnishedAppartment(double area, int noR, String nn, double price, int quality) {
        super(area, noR, nn, price);
        this.quality = quality;
    }

    public  void display(ArrayList<Property> properties) {
        System.out.println("Here are the available Furnished Apartments:");
         for (int i = 0; i < properties.size(); i++) {
            Object property = properties.get(i); 
            FurnishedAppartment fa = (FurnishedAppartment) property;
            System.out.println("Index: "+(i+1));
             fa.display();

            if (property instanceof FurnishedAppartment) {
                super.display();
                System.out.println("Quality: " +quality);
                System.out.println();
            }
        }
    }
    
     @Override
     public void inputAdd(){
         super.inputAdd();
        Scanner input=new Scanner(System.in);
                        System.out.print("Rate the Furnished Apartment: ");
                        int quality=input.nextInt();
                        this.quality=quality;
                        
                       toString();

    }
    
    public void input(){
        Scanner input=new Scanner(System.in);
        System.out.print("Rate the quality from 1-5 as 1 best and 5 worst: ");
        int quality=input.nextInt();
        this.quality=quality;


    }
    
     @Override
       public Object row() {
        String row= super.toString() + ", quality:"+quality ;
        return row;
    }
    
}

