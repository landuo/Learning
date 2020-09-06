package design_pattern.factory.method;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        AnimalFarm cattleFarm = new CattleFarm();
        Animal cattle = cattleFarm.newAnimal();
        cattle.bray();

        AnimalFarm horseFarm = new HorseFarm();
        Animal horse = horseFarm.newAnimal();
        horse.bray();
    }
}
