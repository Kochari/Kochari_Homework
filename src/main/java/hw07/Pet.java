package hw07;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    Pet pet;
    Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String habits[];

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet1 = (Pet) o;
        return age == pet1.age &&
                trickLevel == pet1.trickLevel &&
                Objects.equals(pet, pet1.pet) &&
                species == pet1.species &&
                Objects.equals(nickname, pet1.nickname) &&
                Arrays.equals(habits, pet1.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pet, species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

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

    public static class Dog extends Pet {
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

    protected abstract void setSpecies(Species dog);

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

    public class RoboCat extends Pet {
        public RoboCat(String nickname, int age, int trickLevel, String habits[]) {
            super(nickname, age, trickLevel, habits);
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
}

