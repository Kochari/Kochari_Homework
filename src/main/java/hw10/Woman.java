package hw10;


public final class Woman extends Human {

    public Woman(String name, String surname, long birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }

    public void makeup(boolean checkMakeup) {

        if (checkMakeup) {
            System.out.println("Woman already made up");
        } else {
            System.out.println("Woman does not make up");
        }
    }

    @Override
    public void greetPet() {
        super.greetPet();
    }
}
