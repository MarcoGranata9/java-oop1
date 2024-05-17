package org.learning.javabank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String name = scanner.nextLine();

        Conto myAccount = new Conto(name);
        System.out.println(myAccount.getOwnerName());

        int option = 0;

        while (option != 3) {
            System.out.println("*********************");
            System.out.println("Per prelevare digita 1");
            System.out.println("Per depositare digita 2");
            System.out.println("Per uscire digita 3");

            option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {
                System.out.println("Quanto vuoi prelevare?");
                double myWhit = Double.parseDouble(scanner.nextLine());
                System.out.println(myAccount.withdraw(myWhit));

            }

            if (option == 2) {
                System.out.println("Quanto vuoi depositare?");
                double myDeposit = Double.parseDouble(scanner.nextLine());
                System.out.println(myAccount.deposit(myDeposit));
            }

            if (option == 3) {
                System.out.println("Arrivederci!");
            }
        }

        scanner.close();
    }
}
