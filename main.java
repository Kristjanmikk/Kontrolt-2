package com.company.Kontroltöö2;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Burger ChickenBurger = new Burger("Chicken Burger", "Kanaliha", "Valge sai", 5.50, 1);
        //Burger OldFashionedCheeseburger = new Burger("Old Fashioned Cheeseburger", "Loomaliha", "Valge sai", 7.20, 2);
        //Burger NewYorkBurger = new Burger("New York Burger", "Sealiha", "Teraleib", 6.50, 3);
        ArrayList<String> total = new ArrayList<String>(3);
        ArrayList<String> menu = new ArrayList<String>(3);
        System.out.println("****  MENÜÜ  ****");
        menu.add("1 - Chicken burger - kanalihaga, valge saiaga.");
        menu.add("2 - Old Fashioned Cheeseburger - loomalihaga, valge saiaga.");
        menu.add("3 - New York Burger - sealihaga, teraleivaga.");
        menu.forEach(System.out::println);
        while(true){
            System.out.println("valige oma burger: ");
            Scanner valik = new Scanner(System.in);
            String pass = valik.nextLine();
            if(pass.equals("Chicken burger")){
                Burger ChickenBurger = new Burger(" Chicken Burger ", " Kanaliha ", " Valge sai ", 5.50, 1);
                System.out.println("  ****  " + ChickenBurger);
                while (true){
                    System.out.println("valige oma Lisandid: ");
                    Scanner lis = new Scanner(System.in);
                    String Lisandid = lis.nextLine();

                    if(Lisandid.equals("")){
                        break;
                    }
                    if(Lisandid.equals("salat")){
                        ChickenBurger.Lisand("salat");
                    }
                    if(Lisandid.equals("juust")){
                        ChickenBurger.Lisand("juust");
                    }
                    if(Lisandid.equals("tomat")){
                        ChickenBurger.Lisand("tomat");
                    }
                    if(Lisandid.equals("maionees")){
                        ChickenBurger.Lisand("maionees");
                    }
                }
                System.out.println(ChickenBurger);
                ChickenBurger.sum();
                total.add("Chicken Burger");
            }

            if(pass.equals("Old Fashioned Cheeseburger")){
                Burger OldFashionedCheeseburger = new Burger(" Old Fashioned Cheeseburger ", "Loomaliha ", "Valge sai ", 7.20, 2);
                System.out.println("  ****  " + OldFashionedCheeseburger);
                while (true){
                    System.out.println("valige oma Lisandid: ");
                    Scanner lis = new Scanner(System.in);
                    String Lisandid = lis.nextLine();

                    if(Lisandid.equals("")){
                        break;
                    }
                    if(Lisandid.equals("peekon")){
                        OldFashionedCheeseburger.Lisand("peekon");
                    }
                    if(Lisandid.equals("kurk")){
                        OldFashionedCheeseburger.Lisand("kurk");
                    }
                    if(Lisandid.equals("sibul")){
                        OldFashionedCheeseburger.Lisand("sibul");
                    }
                    if(Lisandid.equals("peekonikaste")){
                        OldFashionedCheeseburger.Lisand("peekonikaste");
                    }
                }
                System.out.println(OldFashionedCheeseburger);
                OldFashionedCheeseburger.sum();
                total.add("Old Fashioned Cheeseburger");
            }

            if(pass.equals("New York Burger")){
                Burger NewYorkBurger = new Burger(" New York Burger ", "Sealiha ", "Teraleib ", 6.50, 3);
                System.out.println("  ****  " + NewYorkBurger);
                while (true){
                    System.out.println("valige oma Lisandid: ");
                    Scanner lis = new Scanner(System.in);
                    String Lisandid = lis.nextLine();

                    if(Lisandid.equals("")){
                        break;
                    }
                    if(Lisandid.equals("ananass")){
                        NewYorkBurger.Lisand("ananass");
                    }
                    if(Lisandid.equals("tomat")){
                        NewYorkBurger.Lisand("tomat");
                    }
                    if(Lisandid.equals("sibul")){
                        NewYorkBurger.Lisand("sibul");
                    }
                    if(Lisandid.equals("kurk")){
                        NewYorkBurger.Lisand("kurk");
                    }
                }
                System.out.println(NewYorkBurger);
                NewYorkBurger.sum();
                total.add("New York Burger");
            }
            if(pass.equals("")){
                System.out.println("**TEIE TELLIMUS**");
                total.forEach(System.out::println);
                //System.out.println("Hind:" + Burger.sum());
                break;
            }
        }
        }



}
