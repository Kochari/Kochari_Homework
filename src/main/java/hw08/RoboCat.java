package hw08;

import java.util.Set;

public class RoboCat extends Pet {
    public RoboCat(String nickname, int age, int trickLevel, Set habit) {
        super(nickname, age, trickLevel, habit);
        this.setSpecies(Species.ROBOCAT);
    }

    @Override
    void respond(String nickname) {
        System.out.printf("Hello, owner. I am %s and I play music ", nickname);
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    protected void setSpecies(Species RoboCat) {
    }
}