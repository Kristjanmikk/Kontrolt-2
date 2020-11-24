package com.company.Kontroltöö2;

import java.util.HashMap;
import java.util.Map;

class HeaBurger {      
  public void HeaBurks() {                     
    System.out.println("Kristjani burgerid on parimad!");
  }
}
public class main extends HeaBurger{
    public static void main(String[] args) {
        Map<Burger, LisaLisand> Menüü = new HashMap<>();
        Burger ChickenBurger = new Burger("Chicken burger", "kana", 4.25, "valge sai");
        LisaLisand lisand1 = new LisaLisand(new Lisand("juust", 0.40), new Lisand("salat", 0.40),  new Lisand("tomat", 0.20), new Lisand( "majonees", 0.34));

        Burger OldFashionedCheeseburger = new Burger("Old Fashioned Cheeseburger", "Looma liha", 5.99, "Valge sai");
        LisaLisand lisand2 = new LisaLisand(new Lisand("Peekon", 0.69), new Lisand("sibul", 0.15), new Lisand("kurk", 0.20), new Lisand("vürtsikas kaste", 0.50));

        Burger NewYorkBurger = new Burger("New York Burger", "Looma liha", 8.99,"Valge sai");
        LisaLisand lisand3 = new LisaLisand(new Lisand("redis", 0.30), new Lisand("hapukurk", 0.30), new Lisand("Peekon", 0.60), new Lisand("Seened", 0.32));

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
        
        ChickenBurger.HeaBurks();
    }
}
