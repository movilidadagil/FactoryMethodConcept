package factorypattern;


/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        name="NY Style Sauce and Cheese Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
