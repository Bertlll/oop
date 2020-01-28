/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author Albert Zedrick Dela
 */
public class editInv {
    public void editinventory(){
        addInv a = new addInv();
        
        boolean iLoop = true;
        //============================
        do{
            Scanner iScan = new Scanner (System.in);
            System.out.println
            ( "\n\n"
            + "=============================\n"
            + "   Edit Inventory\n"
            + "=============================\n"
            + "[1] View\n"
            + "[2] Add\n"
            + "[3] Reduce\n"
            + "=============================\n"
            + "[4] Return to menu\n\n"
            );
            System.out.print("Choice  : ");

            int iChoice = iScan.nextInt();

            if(iChoice == 1){
                
                System.out.println("\n wla parin hahahahha\n");
            }
            //        
            else if(iChoice == 2){
                a.addInv();
            }
            else if(iChoice == 3){
                System.out.println("\nHi Juless XD\n");
            }
            else if(iChoice == 4){
                iLoop = false;
            }
            else{
                iLoop = true;
            }
        }while(iLoop == true);
        //==============================
    }
}
