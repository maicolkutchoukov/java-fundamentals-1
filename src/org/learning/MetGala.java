package org.learning;

import java.util.Arrays;
import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        String[] persons = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};
        System.out.println(Arrays.toString(persons));
        String userName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Come ti chiami?");
        userName = scanner.nextLine();
        System.out.println(userName);
        boolean flag = false;
        for (String person : persons) {
            if (userName.equals(person)) {
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("Puoi entrare! Buon divertimento :D");
        } else {
            System.out.println("Accesso Negato! Puoi tornare da dove sei venuto.");
        }
        scanner.close();
    }
}
