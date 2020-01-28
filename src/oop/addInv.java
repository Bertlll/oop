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
    public void addInv(){
            Menu    m = new Menu();
            Scanner scan_add= new Scanner(System.in);
//            public static Scanner scan_add= new Scanner(System.in);
            //bakit public static kung di naman talaga need????? 
            Item z= new Item();
            boolean addLoop=true;
        
        do{


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
                addLoop=false;
                break;
            }
        }while(addLoop==true);        
    }
}
