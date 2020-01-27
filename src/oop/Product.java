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
public class Product extends Category{
    Category category = new Category();
    String description;
    long id;
    double price;
    String productName;
    double quantity;

    
    
    //Getters Setters
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    //Contructor
    public Product(String description, long id, double price, String productName, double quantity) {
        this.description = description;
        this.id = id;
        this.price = price;
        this.productName = productName;
        this.quantity = quantity;
    }
    
    Product() {       
    }
}
