package org.learning;

import java.util.Arrays;

public class FavoriteFood {
    public static void main(String[] args) {
        String[] favoriteFoods = {"Carbonara", "Pizza", "Bistecca", "Torta", "Amatriciana", "Gricia"};
        System.out.println(Arrays.toString(favoriteFoods));
        System.out.println("I tuoi cibi preferiti sono: " + favoriteFoods.length);
        System.out.println("Quello che preferisci di più è: " + favoriteFoods[0]);
        System.out.println("Quello che preferisci di meno è: " + favoriteFoods[favoriteFoods.length - 1]);
        System.out.println("Quello intermedio è: " + favoriteFoods[favoriteFoods.length / 2 ]);
    }
}
