/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestateagency_rozyar;

import java.util.ArrayList;
import java.util.Scanner;

public class Property {
    Scanner input=new Scanner(System.in);
    
    
    private double area;
    private int noR;
    private String nn;
    private double price;
    
    
    public Property(){}   
    public Property(double area, int noR, String nn, double price) {}   
    public static ArrayList<Property> properties = new ArrayList<>();
    
    public void inputAdd(){
        
        if (properties.size() >= 100) {
        System.out.println("Cannot add more properties. Maximum capacity reached.");
        return;                         }
                        
                        System.out.print("Enter the Area: ");
                         int a=input.nextInt();    
                         this.area = a;

                        System.out.print("Enter the no.Rooms: ");
                         int noRoom=input.nextInt();  
                         this.noR = noRoom;

                        System.out.print("Enter the Neighborhood Name: ");
                        String namen=input.next();   
                        this.nn = namen;

                        System.out.print("Enter the price: ");
                        double price=input.nextDouble();
                        this.price = price;
                         
    }  
    
  
    public void display() {
        System.out.println("Area: " + area + " m^2");
        System.out.println("No. Rooms: " + noR);
        System.out.println("Neighborhood Name: " + nn);
        System.out.println("Price: $" + price);
    }
    
    public Object row() {
        
    String row="Area: " +area + " Neighborhood: " + nn + ", Price: " + price + ", Rooms: " + noR;
    return row;
    
    }
    
    

}



     


    
    
    
    

