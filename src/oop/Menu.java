/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Patricia
 */
public class Menu {
    public void printMenu(){
        System.out.println
        ( "\n\n"
        + "=============================\n"
        + "Construction Supply Inventory\n"
        + "=============================\n"
        + "[1] Edit Inventory\n"
        + "[2] Current Order Status\n"
        + "[3] History\n"
        + "=============================\n"
        + "[4] Exit system\n\n"
        );
        System.out.print("Choice  : ");
    }
    
    //???????? so irurun yung buong menu 50 times?? -- Bert
    public void editInventory(){
        System.out.println
        ( "=============================\n"
        + "       Edit Inventory        \n"
        + "=============================\n"
        + "[1] View\n"
        + "[2] Add items\n"
        + "[3] Remove/Reduce items\n"
        + "\n[4] Return to previous menu\n"
        + "=============================\n"
        );
        System.out.print("Choice  : ");         
    }
    
    public void addItems(){
        System.out.println
        ( "=============================\n"
        + "         Add Items           \n"
        + "=============================\n"
        + "[1] Concrete\n"
        + "[2] Steel\n"
        + "[3] Lumber\n"
        + "\n[4] Return to previous menu\n"
        + "=============================\n"
        );
        System.out.print("Choice  : ");
    }
    
    public void reduceItems() {
        System.out.println
        ( "=============================\n"
        + "     Remove/Reduce Items     \n"
        + "=============================\n"
        + "[1] Concrete\n"
        + "[2] Steel\n"
        + "[3] Lumber\n"
        + "\n[4] Return to previous menu\n"
        + "=============================\n"
        + "Choice: ");
    }
}
