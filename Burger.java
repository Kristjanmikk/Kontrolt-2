package com.company.Kontroltöö2;
import java.util.ArrayList;

public class Burger {
    private String Nimetus;
    private String Liha;
    private String SaiaTüüp;
    private double Hind;
    private int id;
    private ArrayList<String> lisa = new ArrayList<String>(4);
    private double total;


    public Burger(String name, String meat, String bread, double price, int id) {
        this.Nimetus = name;
        this.Liha = meat;
        this.SaiaTüüp = bread;
        this.Hind = price;
        this.id = id;
    }

    public void Lisand(String lisand){
        if(this.Nimetus.equals(" Chicken Burger ")) {
            if (lisand == "juust") {
                this.Hind = this.Hind + 2;
                this.lisa.add("juust");
            }
            if (lisand == "salat") {
                this.Hind = this.Hind + 1;
                this.lisa.add("salat");
            }
            if (lisand == "tomat") {
                this.Hind = this.Hind + 1;
                this.lisa.add("tomat");
            }
            if (lisand == "maionees") {
                this.Hind = this.Hind + 3;
                this.lisa.add("maionees");
            }
        }
        if(this.Nimetus.equals(" Old Fashioned Cheeseburger ")) {
            if (lisand == "peekon") {
                this.Hind = this.Hind + 2;
                this.lisa.add("peekon");
            }
            if (lisand == "kurk") {
                this.Hind = this.Hind + 1;
                this.lisa.add("kurk");
            }
            if (lisand == "sibul") {
                this.Hind = this.Hind + 1;
                this.lisa.add("sibul");
            }
            if (lisand == "peekonikaste") {
                this.Hind = this.Hind + 3;
                this.lisa.add("peekonikaste");
            }
        }
        if(this.Nimetus.equals(" New York Burger ")) {
            if (lisand == "ananass") {
                this.Hind = this.Hind + 4;
                this.lisa.add("ananass");
            }
            if (lisand == "tomat") {
                this.Hind = this.Hind + 1;
                this.lisa.add("tomat");
            }
            if (lisand == "sibul") {
                this.Hind = this.Hind + 2;
                this.lisa.add("sibul");
            }
            if (lisand == "kurk") {
                this.Hind = this.Hind + 3;
                this.lisa.add("kurk");
            }
        }
        }

    public String toString(){

        return "Teie burger: " + this.Nimetus + "liha: " + this.Liha + "Saiatüüp: " + this.SaiaTüüp + "  Hind: " + this.Hind + "  teie lisandid: " + this.lisa;
    }

    public void sum(){

        this.total = this.Hind + this.total;
    }

}
