package logic;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-15  */

public class SimplePizzaFactory {

    public Pizza createPizza(String type){

        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        if(type.equals("greek")){
            pizza = new GreekPizza();
        }
        if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        if(type.equals("vegie")){
            pizza = new VegiePizza();
        }
        return pizza;
    }
}
