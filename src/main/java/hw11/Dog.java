package hw11;


import java.util.Set;

public class Dog extends Pet {


    public Dog(String nickname, int age, int trickLevel, Set habit) {
        super(nickname, age, trickLevel, habit);
        this.setSpecies(Species.DOG);
    }

    public Dog(String nickname, int age, int trickLevel) {
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