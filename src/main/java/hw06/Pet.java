package hw06;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    public String nickname;
    private Species species;
    private int age;
    private int trickLevel;
    private String habits[];

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                Objects.equals(nickname, pet.nickname) &&
                species == pet.species &&
                Arrays.equals(habits, pet.habits);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(nickname, species, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String habits[]) {

        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {
    }
    public void describePet(int trickLevel, String species, int age) {
        if (trickLevel > 50) {
            System.out.println("I have a" + species + " he is" + age + " years old, he is" + "very sly");

        } else {
            System.out.println("I have a" + species + " he is" + age + " years old, he is" + "almost not sly");
        }

    }
    public void greetPet() {

        System.out.println("Hello" + this.nickname);
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

    public Species getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println(" successfully garbage collected");
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }


}
