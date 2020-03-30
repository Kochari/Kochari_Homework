package hw08;


final class Woman extends Human {


    public Woman(String vito_, String karleone, int i) {
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
