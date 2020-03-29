package hw04;

import java.util.Arrays;

public class Pet {

    String species;
    String nickname;
    int age;
    int trickLevel;
    String habits[];


    public Pet(String species, String nickname, int age, int trickLevel, String habits[]) {

        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond(String nickname) {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public String toString() {
        return "Pet{" +
                "species=" + species + '\'' +
                ", nickname=" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) + '\'' +
                '}';
    }
}
