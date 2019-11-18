package factorypattern.extendedpizza;

import factorypattern.*;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("cutting the pizza into diagonal slices");
    }
    void box(){
        System.out.println("place pizza in official pizzastore box");
    }
    void setName(String name){
        this.name=name;
    }
    public  String getName(){
        return name;
    }
    public String toString(){
        return "";
    }
}
