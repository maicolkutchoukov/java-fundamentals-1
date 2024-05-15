package org.learning;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km, totalPrice, discount, finalPrice;
        int age;
        double kmPrice = 0.21;
        System.out.println("Quanti km devi percorrere? ");
        km = Integer.parseInt(scanner.nextLine());
        System.out.println("Quanti anni hai? ");
        age = Integer.parseInt(scanner.nextLine());
        totalPrice = km * kmPrice;
        if (age < 18){
            discount = totalPrice * 20 / 100;
            finalPrice = totalPrice - discount;
            System.out.println("Sei minorenne e hai diritto al 20% di sconto, il prezzo del biglietto è: " + finalPrice + "$");
        } else if (age > 65) {
            discount = totalPrice * 40 / 100;
            finalPrice = totalPrice - discount;
            System.out.println("Sei over 65 e hai diritto al 40% di sconto, il prezzo del biglietto è: " + finalPrice + "$");

        } else {
            finalPrice = totalPrice;
            System.out.println("Il prezzo del biglietto è: " + finalPrice + "$");
        }

        System.out.println("End");
    }
}
