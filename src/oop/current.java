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
public class current {
    public void current(){
        boolean cLoop = true;
        //============================
        do{
            Scanner cScan = new Scanner (System.in);
            System.out.println
            ( "\n\n"
            + "=============================\n"
            + "   Edit Inventory\n"
            + "=============================\n"
            + "Category\t\tOperation\t\tQty"
            + "\n"
            + "=============================\n\n"
            + "[1] Mark as complete\n"
            + "[2] Void Order\n"
            + "[4] Return to main menu\n\n"
            );
            System.out.print("Choice  : ");

            int iChoice = cScan.nextInt();

            if(iChoice == 1){
                System.out.println("\nyeet wala pa\n");
            }
            else if(iChoice == 2){
                System.out.println("\n wla parin hahahahha\n");
            }
            else if(iChoice == 4){
                cLoop = false;
            }
            else{
                cLoop = true;
            }
        }while(cLoop == true);
        //==============================
    }
}
