package com.constructor;

/**
 * Created by Phong on 5/20/15.
 */
public class Product {

    private String name  = "" ;
    private int id  = 0 ;
    
    public Product(String name)
    {
     setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
