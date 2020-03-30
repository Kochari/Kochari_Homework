package hw09;


import hw08.HumanCreator;

public final class Man extends Human  {
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





}
