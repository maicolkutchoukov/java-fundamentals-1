package org.learning.snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2;
        int distance = 0;
        System.out.println("Inserisci la prima stringa: ");
        str1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa: ");
        str2 = scanner.nextLine();


        if (str1.length() != str2.length()) {
            System.out.println("Le stringhe devono avere la stessa lunghezza.");
            return;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    distance++;
                }
            }

            System.out.println("La distanza di Hamming tra le stringhe è: " + distance);
        }
        scanner.close();
    }
}
