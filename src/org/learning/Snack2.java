package org.learning;

import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Inserisci il numero compreso tra 1 e 20");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 1 || n > 20);
        for (int i = 1; i <= n; i++) {
            int result = i * i * i;
            System.out.println("Il cubo di " + i + " è " + result);
        }

        scanner.close();
    }
}
