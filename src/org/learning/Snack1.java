package org.learning;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lato1, lato2, lato3;
        System.out.println("Inserisci la lunghezza del primo lato:");
        lato1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci la lunghezza del secondo lato:");
        lato2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci la lunghezza del terzo lato:");
        lato3 = Integer.parseInt(scanner.nextLine());
        System.out.println(lato1);
        System.out.println(lato2);
        System.out.println(lato3);
        if (lato1 < lato2 + lato3 && lato2 < lato3 + lato1 && lato3 < lato1 + lato2){
            System.out.println("Puoi costruire un triangolo");
        } else {
            System.out.println("Non puoi costruire un triangolo");
        }

    }
}
