package factorypattern.extendedpizza;

import factorypattern.NYPizzaIngredientFactory;
import factorypattern.PizzaIngredientFactory;
import factorypattern.PizzaStore;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();
        if(item.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            ((CheesePizza) pizza).setName("New York Style Cheese Pizza");
        }
        else if(item.equalsIgnoreCase("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}
