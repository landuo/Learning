package design_pattern.factory.method;

public class HorseFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        return new Horse();
    }
}
