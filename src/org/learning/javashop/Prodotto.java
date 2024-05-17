package org.learning.javashop;

import java.util.Random;

public class Prodotto {
    // Argomenti
    private int code;
    private String name;
    private String desc;
    private double price;
    private int iva;
    Random rnd = new Random();

    // Costruttore
    Prodotto(String name,String desc, double price){
        code = rnd.nextInt(999999);
        this.name = name;
        this.desc = desc;
        this.price = price;
        iva = 22;
    }

    // Metodi

    public double getFullPrice() {
        return price + ((price / 100) * iva);
    }

    public String getFullName() {
        return getCode() + "-" + name;
    }

    // Getters
    public String getCode() {
        return String.format("%06d", code);
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public int getIva() {
        return iva;
    }
    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
}
