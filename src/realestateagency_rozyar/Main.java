/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestateagency_rozyar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {   

    public static ArrayList<Property> properties = new ArrayList<>();

      public static void main(String[] args){
              Scanner input=new Scanner(System.in);

          
             System.out.println("Welcome To Real Estate Agency:\n1.Adding Properties 2.Selling Properties");
             int op=input.nextInt();
             Property p;

                while (op!=0){
                    switch (op){
                        case 1:
                            System.out.println("Add: 1.Villa 2.Apartment 3.Furniture Apartment");
                            int proT=input.nextInt();
                            switch(proT){
                                case 1:
                                 p= new Villa();
                                 p.inputAdd();
                                 p.toString(); 
                                 properties.add(p);
                                 System.out.println("Property added successfully!");
                                 break;
                                 
                                 
                                case 2:
                                p=new Apartment();
                                p.inputAdd();
                                p.toString(); 
                                properties.add(p);
                                System.out.println("Property added successfully!");
                                break;
                                
                                case 3:
                                p=new FurnishedAppartment();
                                p.inputAdd();
                                p.toString(); 
                                properties.add(p);
                                System.out.println("Property added successfully!");
                                break;
                                
                                default:
                                    System.out.println("Invalid");
                                    return;
                    }
       
        break;
                        case 2:
                            System.out.println("Enter the Property Type you wanna sell: 1.Villa 2.Apartment 3.Furnished Apartment");
                            int type=input.nextInt();
                            switch (type){
                                case 1:
                                   Villa v= new Villa();
                                   v.display( properties );
                                   remove();
                                   break;
                                case 2:
                                  Apartment a=new Apartment();
                                  a.display(properties); 
                                   remove();
                                   break;
                                case 3:
                                FurnishedAppartment f=new FurnishedAppartment();
                                 f.display(properties); 
                                   remove();
                                   break;     
                            }
                       
                         break;
           
        } 
            System.out.println("1.Adding Properties 2.Selling Properties 0.Stop");
            op=input.nextInt();
      }
}
      
      public static void remove(){
              Scanner input=new Scanner(System.in);

                System.out.println("Enter index to remove:");
                int index = input.nextInt();
                if (index >= 0 && index < properties.size()) {
                properties.remove(index);
                System.out.println("Property removed successfully!");
                      } else {
                System.out.println("Invalid index.");
                     }
          
      }
    
}
