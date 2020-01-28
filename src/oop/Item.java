/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Julianne Catalan
 */
public class Item {
    private String itemtype;
    private int itemcount;
    
    public Item(String itemtype, int itemcount){
        this.itemtype= itemtype;
        this.itemcount= itemcount;
    }

    Item() {
    }

    public String getItemtype() {
        return itemtype;
    }

    public int getItemcount() {
        return itemcount;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public void setItemcount(int itemcount) {
        this.itemcount = itemcount;
    }
    
    
}
