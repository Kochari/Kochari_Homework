package hw07;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname, int age, int trickLevel, String habits[]) {
        super(nickname, age, trickLevel, habits);
        this.setSpecies(Species.DOMESTICCAT);
    }

    @Override
    void respond(String nickname) {
        System.out.printf("Hello, owner. I am %s and I need more sleep ", nickname);
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    protected void setSpecies(Species dog) {
    }
}
