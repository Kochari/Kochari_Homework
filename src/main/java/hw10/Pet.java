package hw10;



import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    Pet pet;
    Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set habits;


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
                Objects.equals(habits, pet1.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pet, species, nickname, age, trickLevel, habits);
    }

    public Pet(String nickname, int age, int trickLevel, Set habit) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habit;
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
        return "Pet{" + ", nickname=" + nickname + '\'' + ", age=" + age + ", trickLevel=" + trickLevel + ", habits=" + habits + '\'' + '}';
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

    public Set getHabits() {
        return habits;
    }


    protected abstract void setSpecies(Species dog);
}

