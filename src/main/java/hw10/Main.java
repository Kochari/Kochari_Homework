package hw10;

import hw09.Controller.FamilyController;
import hw09.DayOfWeek;
import hw09.Dog;
import hw09.DomesticCat;
import hw09.Human;
import hw09.Man;
import hw09.Pet;
import hw09.Woman;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        FamilyController familyController = new FamilyController();
        Map<DayOfWeek, String> schedule = new HashMap<DayOfWeek, String>();
        schedule.put(DayOfWeek.Monday, "go to courses");
        schedule.put(DayOfWeek.Tuesday, "watch a film");
        schedule.put(DayOfWeek.Wednesday, "go for a walk");
        schedule.put(DayOfWeek.Thursday, "meet with friends");
        schedule.put(DayOfWeek.Friday, "play football");
        schedule.put(DayOfWeek.Saturday, "do not go out");
        schedule.put(DayOfWeek.Sunday, "do home work");


        Set<String> habit = new HashSet<String>();
        habit.add("eat");
        habit.add("drink");
        habit.add("sleep");
        Woman  mother= new Woman("Jane ", "Karleone",1970);
        Man  father= new Man("Vito ", "Karleone",1968);

        Human child = new Human("Connie", "Karleone", 1999);
        Pet dog = new Dog("Rock", 5, 45, habit);



        familyController.createNewFamily(mother, father);
        familyController.adoptChild(familyController.getFamilyById(1), child);
        familyController.bornChild(familyController.getFamilyById(1), "feminine");
        familyController.addPet(0, dog);
        Woman mother2 = new Woman("Bonnie", "Griffin", 1960);
        Man father2 = new Man("Joe", "Swanson", 1961);
        Human child2 = new Human("Kevin", "Swanson", 1991);
        Pet domesticCat = new DomesticCat("Garfield", 11, 71);

        familyController.createNewFamily(mother2, father2);
        familyController.adoptChild(familyController.getFamilyById(2), child2);
        familyController.bornChild(familyController.getFamilyById(2), "masculine");
        familyController.addPet(1, domesticCat);

        familyController.displayAllFamilies();
    }
    }
