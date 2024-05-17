package org.learning.javashop;

public class Main {
    public static void main(String[] args) {
        Prodotto monitor = new Prodotto("samsung", "schermo", 200);


        monitor.setName("LG");
        monitor.setDesc("monitor");
        monitor.setPrice(100);
        monitor.setIva(25);

        System.out.println(monitor.getCode());
        System.out.println(monitor.getName());
        System.out.println(monitor.getDesc());
        System.out.println(monitor.getPrice());
        System.out.println(monitor.getIva());


        System.out.println(monitor.getFullPrice());
        System.out.println(monitor.getFullName());
    }
}
