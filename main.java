package com.company.Kontroltöö2;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<Burger, LisaLisand> Menüü = new HashMap<>();
        Burger ChickenBurger = new Burger("Chicken burger", "chicken", 8.20, "white bread");
        LisaLisand lisand1 = new LisaLisand(new Lisand("cheese", 0.50), new Lisand("salad", 0.40),  new Lisand("tomato", 0.30), new Lisand( "mayo", 0.50));

        Burger OldFashionedCheeseburger = new Burger("Old Fashioned Cheeseburger", "beef", 9.00, "white bread");
        LisaLisand lisand2 = new LisaLisand(new Lisand("bacon", 0.90), new Lisand("cucumber", 0.30), new Lisand("onion", 0.30), new Lisand("bacon sauce", 0.50));

        Burger NewYorkBurger = new Burger("New York Burger", "beef", 12.40,"white bread");
        LisaLisand lisand3 = new LisaLisand(new Lisand("ananas", 0.70), new Lisand("tomato", 0.30), new Lisand("cucumber", 0.30), new Lisand("onion", 0.30));

        Menüü.put(ChickenBurger, lisand1);
        Menüü.put(OldFashionedCheeseburger, lisand2);
        Menüü.put(NewYorkBurger, lisand3);

        System.out.println("****  MENÜÜ  ****");
        System.out.println("1. " + ChickenBurger);
        System.out.println("2. " + OldFashionedCheeseburger);
        System.out.println("3. " + NewYorkBurger);

        tellimus telli = new tellimus(Menüü);
        telli.BurgerChoice();
        telli.AdditionChoice();
        telli.finalPrice();

    }
}