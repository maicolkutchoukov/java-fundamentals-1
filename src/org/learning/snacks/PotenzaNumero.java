package org.learning.snacks;

import java.util.Scanner;

public class PotenzaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, esp, result;
        System.out.println("Inserisci il numero: ");
        n = scanner.nextInt();
        System.out.println("Inserisci la potenza: ");
        esp = scanner.nextInt();
        result = n;
        if (esp == 0){
            result = 1;
            System.out.println("La potenza del numero richiesto è di: " + result);
        } else if(esp < 0){
            System.out.println("La potenza deve essere positiva");
        } else {
            for (int i = 1; i < esp; i++) {
                result *= n;
            }
            System.out.println("La potenza del numero richiesto è di: " + result);

        }
        scanner.close();
    }
}
