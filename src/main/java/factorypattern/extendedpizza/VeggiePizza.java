package factorypattern.extendedpizza;

import factorypattern.PizzaIngredientFactory;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;
    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {

        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
