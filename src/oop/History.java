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
public class History {
    public void hist(){
        boolean hLoop = true;
        //============================
        do{
            Scanner hScan = new Scanner (System.in);
            System.out.println
            ( "\n\n"
            + "=============================\n"
            + "   Order history\n"
            + "=============================\n"
        //=========================================Contents here
            + "\n"
            + "\n"
            + "\n"
            + "=============================\n"
            + "[4] Return to menu\n\n"
            );
            System.out.print("Choice  : ");

            int iChoice = hScan.nextInt();

            switch (iChoice) {
                case 4:
                    hLoop = false;
                    break;
                default:
                    hLoop = true;
                    break;
            }
        }while(hLoop == true);
        //==============================
    }
}
