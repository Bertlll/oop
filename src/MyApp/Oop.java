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
public class Oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean run = true;
        
        //class call=====================
        editInv i = new editInv();
        current c = new current();
        History h = new History();
        Menu    m = new Menu();
        
        do{      
            Scanner scan = new Scanner(System.in);
            m.printMenu();
            int choice = scan.nextInt();
            
            if (choice == 1){
                clearScreen();
                i.editinventory();
            }
            else if (choice == 2){
                clearScreen();
                c.current();
            }
            else if (choice == 3){
                clearScreen();
                h.hist();
                
            }
            else if (choice == 4){
                clearScreen();
                System.out.println
                ("\n\n"
                + "==================\n"
                + "   System End   \n"
                + "==================\n");
                run = false;
            }
        }while( run == true);
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    
}
