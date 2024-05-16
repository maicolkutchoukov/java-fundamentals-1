package org.learning;

import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero positivo: ");
        int n = scanner.nextInt();
        if (n <= 0){
            System.out.println("Errore, dovevi inserire un numero intero e positivo");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Vai a capo dopo ogni riga
        }

        scanner.close();
    }
}
