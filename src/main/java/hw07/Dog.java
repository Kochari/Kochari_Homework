package hw07;

public  class Dog extends Pet {
    Species species;

    public Dog(String nickname, int age, int trickLevel, String habits[]) {
        super(nickname, age, trickLevel, habits);
        this.setSpecies(Species.DOG);
    }

    @Override
    void respond(String nickname) {
        System.out.printf("Hello, owner. I am %s and I do wooff ", nickname);
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    protected void setSpecies(Species dog) {
    }
}
