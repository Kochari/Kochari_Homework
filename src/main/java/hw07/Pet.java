package hw07;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String habits[];


    public Pet(String nickname, int age, int trickLevel, String habits[]) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String nickname) {

        this.nickname = nickname;
    }

    public Pet() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                species == pet.species &&
                Objects.equals(nickname, pet.nickname) &&
                Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    public void describePet(int trickLevel, String species, int age) {
        if (trickLevel > 50) {
            System.out.println("I have a" + species + " he is" + age + " years old, he is" + "very sly");

        } else {
            System.out.println("I have a" + species + " he is" + age + " years old, he is" + "almost not sly");
        }
    }

    abstract void respond(String nickname);

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public String toString() {
        return "Pet{" + ", nickname=" + nickname + '\'' + ", age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + '\'' + '}';
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pet class was deleted");
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }



    protected abstract void setSpecies(Species dog);


}

