package org.learning.javabank;

import java.util.Random;

public class Conto {
    // Attributi
    private int accountNum;
    private String ownerName;
    private double balance;
    Random r = new Random();
    // Costruttore
    Conto(String ownerName) {
        this.ownerName = ownerName;
        this.accountNum = r.nextInt(1000) + 1;
        balance = 0;
    }

    // Metodi

    public String deposit(double money) {
       balance = balance + money;
       return "Hai depositato " + money + " il tuo saldo adesso è " + balance;
    }

    public String withdraw(double money) {
        if (balance - money < 0) {
            return "La somma non può essere prelevata il tuo saldo è " + balance;
        } else {
            balance = balance - money;
            return "Hai prelevato " + money + " il tuo saldo adesso è " + balance;
        }
    }

    // Getter
    public int getAccountNum() {
        return accountNum;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance(){
        return balance;
    }

    // Setter
    public void setOwnerName(String name){
        ownerName = name;
    }
}
