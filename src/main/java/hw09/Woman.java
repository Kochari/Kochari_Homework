package hw09;


public final class Woman extends Human {
    public Woman(String name, String surname, int year, int i) {
    }
    public Woman(String name, String surname, int year) {
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
