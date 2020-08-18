package factory.method;

public class FactoryMethod {
    public static void main(String[] args) {
        AnimalFarm cattleFarm = new CattleFarm();
        Animal cattle = cattleFarm.newAnimal();
        cattle.bray();

        AnimalFarm horseFarm = new HorseFarm();
        Animal horse = horseFarm.newAnimal();
        horse.bray();
    }
}
