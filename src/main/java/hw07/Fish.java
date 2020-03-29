package hw07;

public class Fish extends Pet {
    public Fish(String nickname, int age, int trickLevel, String habits[]) {
        super(nickname, age, trickLevel, habits);
        this.setSpecies(Species.FISH);
    }

    @Override
    void respond(String nickname) {
        System.out.printf("Hello, owner. I am %s and I can swim", nickname);
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    protected void setSpecies(Species fish) {
    }
}
