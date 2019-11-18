package factorypattern;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-18  */
public class NYPizzaIngredientFactory  implements PizzaIngredientFactory{

    public Dough createDough(){
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPeperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

}
