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
public class Category {
    private String description ;
    private long id;
    private String type;

    Category() {
  
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Category(String description, long id, String type) {
        this.description = description;
        this.id = id;
        this.type = type;
    }
    
    
}
