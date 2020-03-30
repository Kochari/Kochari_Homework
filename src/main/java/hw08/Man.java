package hw08;


final class Man extends Human implements HumanCreator {


    public Man(String vito_, String karleone, int i) {
    }

    public void repairCar(boolean repairCar) {
        if (repairCar) {
            System.out.println("Car was repaired");
        } else {
            System.out.println("Car does not repaired");
        }
    }

    @Override
    public void greetPet() {
        super.greetPet();
    }


    @Override
    public Human bornChild(Man childInterface) {

        return childInterface;
    }
}
