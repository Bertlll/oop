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
    Menu    m = new Menu();
    public static Scanner scan_add= new Scanner(System.in);
    Item z= new Item();
  
    public void addInv(){
    
    m.addItems();
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
