package hw04;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String schedule[][];
    Pet feeding = new Pet();


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

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void greetPet() {
        System.out.println("Hello" + pet.nickname);
    }


    public void describePet(int trickLevel, String species, int age) {
        if (trickLevel > 50) {
            System.out.println("I have a" + species + " he is" + age + " years old, he is" + "very sly");
        } else {
            System.out.println("I have a" + species + " he is" + age + " years old, he is" + "almost not sly");
        }
    }

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                '}';
    }


}
