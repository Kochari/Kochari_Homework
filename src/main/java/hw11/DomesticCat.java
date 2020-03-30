package hw11;


import java.util.Set;

public class DomesticCat extends Pet {

    public DomesticCat(String nickname, int age, int trickLevel, Set habit) {
        super(nickname, age, trickLevel, habit);
        this.setSpecies(Species.DOMESTICCAT);
    }

    public DomesticCat(String garfield, int i, int i1) {
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
