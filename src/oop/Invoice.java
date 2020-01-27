/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Albert Zedrick Dela
 */
public class Invoice {
    String date;
    double discount;
    String id;
    double paid;
    double payable;
    double returned;
    double total;
    double vat;
    
    //getters setters

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getPayable() {
        return payable;
    }

    public void setPayable(double payable) {
        this.payable = payable;
    }

    public double getReturned() {
        return returned;
    }

    public void setReturned(double returned) {
        this.returned = returned;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }
    
    //constructors

    public Invoice(String date, double discount, String id, double paid, double payable, double returned, double total, double vat) {
        this.date = date;
        this.discount = discount;
        this.id = id;
        this.paid = paid;
        this.payable = payable;
        this.returned = returned;
        this.total = total;
        this.vat = vat;
    }
    
}
