package factorypattern;


import factorypattern.extendedpizza.Pizza;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public class NYPizzaStore  extends PizzaStore{
    public Pizza createPizza(String item){
        if(item.equalsIgnoreCase("cheese")){
            return new NYStyleCheesePizza();
        }
        else if(item.equalsIgnoreCase("veggie")){
            return new NYStyleVegiePizza();
        }
        else if(item.equalsIgnoreCase("clam")){
            return new NYStylePepperoniPizza();
        }
        else return null;
    }

}
