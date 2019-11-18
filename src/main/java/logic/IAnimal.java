package logic;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-15  */

interface IAnimal {

    void Speak();

}

class Duck implements IAnimal
{

    public void Speak() {
        System.out.println("Duck says Pack-pack");
    }
}
class Tiger implements IAnimal
{

    public void Speak() {
        System.out.println("Tiger says: Halum..Halum");
    }
}

abstract class IAnimalFactory{
    public abstract IAnimal
    GetAnimalType(String type) throws Exception;
}

class ConcreteFactory extends IAnimalFactory
{

    @Override
    public IAnimal GetAnimalType(String type) throws Exception {

        switch (type){
            case "Duck":
                return new Duck();
            case "Tiger":
                return new Tiger();
                default:
                    throw new Exception("Animal type : "+type+" can not be instantiated");
        }
    }
}

class FactoryPatternEx
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("**** factory pattern demo\n");
        IAnimalFactory animalFactory=new ConcreteFactory();
        IAnimal duckType = animalFactory.GetAnimalType("Duck");
        duckType.Speak();

        IAnimal tigerType = animalFactory.GetAnimalType("Tiger");
        tigerType.Speak();

        IAnimal lionType = animalFactory.GetAnimalType("Lion");
        lionType.Speak();
    }
}
