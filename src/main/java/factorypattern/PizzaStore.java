package factorypattern;



/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){

        Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return  pizza;
    }
    protected  abstract factorypattern.extendedpizza.Pizza createPizza(String type);
}
