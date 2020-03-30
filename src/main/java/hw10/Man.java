package hw10;


public final class Man extends Human  {

    public Man(String name, String surname, long birthDate, int iq) {
        super(name, surname, birthDate, iq);
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





}
