package design_pattern.factory.method;

public class CattleFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        return new Cattle();
    }

}
