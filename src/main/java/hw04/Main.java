package hw04;

public class Main {


    public static void main(String[] args) {
// create several families, so that every class uses all the available constructors. Display data about every person.
        Human father = new Human("Vito ", "Karleone");
        Human mother = new Human("Jane ", "Karleone");
        Human youngSon = new Human("Michael", "Karleone", 1998);
        Human son = new Human("Fredo", "Karleone", 1996, father, mother);
        String[] habit = {"eat", "drink", "sleep"};
        Pet pet = new Pet("dog", "Rock", 5, 75, habit);
        Human human = new Human("Michael", "Karleone", 1977, 75, father, mother, pet);
        System.out.println(youngSon.toString());
        System.out.println(son.toString());
        System.out.println(pet.toString());
        System.out.println(human.toString());
        System.out.println(human.feeding.feedPet(false));
        System.out.println(human.pet.trickLevel);
    }
}