package hw08;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Map<String, String> schedule = new HashMap<String, String>();
        schedule.put(DayOfWeek.Monday.name(), "go to courses");
        schedule.put(DayOfWeek.Tuesday.name(), "watch a film");
        schedule.put(DayOfWeek.Wednesday.name(), "go for a walk");
        schedule.put(DayOfWeek.Thursday.name(), "meet with friends");
        schedule.put(DayOfWeek.Friday.name(), "play football");
        schedule.put(DayOfWeek.Saturday.name(), "do not go out");
        schedule.put(DayOfWeek.Sunday.name(), "do home work");


        Set<String> habit = new HashSet<String>();
        habit.add("eat");
        habit.add("drink");
        habit.add("sleep");
        Human father = new Human("Vito ", "Karleone");
        Human mother = new Human("Jane ", "Karleone");
        Human fredo = new Human("Fredo", "Karleone", 1996);
        Human connie = new Human("Connie", "Karleone", 1999);
        Human michael = new Human("Michael", "Karleone", 1998);

        Pet dog = new Pet.Dog("Rock", 5, 45, habit);
        fredo.setSchedule(schedule);
        Family karleone = new Family(father, mother);
        karleone.addPet(dog);

      karleone.addChild(connie);
      karleone.addChild(michael);


        //   for(Family family : karleone.getAll(karleone)) {
        //     System.out.println(family.getFather().getName());
        //    }


        //   karleone.deleteChild(0);//delete child by index
        // karleone.deleteChild(1);//delete child by index
        // karleone.deleteChild(fredo);//delete child by object
        //  karleone.deleteChild(connie);//delete child by object
        //System.out.println(karleone);
          System.out.println(karleone.countFamily());//count family  member(s)
        for (Family family : karleone.getAll(karleone)) {
            System.out.println(family.getAll(karleone));
        }
    }
}