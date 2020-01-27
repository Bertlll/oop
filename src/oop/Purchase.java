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
public class Purchase extends Product{
    String date;
    long id;
    double price;
    Product product = new Product();
    double quantity;
    double total;
    
    //getters setters

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    //constructors

    public Purchase(String date, long id, double price, double quantity, double total) {
        this.date = date;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }
    
}
