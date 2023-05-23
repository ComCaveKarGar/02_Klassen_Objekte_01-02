package com.cc.java;

public class App {
    
    public static void main(String[] args) {
      
        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable
        
        Cat cat1 = new Cat("Grizabella", "white", 29);
        // output("Blick von aussen: " + cat1);
        // output(cat1.tellYourAddress());


        // Ausgabe über Methoden
        output(cat1.getName());
        output(cat1.getFurColor());
        output(Integer.toString(cat1.getAge()));

        // App.output("hi");
        output("-------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);
        // output("Blick von aussen: " + cat2);
        // output(cat2.tellYourAddress());


        // Ausgabe
        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));

    }
 
    public static void output(String outStr) {
        System.out.println(outStr);
    }



}

