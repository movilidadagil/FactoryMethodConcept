package factorypattern;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("preparing "+name);
        System.out.println("tossing dough...");
        System.out.println("adding sauce...");
        System.out.println("adding toppings: ");
        for(int i=0;i<toppings.size();i++){
            System.out.println("  "+toppings.get(i));
        }
    }
    void bake(){
        System.out.println("bake for 25 minutest at 350");
    }
    void cut(){
        System.out.println("cutting the pizza into diagonal slices");
    }
    void box(){
        System.out.println("place pizza in official pizzastore box");
    }
    public String getName(){
        return name;
    }

}
