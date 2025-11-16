/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vivaquestion5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Biyun
 */
public class VivaQuestion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        String name="";
        String performance="";
        double distance,fuelUsed,efficiency;
        int type,tip;
        
        while(true){
            System.out.print("Enter spacecraft name: ");
            name=sc.nextLine();
            if(name.equalsIgnoreCase("STOP")){
                break;
            }
            do{
                System.out.print("\nEnter distance traveled(km): ");
                distance=sc.nextDouble();
                if(distance<=0){
                    System.out.println("Invalid input! Distance and fuel must be positive numbers.");
                }
            }while(distance<=0);
            
            do{
                System.out.print("\nEnter fuel used(liters):");
                fuelUsed=sc.nextDouble();
                if(fuelUsed<=0){
                    System.out.println("Invalid input! Distance and fuel must be positive numbers.");
                }
            }while(fuelUsed<=0);
            
            System.out.print("\nSelect spacecraft type(1-Rocket, 2-Shuttle, 3-Probe): ");
            type=sc.nextInt();
            sc.nextLine();//consume new line
            
            efficiency = distance/fuelUsed;
            
            if(efficiency>10){
                performance="Outstanding performance! Minimal fuel usage.";
            }else if(efficiency>=5 && efficiency<=10){
                performance="Good performance! Efficient mission.";
            }else{
                performance="Needs improvement! High fuel consumption.";
            }
            
            System.out.println("");
            System.out.println("Spacecraft:"+name);
            System.out.print("Type:");
            switch(type){
                case 1: System.out.println("Rocket");
                        break;
                case 2: System.out.println("Shuttle");
                        break;
                case 3: System.out.println("Probe");
                        break;
                default: System.out.println("Unknown type");
            }
            System.out.printf("Fuel Efficiency: %.2fkm/l\n",efficiency);
            System.out.println("Performance: "+performance);
            System.out.print("Mission Tip: ");
            tip=rand.nextInt(5);
            switch(tip){
                case 0: System.out.println("Always monitor fuel ratios before takeoff!");  
                        break;
                case 1: System.out.println("Perform routine system checks regularly.");
                        break;
                case 2: System.out.println("Avoid unnecessary thruster burns to save fuel.");
                        break;
                case 3: System.out.println("Maintain optimal speed to maximize fuel efficiency.");
                        break;
                case 4: System.out.println("Check navigation routes to minimize fuel waste.");
                        break;
            }System.out.println("");
                    
 
        }
        
        // TODO code application logic here
    }
    
}

