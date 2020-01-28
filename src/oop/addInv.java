/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author Julianne Catalan
 */
public class addInv {
    public static Scanner scan_add= new Scanner(System.in);
    Item z= new Item();
  
    public void addInv(){
    
    System.out.println
            ( "\n\n"
            + "=============================\n"
            + "   Add Inventory\n"
            + "=============================\n"
            + "[1] Concrete\n"
            + "[2] Steel\n"
            + "[3] Lumber\n"
            + "=============================\n"
            + "[4] Return to menu\n\n"
            );
    System.out.println("Choice: ");
    int choice=scan_add.nextInt();
    
        if (choice==1) {
            z.setItemtype("Concrete");
            System.out.println("Amount: ");
            z.setItemcount(scan_add.nextInt());
        }
        else if (choice==2) {
            z.setItemtype("Steel");
            System.out.println("Amount: ");
            z.setItemcount(scan_add.nextInt());
        }
        else if (choice==3) {
            z.setItemtype("Lumber");
            System.out.println("Amount: ");
            z.setItemcount(scan_add.nextInt());
        }
        else if (choice==4) {
            
        }
    }
    
}
