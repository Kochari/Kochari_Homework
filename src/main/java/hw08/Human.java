package hw08;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private String schedule[][];
    private Human mother;
    private Human father;



    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Human father, Human mother, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.father = father;
        this.mother = mother;
        this.pet = pet;
    }
    public void greetPet() {

        System.out.println("Hello" + getPet().getNickname());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(mother, human.mother) &&
                Objects.equals(father, human.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, pet, mother, father);
    }

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human class was deleted");
    }

    public String getName() {
        return name;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
    @Override
    public String toString() {

        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +

                '}';
    }
}

class Man extends Human implements HumanCreator{
    public void  repairCar( boolean repairCar){
        if (repairCar) {
            System.out.println("Car was repaired");
        } else {
            System.out.println("Car does not repaired");
        }
    }
    @Override
    public void greetPet() {
        super.greetPet();
    }


    @Override
    public Human bornChild(Man childInterface) {
        
return childInterface;
    }
}

class Woman extends Human {
public void makeup(boolean checkMakeup) {

    if (checkMakeup) {
        System.out.println("Woman already made up");
    } else {
        System.out.println("Woman does not make up");
    }
}
    @Override
    public void greetPet() {
        super.greetPet();
    }
}


