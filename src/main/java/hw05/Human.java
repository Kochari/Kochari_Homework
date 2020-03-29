package hw05;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String schedule[][];

    private Pet PetObj = new Pet();


    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;

    }


    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return name;
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
                Arrays.equals(schedule, human.schedule) &&
                Objects.equals(PetObj, human.PetObj);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, PetObj);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
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

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Pet getPetObj() {
        return PetObj;
    }

    public void setPetObj(Pet petObj) {
        PetObj = petObj;
    }

    @Override
    public String toString() {

        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +

                '}';
    }

}
